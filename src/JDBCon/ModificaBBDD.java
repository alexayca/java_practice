package JDBCon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ModificaBBDD {

    public static void main(String[] args) {

        try {
            //String driverName = "com.mysql.jdbc.Driver";
            //Class.forName(driverName); // here is the ClassNotFoundException

            Connection miConexion = DriverManager.getConnection("jdbc:mariadb://localhost:3306/test","alexa","");
            Statement miStatement = miConexion.createStatement();

            // Insertar registros, tambien se puede utilizar la clausula UPDATE, DELETE
            String instruccionInsertSQL = "INSERT INTO " +
                    "deposito(nombre, id_alcaldia, id_colonia, dir_detalle) " +
                    "VALUES('Patio Maravilla', 2, 246,'Poniente 152 y Av. maravillas, estacion la patera')";

            miStatement.executeUpdate(instruccionInsertSQL);
            System.out.println("Datos insertados");


        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
