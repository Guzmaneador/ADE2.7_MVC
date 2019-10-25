package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Guzman
 */
public class ConexionMySQL {
    private Connection conexion = null;
    private String url  = "jdbc:mysql://192.168.56.101:3306/empresa?autoReconnect=true&useSSL=true";
    private String user="munchi";
    private String password="linux";
    
    private ConexionMySQL() throws SQLException {
        conexion = DriverManager.getConnection(url,user,password);
    }

    public Connection getConexion() {
        return conexion;
    }

    
    
    
    

}