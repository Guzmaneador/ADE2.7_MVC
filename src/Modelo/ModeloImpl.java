package Modelo;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Guzman
 */
public class ModeloImpl implements Modelo{
    private Connection conexion;
    
    
    public void start() throws SQLException{
        conexion = ConexionMySQL.getConexion();
        
        
        conexion.close();
    }

    
    
    
    
    public void crearDataBase(){
        String sentenciaSQL=
            "DROP DATABASE IF EXISTS empresa;"+
            "CREATE DATABASE IF NOT EXISTS empresa;"+
            "USE empresa;"+    
                
            "CREATE TABLE `departamentos` (" +
            "  `id` int(2) NOT NULL," +
            "  `nombre` varchar(15) DEFAULT NULL," +
            "  `ubicacion` varchar(15) DEFAULT NULL" +
            ") ENGINE=InnoDB DEFAULT CHARSET=latin1;" +

            "CREATE TABLE `empleados` (" +
            "  `id` int(2) NOT NULL," +
            "  `nombre` varchar(20) DEFAULT NULL," +
            "  `oficio` varchar(20) DEFAULT NULL," +
            "  `fecha_alta` date DEFAULT NULL," +
            "  `salario` double DEFAULT NULL" +
            ") ENGINE=InnoDB DEFAULT CHARSET=latin1;" +

            "ALTER TABLE `departamentos`" +
            "  ADD PRIMARY KEY (`id`);" +

            "ALTER TABLE `empleados`" +
            "  ADD PRIMARY KEY (`id`);";
    }
}