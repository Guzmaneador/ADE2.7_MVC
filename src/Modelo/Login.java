package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Guzman
 */
public class Login {
    String usuario,contraseña;
    String nif,tipo;
    String SQL_SELECT_EMPLEADOS= "SELECT nombre, tipo FROM empleados";
    String SQL_SELECT_NIF="SELECT nif FROM empleados WHERE id=?";
    String SQL_COMPARE_PASSWORD="SELECT AES_DECRYPT('password', '?') FROM login WHERE nif=?";
    ResultSet resultado ;
    Connection conexion;

    public Login(ArrayList<String> userPass,Connection conexion) throws SQLException {
        this.usuario = userPass.get(0);
        this.contraseña = userPass.get(1);
        this.conexion=conexion;
        analizarDatos();
        
    }
    public void analizarDatos() throws SQLException{
        if(verificarUser()){
            obtenerNif();
            if(compararPassword()){
                System.out.println("--USUARIO LOGEADO--");
            }else{
                System.out.println("Datos Incorrectos2");
            }
        }else{
            System.out.println("Datos incorrectos");
        }
    }
    
    public boolean verificarUser() throws SQLException{
        boolean existe = false;
        Statement  miStatement =conexion.createStatement();
        resultado = miStatement.executeQuery(SQL_SELECT_EMPLEADOS);
        while (resultado.next()){
            if(resultado.getString("nombre").equals(usuario)){
                tipo=resultado.getString("tipo");
                existe=true;
                break;       
            }
        } 
        return existe;    
    }
    public void obtenerNif() throws SQLException{
       PreparedStatement miPreStatment= conexion.prepareCall(SQL_SELECT_NIF);
       miPreStatment.setString(0, usuario);
       resultado=miPreStatment.executeQuery();
       nif=resultado.getString("nif");
    }
    public boolean compararPassword() throws SQLException{
        PreparedStatement miPreStatment= conexion.prepareCall(SQL_SELECT_NIF);
       miPreStatment.setString(0, contraseña);
       miPreStatment.setString(1, nif);
       resultado=miPreStatment.executeQuery();
       return resultado.getBoolean("password");
        
    }

}

