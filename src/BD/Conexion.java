package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
   public static Connection getConexion() {

        String conexionUrl = "jdbc:sqlserver://192.168.100.118:1433;"
                + "database=ClassHubDev;"
                + "user=abeato;"
                + "password=ContrasenaBD123;"
                + "loginTimeout+=30;"
                + "trustServerCertificate=true";

        try {
            Connection con = DriverManager.getConnection(conexionUrl);
            return con;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return null;
        }
    }
}
