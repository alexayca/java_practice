package productos_model;

import productos_controller.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class CargaSecciones {

    Conexion miConexion;
    private ResultSet rs;

    public CargaSecciones(){
        miConexion = new Conexion();
    }

    public String ejecutaConsultas(){

        Productos miProducto = null;
        Connection accesoBBDD= miConexion.doConnection();

        try{
            Statement secciones = accesoBBDD.createStatement();
            rs=secciones.executeQuery("SELECT DISTINCTROW section FROM products");
            while (rs.next()){
                miProducto=new Productos();
                miProducto.setSection(rs.getString(1));
                return miProducto.getSection();
            }
            rs.close();

        }catch (Exception e){

        }
        return miProducto.getSection();
    }

}
