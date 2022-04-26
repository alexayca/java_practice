package productos_model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class CargaSecciones {

    Conexion miConexion;
    public ResultSet rs;

    public CargaSecciones(){
        miConexion = new Conexion();
    }

    public ResultSet ejecutaConsultas(){
        Connection accesoBBDD= miConexion.doConnection();
        try {
            Statement secciones= accesoBBDD.createStatement();
            return  rs = secciones.executeQuery("SELECT DISTINCTROW section FROM products");
        }catch (Exception e){

        }
        return null;
    }

    /*public String ejecutaConsultas(){

        Productos miProducto = null;
        Connection accesoBBDD= miConexion.doConnection();

        try{
            Statement secciones = accesoBBDD.createStatement();
            rs=secciones.executeQuery("SELECT DISTINCTROW section FROM products");
            //while (rs.next()){
            //rs.previous();    // No aparece la primer seccion, por lo que se recorre el cursor uno hacia atras
                miProducto=new Productos();
                miProducto.setSection(rs.getString(1));
            //    return miProducto.getSection();
            //}
            rs.close();

        }catch (Exception e){

        }
        return miProducto.getSection();
    }*/

}
