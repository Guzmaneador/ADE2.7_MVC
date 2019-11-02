package Modelo.DepartamentosDAO;

/**
 *
 * @author Guzman
 */
public interface DepartamentoDAO {
    
    public String insertar(DepartamentoVO departamento);
    public String borrar(int id);
    public String actualizar (DepartamentoVO departamento);
    public DepartamentoVO listaDepartamentos();
    public DepartamentoVO dameDepartamentoId(int id);
    
    
}