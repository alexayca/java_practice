package ClasesPropiasGenericas;

import ProgramacionGenerica.*;
import java.util.GregorianCalendar;

public class MetodosGenericos {

    public static void main(String[] args) {

        // paso de parametro por argumento tipo array de Strings
        String nombres[]={"Melchor", "Gaspar", "Baltasar"};
        // Opcional. Al momento de llamar al metodo se indica el <tipo> a pasar
        String elementos=MisMatrices.<String>getElementos(nombres);
        System.out.println(elementos);


        // paso de parametro por argumento tipo array de Empleado
        Empleado listaEmpleados[]={new Empleado("Diana", 25, 6800),
                new Empleado("Laura", 27, 7000),
                new Empleado("Karla", 22, 8000),
                new Empleado("Mary", 25, 7000),
                new Empleado("Jenny", 20, 7000)
        };
        System.out.println(MisMatrices.getElementos(listaEmpleados));


        // ordena alfabeticamente, en caso de fecha muestra la mas antigua
        System.out.println(MisMatrices.getMinor(nombres));

        GregorianCalendar fechas[]={new GregorianCalendar(2022,05,12),
                new GregorianCalendar(2015,07,12),
                new GregorianCalendar(2000,06,03)
        };
        System.out.println(MisMatrices.getMinor(fechas));   // muestra un formato de poca legibilidad


        // Error en tiempo de compilacion al pasar un arreglo de Empleado,
        // porque no implementa la interfaz comparable, ademas de no saber que campo ordenar
    //    System.out.println(MisMatrices.getMinor(listaEmpleados));


    }

}


class MisMatrices{

    /** Metodo generico de clase para no instanciar,
        se especifica el argumento de tipo, devuelve un String
        recibe un array generico
     */
    public static <T> String getElementos(T []arrayGenerico){
        return "El array tiene " + arrayGenerico.length + " elementos.";
    }

    /** Elemento del array menor
     * recibe una matriz generica y devuelve un tipo generico
     * https://www.youtube.com/watch?v=7Ip_N1fbOmQ&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk
     */
    public static <T extends Comparable> T getMinor(T []arrayGenerico){
        if(arrayGenerico==null || arrayGenerico.length==0)
            return null;
        // si hay elementos en el array, comenzamos a analizar el arreglo
        // observe que comienza desde [1] para comparar con [0] almacenado
        T elementMinor=arrayGenerico[0];
        for (int i = 1; i < arrayGenerico.length; i++) {
            // interface comparable
            if (elementMinor.compareTo(arrayGenerico[i])>0){
                elementMinor=arrayGenerico[i];
            }
        }
        return elementMinor;
    }

}
