package Main;

import Controlador.*;
import Modelo.*;
import Vista.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Guzman
 */
public class Main {
    public static void main(String[] args) throws SQLException {
//        Modelo modelo = new ModeloImpl();
//        Vista vista = new VistaImpl();
//        Controlador controlador = new ControladorImpl(modelo,visita);
//        controlador.start();
     String url  = "jdbc:mysql://192.168.56.101:3306/empresa?autoReconnect=true&useSSL=true";
     String user="munchi";
    String password="linux";
     Connection conexion = DriverManager.getConnection(url,user,password);

    }
}