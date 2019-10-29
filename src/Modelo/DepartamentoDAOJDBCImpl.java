package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Guzman
 */
public class DepartamentoDAOJDBCImpl {
    private String SQL_INSERT = "INSERT INTO departamentos (id,nombre,ubicacion) VALUES (?,?,?)";
    private String SQL_UPDATE = "UPDATE departamentos SET nombre=? ubicacion=? WHERE id=?";
    private String SQL_DELETE = "DELETE FROM departamentos WHERE id=?";
    private String SQL_SELECT_ALL= "SELECT * FROM departamentos";
    private String SQL_SELECT_ID= "SELECT * FROM departamentos WHERE id=?";
    private Connection miConexion;
    private PreparedStatement miPreparedStatement;
    private ResultSet miResultSet;
    private int filas;
}