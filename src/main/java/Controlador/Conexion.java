package Controlador;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Conexion {
    private static Connection conexion;

    static {
        var conf = new Properties();

        try {
            conf.load(new FileReader("configuracion.properties"));

            try {
                conexion = DriverManager.getConnection(conf.getProperty("URL"), conf.getProperty("USER"),
                        conf.getProperty("PWD"));

            } catch (SQLException ex) {
                System.out.println(ex);
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }

    }

    public static Connection getConexion() {
        return conexion;
    }

    
}
