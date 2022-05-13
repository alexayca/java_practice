package ClasesPropiasGenericas;

import ProgramacionGenerica.Empleado;

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

    /*
    // recibe un argumento p generico de tipo Empleado
    // para poder ser utilizado por alguna subclase como Jefe
    // incluimos una interrogacion extends
    // (Pareja<Empleado> p)      -->    (Pareja<? extends Empleado> p)
    // para recibir un tipo empleado o cualquier subclase que herede de ella
    */
    public static void imprimirTrabajador(Pareja<? extends Empleado> p){
        Empleado primero=p.getPrimero();
        System.out.println(primero);
    }
}
