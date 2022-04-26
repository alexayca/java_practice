package productos_model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class CargaMenus {

    public Conexion miConexion;
    public ResultSet rs;
    public ResultSet rsPaises;

    public CargaMenus(){
        miConexion = new Conexion();
    }

/*    public ResultSet ejecutaConsultas(){
        Connection accesoBBDD= miConexion.doConnection();
        try {
            Statement secciones= accesoBBDD.createStatement();
            return  rs = secciones.executeQuery("SELECT DISTINCTROW section FROM products");
        }catch (Exception e){

        }
        return null;
    }
*/
    public String ejecutaConsultas(){

        Productos miProducto = null;
        Connection accesoBBDD= miConexion.doConnection();

        try{
            Statement secciones = accesoBBDD.createStatement();
            Statement paises = accesoBBDD.createStatement();
            rs=secciones.executeQuery("SELECT DISTINCTROW section FROM products");
            rsPaises=paises.executeQuery("SELECT DISTINCTROW country FROM products");
            //while (rs.next()){
            //rs.previous();    // No aparece la primer seccion, por lo que se recorre el cursor uno hacia atras
                miProducto=new Productos();
                miProducto.setSection(rs.getString(1));
                miProducto.setCountry(rsPaises.getString(1));
            //    return miProducto.getSection();
            //}
            rs.close();
            rsPaises.close();

        }catch (Exception e){

        }
        return miProducto.getSection();
    }

}
