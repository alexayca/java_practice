package productos_controller;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    private Connection myConnection=null;

    public Conexion(){

    }

    public Connection doConnection(){
        try {
            myConnection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/test", "alexa", "");
        }catch (Exception e){

        }
        return myConnection;
    }
}
