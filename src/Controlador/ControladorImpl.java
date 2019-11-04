package Controlador;

import Modelo.Modelo;
import Vista.Vista;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Guzman
 */
public class ControladorImpl implements Controlador {
    Modelo modelo;
    Vista vista;

    public ControladorImpl(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }
    
    @Override
    public void iniciar(){
        try {
            modelo.start(vista.getComandosSQLInicio());
            modelo.login(vista.solicitarLogin());
        } catch (SQLException ex) {
            Logger.getLogger(ControladorImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

}