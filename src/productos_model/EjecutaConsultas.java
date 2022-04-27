package productos_model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EjecutaConsultas {

    //private String pruebas;
    private Conexion miConexion;
    private ResultSet rs;

    private PreparedStatement enviaConsultaSeccion;
    private PreparedStatement enviaConsultaPais;
    private PreparedStatement enviaConsultaTodos;

    private final String consultaSeccion="SELECT articleName, section, price, country " +
            "FROM products WHERE section=?";

    public EjecutaConsultas(){
        miConexion=new Conexion();

    }

    public ResultSet filtraBBDD(String seccion, String pais){
        //pruebas="";
        Connection conecta=miConexion.doConnection();
        rs=null;

        try {
            if (!seccion.equals("Todos") && pais.equals("Todos")) {
                //pruebas="Has escogido seccion";
                enviaConsultaSeccion = conecta.prepareStatement(consultaSeccion);
                enviaConsultaSeccion.setString(1,seccion);
                rs=enviaConsultaSeccion.executeQuery();

            } else if (seccion.equals("Todos") && !pais.equals("Todos")) {
                //pruebas="Has escogido pais";
            } else if (!seccion.equals("Todos") && !pais.equals("Todos")) {
                //pruebas="Has escogido seccion y pais";
            }
            //return  pruebas;
        }catch (Exception e){

        }
        return rs;
    }
}
