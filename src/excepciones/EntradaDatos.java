package excepciones;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EntradaDatos {

    public static void main(String[] args) {
        
        System.out.println("Que deseas hacer?");
        System.out.println("1. Introducir datos");
        System.out.println("2. Salir del programa");

        Scanner entrada = new Scanner(System.in);
        
        int decision = entrada.nextInt();
        if (decision==1) {
            // La captura de la excepcion deberia lanzarse al momento de invocar al metodo
            try {
                pedirDatos();
            }catch (Exception e){ /* IOException genera un objeto generico de la excepcion comprobada
                aunque esta excepcion no tiene sentido, porque el programa nunca generara una excepcion
                de este tipo, al no acceder a archivos externos. Debido a que la excepcion que genera es
                 InputMissMatchException el programa se colgara. Siguiendo la herencia la excepcion mas
                 generica es Exception */
                System.out.println("Introduce un valor numerico");
            }
        } else {
            System.out.println("Adios");
            System.exit(0);
        }

        entrada.close();
    }

    
    /* Para controlar se utilizara throws, aunque se considera mala practica de programacion
        InputMismatchException hereda de RuntimeException por tanto es una excepcion no comprobada
        y no es necesario utilizar try&catch para capturar la excepcion
       En caso de usarse IOException si es requerido try&catch para capturar la excepcion
       al ser una excepcion comprobada, pero en este caso es erroneo al no trabajar archivos
    */

    static void pedirDatos() throws IOException {

        /*  No es correcto si se usa un metodo que lanza una excepcion
            la excepcion se debe capturar fuera del metodo. NO se debe capturar
            la excepcion con try catch desde dentro del metodo
            NO es coherente que el metodo lance la excepcion y tambien trate de capturarla
        */

            Scanner entrada = new Scanner(System.in);
            
            System.out.println("Introduce tu nombre por favor");
            String nombre_usuario = entrada.nextLine();
            
            // Si introducimos texto generara un error
            // RuntimeException . InputMismatchException
            System.out.println("Introduce edad");
            // Generara un error no comprobado
            int edad=entrada.nextInt();

            System.out.println("Hola " + nombre_usuario +". El anio que viene tendras " +(edad+1) +" anios.");

            entrada.close();

        System.out.println("Hemos terminado.");

    }
}
