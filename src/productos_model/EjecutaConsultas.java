package productos_model;

public class EjecutaConsultas {

    private String pruebas;

    public String filtraBBDD(String seccion, String pais){
        pruebas="";
        if(!seccion.equals("Todos") && pais.equals("Todos")) {
            pruebas="Has escogido seccion";
        }else if(seccion.equals("Todos") && !pais.equals("Todos")){
            pruebas="Has escogido pais";
        }else  if(!seccion.equals("Todos") && !pais.equals("Todos")){
            pruebas="Has escogido seccion y pais";
        }
        return  pruebas;
    }
}
