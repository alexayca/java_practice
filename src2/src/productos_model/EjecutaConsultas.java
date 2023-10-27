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
    private final String consultaPais ="SELECT articleName, section, price, country "  +
            "FROM products WHERE country=?";
    private final String consultaTodo ="SELECT articleName, section, price, country "  +
            "FROM products WHERE section=? AND country=? ";

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
                enviaConsultaPais=conecta.prepareStatement(consultaPais);
                enviaConsultaPais.setString(1,pais);
                rs=enviaConsultaPais.executeQuery();
            } else if (!seccion.equals("Todos") && !pais.equals("Todos")) {
                //pruebas="Has escogido seccion y pais";
                enviaConsultaTodos=conecta.prepareStatement(consultaTodo);
                enviaConsultaTodos.setString(1,seccion);
                enviaConsultaTodos.setString(2,pais);
                rs=enviaConsultaTodos.executeQuery();
            }
            //return  pruebas;
        }catch (Exception e){

        }
        return rs;
    }
}
