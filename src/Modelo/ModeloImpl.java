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
        for (int i = 0; i < comandosSQL.size(); i++) {
//            if (i<=2){
                resultadoUpdate = crearDBTablas.executeUpdate(comandosSQL.get(i));
                System.out.println("->"+i);
                 System.out.println(resultadoUpdate);
//            }else {
//                ResultSet resultadoTablas = crearDBTablas.executeQuery(comandosSQL.get(i));
//                        System.out.println(resultadoTablas);
//            }
        }
        //crearDataBase();
        
        conexion.close();
    }

    
    
    
    
    public void crearDataBase(){
        String comandoUpdateSQL=
            "DROP DATABASE IF EXISTS empresa;"+
            "CREATE DATABASE IF NOT EXISTS empresa;";
        String comandoTablasSQL=
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
            ") ENGINE=InnoDB DEFAULT CHARSET=latin1;";
        String comandoKeySQL=
            "ALTER TABLE `departamentos`" +
            "  ADD PRIMARY KEY (`id`);" +

            "ALTER TABLE `empleados`" +
            "  ADD PRIMARY KEY (`id`);";
        
        try {
            Statement crearDBTablas = conexion.createStatement();
            int resultadoUpdate = crearDBTablas.executeUpdate(comandoUpdateSQL);
                        System.out.println(resultadoUpdate);

            ResultSet resultadoTablas = crearDBTablas.executeQuery(comandoTablasSQL);
                        System.out.println(resultadoTablas);
                        
           int resultadoKey = crearDBTablas.executeUpdate(comandoKeySQL);
                        System.out.println(resultadoKey);

        } catch (SQLException ex) {
            System.out.println("---Error al mandar sentencia de crecion de bd y tablas----");
            Logger.getLogger(ModeloImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}