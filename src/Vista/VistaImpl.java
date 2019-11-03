package Vista;

import java.util.ArrayList;

/**
 *
 * @author Guzman
 */
public class VistaImpl implements Vista{
    ArrayList<String> comandosSQLInicio = new ArrayList<>();

    public VistaImpl() {
        llenarArraySQLInicio();
    }
    
    
    
    private void llenarArraySQLInicio(){
        comandosSQLInicio.add("DROP DATABASE IF EXISTS empresa;");
        comandosSQLInicio.add("CREATE DATABASE IF NOT EXISTS empresa;");
        comandosSQLInicio.add("USE empresa;");
        
        comandosSQLInicio.add("CREATE TABLE `departamentos` (" +
                "`id` MEDIUMINT(9) NOT NULL PRIMARY KEY," +
                "`nombre` varchar(15) DEFAULT NULL," +
                "`ubicacion` varchar(15) DEFAULT NULL" +
                ") ENGINE=InnoDB DEFAULT CHARSET=latin1;");
        comandosSQLInicio.add("CREATE TABLE `empleados` (" +
                "`nif` varchar(9) NOT NULL PRIMARY KEY," +
                "`nombre` varchar(20) DEFAULT NULL," +
                "`tipo` ENUM('Empleado','Administrativo') DEFAULT NULL," +
                "`oficio` varchar(20) DEFAULT NULL," +
                "`fecha_alta` date DEFAULT NULL," +
                "`salario` DECIMAL(6,2) DEFAULT NULL," +
                "`id` MEDIUMINT(9) NOT NULL" +
                ") ENGINE=InnoDB DEFAULT CHARSET=latin1;");
        
        comandosSQLInicio.add("Insert INTO departamentos VALUES ('10','CONTABILIDAD','SEVILLA');");
        comandosSQLInicio.add("Insert INTO departamentos VALUES ('20','INVESTIGACION','MADRID');");
        comandosSQLInicio.add("Insert INTO departamentos VALUES ('30','VENTAS','BARCELONA');");
        comandosSQLInicio.add("Insert INTO departamentos VALUES ('40','PRODUCCION','BILBAO');");
        
        comandosSQLInicio.add("Insert INTO empleados VALUES ('17845789K','Antonio','Empleado','CONTABLE','1996-12-08','1222.56','10');");


    }

    public ArrayList<String> getComandosSQLInicio() {
        return comandosSQLInicio;
    }
    
    
}