package Modelo;

/**
 *
 * @author Guzman
 */
public class DepartamentoVO {
    private int id;
    private String nombre;
    private String ubicacion;
    
    public DepartamentoVO() {
    }

    public DepartamentoVO(int id, String nombre, String ubicacion) {
        this.id = id;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
}