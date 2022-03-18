package JDBCon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConectaProductos {

    public static void main(String[] args) {

        try {
            // 1 crear conexion
            Connection miConexion = DriverManager.getConnection("jdbc:mariadb://localhost:3306/test","alexa","");
            // 2 crear objeto statement
            Statement miStatement = miConexion.createStatement();
            // 3 ejecutar sql
            ResultSet miResultset = miStatement.executeQuery("SELECT * FROM alcaldia");
            // 4 recorrer el resultset (mientras haya un registro mas)
            while (miResultset.next()){
                // Convertimos a cadena de texto; con los nombres de cada columna como aparecen en la basede datos
                System.out.println(miResultset.getString("id")+ "\t"+miResultset.getString("nombre") +"\t"+miResultset.getString("updatets"));
            }

        }catch (Exception e){
            System.out.println("No conecta");
            e.printStackTrace();
        }
    }
}
