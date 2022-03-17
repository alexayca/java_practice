/* 
 * Clausula finally
 * 
 * El programa realiza dos tareas continuas: 
 *  - Calcula el area de una figura geometrica
 *  - Calcula el peso ideal segun la altura
 * 
 * Si falla la primera parte; al introducir un texto en vez de int,
 *  se colapsa y no se ejecuta el resto de codigo.
 * 
 * EJEMPLO DE UTILIDAD A CONEXXION BBDD en pseudocodigo
     try{
          Abrimos conexxion BD;
          Ejecutamos sentencias SQL;
          Almacenamos datos en resultset;
          Accedemos y leemos resultset;
          Cerramos resulset;
     }catch(SQLException){
          Instrucciones de control de Excepcion;
     }finally{
          Cerramos conexion BD;
     }
 * 
 * resultset es una especie de tabla virtual donde se almacena la informacion
 * 
 */

package excepciones;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class AreasPeso {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Elige una opcion: \n1. Cuadrado \n2. Rectangulo \n3. Triangulo \n4. Circulo");
        
        try{
            figura = entrada.nextInt();
            //entrada.close();
        }catch(Exception e){
            System.out.println("Ha ocurrido un error");
        }finally{
            // El codigo dentro de este bloque siempre se ejecuta
            // sin importar si se ejecuto correctamente el try o se lanzo el catch
            entrada.close();
        }

        /* Al capturarse la excepcion al ejecutar entrada.nextInt();
            el programa continua, y lanza el catch.
            No cierra la conexion y por tanto no libera 
            los recursos del Scanner, y se queda corriendo
            Para asegurarnos que siempre se ejecute cierta linea de codigo
            en este caso entrada.close(); 
            sin importar si existio o no una excepcion se agrega la clausula finally
            El programa continua ejecutandose, 
            y en este caso el InputDialog del peso queda detras del editor
        */

        switch (figura) {

            case 1:
                int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
                System.out.println(Math.pow(lado, 2));
                break;
        
            case 2:
                int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
                int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
                System.out.println("El area del rectangulo es: " +base*altura);
                break;

            case 3:
                base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
                altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
                System.out.println("El area del triangulo es: " +(base*altura)/2);
                break;

            case 4:
                int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));
                System.out.print("El area del circulo es: ");
                System.out.println(Math.PI*(Math.pow(radio, 2)));
                break;

            default:
            System.out.println("La opcion no es correcta");
                break;
        }

// -------------------------------------------------------------------------------

    int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en cm"));
    System.out.println("Si eres hombre tu peso ideal es: " +(altura-110) + "kg");    
    System.out.println("Si eres mujer tu peso ideal es: " +(altura-120) + "kg");

    }

    static int figura;

}
