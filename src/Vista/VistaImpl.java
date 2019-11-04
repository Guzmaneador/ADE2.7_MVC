package Vista;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Guzman
 */
public class VistaImpl implements Vista{
    Scanner teclado = new Scanner(System.in);
    ArrayList<String> comandosSQLInicio = new ArrayList<>();

    public VistaImpl() {
        llenarArraySQLInicio();
    }
    
    @Override
    public ArrayList <String>  solicitarLogin(){
        ArrayList <String> userPass= new ArrayList();
        System.out.print("-->Indica tu usuario: ");
        userPass.add(teclado.nextLine());
        System.out.print("-->Introduce tu contrseña: ");
        userPass.add(teclado.nextLine());
        return userPass;
        
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
        comandosSQLInicio.add("CREATE TABLE `login` (" +
                "`nif` varchar(9) NOT NULL," +
                "`password` BLOB NOT NULL" +
                ") ENGINE=InnoDB DEFAULT CHARSET=latin1;");
        
        comandosSQLInicio.add("Insert INTO departamentos VALUES ('10','CONTABILIDAD','SEVILLA');");
        comandosSQLInicio.add("Insert INTO departamentos VALUES ('20','INVESTIGACION','MADRID');");
        comandosSQLInicio.add("Insert INTO departamentos VALUES ('30','VENTAS','BARCELONA');");
        comandosSQLInicio.add("Insert INTO departamentos VALUES ('40','PRODUCCION','BILBAO');");
        
        comandosSQLInicio.add("Insert INTO empleados VALUES ('17845789K','Antonio','Empleado','CONTABLE','1996-12-17','1222.56','10');");
        comandosSQLInicio.add("Insert INTO empleados VALUES ('35987468H','Susana','Administrativo','CONTABLE','1945-11-24','981.35','10');");
        comandosSQLInicio.add("Insert INTO empleados VALUES ('73155874Q','Roberto','Empleado','VENDEDOR','1979-08-31','1000','30');");

        comandosSQLInicio.add("INSERT INTO login VALUES ('17845789K',AES_ENCRYPT('NoLoVesJeJe', 'Antonio1'));");
        comandosSQLInicio.add("Insert INTO login VALUES ('35987468H',AES_ENCRYPT('NoLoVesJeJe', 'Susana1'));");
        comandosSQLInicio.add("Insert INTO login VALUES ('73155874Q',AES_ENCRYPT('NoLoVesJeJe', 'Roberto1'));");


    }

    public ArrayList<String> getComandosSQLInicio() {
        return comandosSQLInicio;
    }
    
    
}