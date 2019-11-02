package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Guzman
 */
public class ConexionMySQL {
    private static Connection conexion = null;
//    private String url  = "jdbc:mysql://192.168.56.101:3306/empresa?autoReconnect=true&useSSL=true";
//    private String user="munchi";
//    private String password="linux";
    
    private ConexionMySQL() {
            String url  = "jdbc:mysql://192.168.56.101:3306/empresa";
            Properties properties = new Properties();
            properties.setProperty("user","munchi");
            properties.setProperty("password","linux");
            properties.setProperty("useSSL","true");
            properties.setProperty("autoReconnect","true");
            properties.setProperty("noAccessToProcedureBodies","true");
        try {
            conexion = DriverManager.getConnection(url,properties);
            System.out.println("---CONEXION ESTABLECIDA----");

        } catch (SQLException ex) {
            System.out.println("---ERROR EN LA CONEXION A LA BASE DE DATOS----");
            Logger.getLogger(ConexionMySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Connection getConexion() {
        if (conexion == null)
            new ConexionMySQL();
        
        return conexion;
    }

    
    
    
    

}