package JDBCon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConectaProductos {

    public static void main(String[] args) {

        try {
            /*  // Instruccion para asegurarse que el driver carga correctamente
                // Inicia el driver con el método estatico forName()
                // Devuelve la clase que se esta ejecutando para que cargue el driver
            *   String driverName = "com.mysql.jdbc.Driver";
            *   Class.forName(driverName); // here is the ClassNotFoundException
            */

            // 1 crear conexion
            // Puede obviarse el puerto si es por default
            Connection miConexion = DriverManager.getConnection("jdbc:mariadb://localhost:3306/test","alexa","");
            // 2 crear objeto statement
            Statement miStatement = miConexion.createStatement();
            // 3 ejecutar sql
            ResultSet miResultset = miStatement.executeQuery("SELECT * FROM alcaldia");
            // 4 recorrer el resultset (mientras haya un registro más)
            while (miResultset.next()){
                // Convertimos a cadena de texto; con los nombres de cada columna como aparecen en la base de datos
                // getString no requiere poner el nombre de los campos, tan solo el entero que representa el orden de la columna; empezando en 1
                System.out.println(miResultset.getShort(1) +"\t"+miResultset.getTimestamp(3) + "\t"+miResultset.getString("nombre"));
            }

        }catch (Exception e){
            System.out.println("No conecta");
            e.printStackTrace();
        }
    }
}
