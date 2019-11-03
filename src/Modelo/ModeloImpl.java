package Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Guzman
 */
public class ModeloImpl implements Modelo{
    private Connection conexion;
    
    
    public void start(ArrayList<String> comandosSQL) throws SQLException{
        conexion = ConexionMySQL.getConexion();
        
        Statement crearDBTablas = conexion.createStatement();
        int resultadoUpdate;
        for (String comando : comandosSQL) {
                 resultadoUpdate = crearDBTablas.executeUpdate(comando);
                 System.out.println(resultadoUpdate);
        }

        conexion.close();
    }

}