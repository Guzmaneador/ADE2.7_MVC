package Modelo.EmpleadosDAO;




/**
 *
 * @author Guzman
 */
public class EmpleadoDAOJDBImpl implements EmpleadoDAO{
//    BasicDataSource poolConexiones;
    
    String SQL_SELECT_EMPLEADOS= "SELECT nombre FROM empleados";
    String SQL_SELECT_PASSWORD="SELECT nif FROM empleados WHERE id=?";
    private final String SQL_UPDATE = "UPDATE empleados SET nif=? nombre=? tipo=? oficio=? fecha_alta=? salario=? id=? WHERE nombre=?";
    
    

    
    public String insertar(EmpleadoVO empleado) {
        
        
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }
  

}