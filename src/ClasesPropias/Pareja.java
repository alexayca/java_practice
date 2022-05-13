package ClasesPropias;

// Con <> indicamos que es una clase generica T,U,K
public class Pareja<T> {

    private T primero;  // campo de clase generico

    // Constructor inicia el campo de clase con null
    public Pareja(){
        primero=null;
    }

    // Cambia el campo de clase primero por el nuevoValor generico
    public void setPrimero(T nuevoValor){
        primero=nuevoValor;
    }

    // Devuelve un objeto generico
    public T getPrimero(){
        return primero;
    }
}
