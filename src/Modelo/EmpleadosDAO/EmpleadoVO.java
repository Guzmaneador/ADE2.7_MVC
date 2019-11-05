package Modelo.EmpleadosDAO;

import java.sql.Date;

/**
 *
 * @author Guzman
 */
public class EmpleadoVO {
    private String nif;
    private String nombre;
    private String tipo;
    private String oficio;
    private Date fechaAlta;
    private double salario;
    private int id;
    private String password;
    public EmpleadoVO() {
    }

    public EmpleadoVO(String nif, String nombre, String tipo, String oficio, Date fechaAlta, double salario, int id) {
        this.nif = nif;
        this.nombre = nombre;
        this.tipo = tipo;
        this.oficio = oficio;
        this.fechaAlta = fechaAlta;
        this.salario = salario;
        this.id = id;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getOficio() {
        return oficio;
    }

    public void setOficio(String oficio) {
        this.oficio = oficio;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
   

}