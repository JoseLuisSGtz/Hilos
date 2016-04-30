package MainPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CBD {
    

    static String bd = "hilos";
    static String login = "root";
    static String password = "2012";
    static String url = "jdbc:mysql://localhost/" + bd;
    Connection coneccion = null;

    public CBD() {
        try {
          
            Class.forName("com.mysql.jdbc.Driver");

            
            coneccion = DriverManager.getConnection(url, login, password);

            if (coneccion != null) {
                System.out.println("Coneccion con base de datos exitosa");
            }
        } catch (SQLException e) {
            System.out.println("Error "+e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Error "+e.getMessage());
        } catch (Exception e) {
            System.out.println("Error "+e.getMessage());
        }

    }

   
    public Connection getConnection() {
        return coneccion;
    }

    public void desconectar() {
        coneccion = null;
    }

}
