/* Esta es la clase que se utiliza para hacer la conexion a la base de datos y la cmas importante porque de la conexion dependera el funcioanmiento
total de la aplicacion*/
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    Connection con;
    public Connection getConnection(){
        try {
            String myBD = "jdbc:mysql://localhost/jugueteria?serverTimezone=UTC";
            con = DriverManager.getConnection(myBD, "root","");
            return con;
        } catch (SQLException e) {
            System.out.println(e.toString());
        }    
        return null;
        
    }
}
