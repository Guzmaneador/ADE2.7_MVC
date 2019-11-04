package Modelo.EmpleadosDAO;

/**
 *
 * @author Guzman
 */
public class EmpleadoDAOJDBImpl implements EmpleadoDAO{
    String SQL_SELECT_EMPLEADOS= "SELECT nombre FROM empleados";
    String SQL_SELECT_PASSWORD="SELECT nif FROM empleados WHERE id=?";
    
    
  

}