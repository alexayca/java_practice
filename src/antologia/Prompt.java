/* * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Empleo del arreglo de argumentos en el método main
 * El metodo main como con cualquier otro método, puede emplearse el parámetro args de tipo String
 *  para dar a main una lista de valores que definan su comportamiento; la diferencia radica en
 * el hecho de que a main sólo se le pueden pasar valores desde el prompt del sistema.
 *
 * Cualquier programa en Java tratará lo que se escriba después del nombre del programa como una
 * cadena literal; cada palabra será tomada como un elemento del arreglo args y será responsabilidad
 * del programador extraer uno a uno los valores y convertirlos al tipo de dato que se requiera.
 *
 * Para ejecutar un programa con estas caracteristicas, escribimos:
 * java nombrePrograma argumentos separados por un espacio
 * java Prompt 7 8 9
 *
 * * * * * * * * * * * * * * * * * * * * * * * * * * */
package antologia;

public class Prompt {
    public static void main(String[] args) {

        String mensajeAyuda = "Faltan parametros (Prompt -h = ayuda)";
        showParameters(args);

        if (args == null || args.length == 0){
            System.out.println(mensajeAyuda);
            System.exit(0);
        }
        else if (args[0].substring(0, 1).equals("-")){
            if (args[0].contains("h")) {
                System.out.println("Sintaxis: Prompt [-h] [valorNumerico1 valorNumerico2 valorNumerico3]\nIngrese 3 valores numericos");
                System.exit(0);
            }
            else {
                System.out.println(mensajeAyuda);
                System.exit(0);
            }
        }
        else if(args.length < 3){
            System.out.println(mensajeAyuda);
            System.exit(0);
        }
        else {
            // Nombredeclase.parseTipo(argumento); // excepto la clase Character,
            // evidentemente retorna el mismo tipo de la clase
            int value1 = Integer.parseInt(args[0]);
            long value2 = Long.parseLong(args[1]);
            float value3 = Float.parseFloat(args[2]);
            System.out.println("Valor uno como int: " + value1);
            System.out.println("Valor dos como long: " + value2);
            System.out.println("Valor tres como float: " + value3);
        }



    }   // end main


    static void showParameters(String[] parametrosRecibidos){
        System.out.println( parametrosRecibidos.length +" parametros recibidos: ");
        for (int i=0; i< parametrosRecibidos.length;i++)
            System.out.print("\targs["+i +"]\t" +parametrosRecibidos[i] +"\n");
        System.out.println();
    }

}       // end class
