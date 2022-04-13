package JDBCon;

import java.sql.*;

public class ConsultaPreparada {

    public static void main(String[] args) {

        try {
        // 1 crear conexion
            Connection miConexion = DriverManager.getConnection("jdbc:mariadb://localhost:3306/test","alexa","");

        // 2 preparar consulta
            PreparedStatement miSentencia = miConexion.prepareStatement("SELECT nombre, id_alcaldia, dir_detalle "
                    + "FROM deposito WHERE id_alcaldia=? AND nombre=?"); /* 2, 286 las armas */

        // 3 establecer parametros de consulta (identificaar el tipo de parametro para utilizar el metodo adecuado)
            miSentencia.setInt(1,2); /*index orden, parametro tipo int*/
            miSentencia.setString(2,"Las Armas"); /*index orden, parametro tipo string*/

        // 4 ejecutar y recorrer la consulta
            ResultSet rs = miSentencia.executeQuery();  /* crea un objeto tipo tabla virtual */

            while (rs.next()){
                // Arroja un solo resultado, por lo que no es necesario el while
                System.out.println(rs.getString(2) + "\t"
                                    +rs.getString(1) + "\t"
                                    +rs.getString("dir_detalle"));
            }


            // Reutilizacion de consulta SQL
        // 3 establecer parametros de consulta
            System.out.println("\nEjecucion 2a consulta \n");
            miSentencia.setInt(1,2);
            miSentencia.setString(2,"Culturas");
        // 4 ejecutar y recorrer la consulta
            ResultSet rs2 = miSentencia.executeQuery();

            while (rs2.next()){
                System.out.println(rs2.getString(2) + "\t"
                        +rs2.getString(1) + "\t"
                        +rs2.getString("dir_detalle"));
            }

            rs.close(); // liberar la memoria

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
