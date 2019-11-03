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
                "`id` int(2) NOT NULL PRIMARY KEY," +
                "`nombre` varchar(15) DEFAULT NULL," +
                "`ubicacion` varchar(15) DEFAULT NULL" +
                ") ENGINE=InnoDB DEFAULT CHARSET=latin1;");
        comandosSQLInicio.add("            CREATE TABLE `empleados` (" +
                "`id` int(2) NOT NULL PRIMARY KEY," +
                "`nombre` varchar(20) DEFAULT NULL," +
                "`oficio` varchar(20) DEFAULT NULL," +
                "`fecha_alta` date DEFAULT NULL," +
                "`salario` double DEFAULT NULL" +
                ") ENGINE=InnoDB DEFAULT CHARSET=latin1;");
    }

    public ArrayList<String> getComandosSQLInicio() {
        return comandosSQLInicio;
    }
    
    
}