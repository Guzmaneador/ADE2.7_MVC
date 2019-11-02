package Modelo.DepartamentosDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Guzman
 */
public class DepartamentoDAOJDBCImpl implements DepartamentoDAO{
    private final String SQL_INSERT = "INSERT INTO departamentos (id,nombre,ubicacion) VALUES (?,?,?)";
    private final String SQL_UPDATE = "UPDATE departamentos SET nombre=? ubicacion=? WHERE id=?";
    private final String SQL_DELETE = "DELETE FROM departamentos WHERE id=?";
    private final String SQL_SELECT_ALL= "SELECT * FROM departamentos";
    private final String SQL_SELECT_ID= "SELECT * FROM departamentos WHERE id=?";
    private Connection miConexion;
    private PreparedStatement miPreparedStatement;
    private ResultSet miResultSet;
    private int filas;

    public DepartamentoDAOJDBCImpl() {
    }
    
   public int insertar (int id, String nombre, String ubicacion){
       return 2;
   }
   public int actualizar(int id, String nombre, String ubicacion){
       return 2;
   }
    

    @Override
    public String insertar(DepartamentoVO departamento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String borrar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String actualizar(DepartamentoVO departamento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DepartamentoVO listaDepartamentos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DepartamentoVO dameDepartamentoId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}