package Modelo;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Guzman
 */
public interface Modelo {
    public void start(ArrayList<String> comandosSQL) throws SQLException;
    public void login(ArrayList<String> userPass);
}
