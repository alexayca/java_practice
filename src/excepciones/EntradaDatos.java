package excepciones;

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
            pedirDatos();
        } else {
            System.out.println("Adios");
            System.exit(0);
        }

        entrada.close();
    }

    
    // Para controlar se utilizara throws, aunque se considera mala practica de programacion
    static void pedirDatos() throws InputMismatchException{

        try{
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
        }catch(InputMismatchException e){
            // si se genera el error, se capturara en el objeto e
            System.out.println("Introduce un numero");
        }
        System.out.println("Hemos terminado.");

    }
}
