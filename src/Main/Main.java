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
        Modelo modelo = new ModeloImpl();
        Vista vista = new VistaImpl();
        Controlador controlador = new ControladorImpl(modelo,vista);
        controlador.iniciar();
//     String url  = "jdbc:mysql://192.168.56.101:3306/empresa?autoReconnect=true&useSSL=true";
//     String user="munchi";
//    String password="linux";
//     Connection conexion = DriverManager.getConnection(url,user,password);

    }
}

/*
  DROP DATABASE IF EXISTS empresa;
            CREATE DATABASE IF NOT EXISTS empresa;
            USE empresa;    
                
            CREATE TABLE `departamentos` (
              `id` int(2) NOT NULL,
              `nombre` varchar(15) DEFAULT NULL,
            `ubicacion` varchar(15) DEFAULT NULL
            ) ENGINE=InnoDB DEFAULT CHARSET=latin1;

            CREATE TABLE `empleados` (
              `id` int(2) NOT NULL,
             `nombre` varchar(20) DEFAULT NULL,
              `oficio` varchar(20) DEFAULT NULL,
              `fecha_alta` date DEFAULT NULL,
              `salario` double DEFAULT NULL
            ) ENGINE=InnoDB DEFAULT CHARSET=latin1;

            ALTER TABLE `departamentos`
              ADD PRIMARY KEY (`id`);

            ALTER TABLE `empleados`
              ADD PRIMARY KEY (`id`);
*/