/*
* Existen otro tipo de errores, del tipo logicos
* para encontrarlos se usa el depurador de codigo
*
* Para comenzar a utilizar el debugger
*   Se introduce un punto de interrupcion
*   Se ejecuta el programa con el boton debug
*       Se presentara la vista debug con panel debug, variables y breakpoints
*    Step over : avanza una linea mas depues de la pausa
*    Step Into : permite depurar un programa con varios archivos
*
*   Se pueden introducir varios puntos de interrupcion
*   El boton resume permite saltar al siguiente punto de interrupcion,
* ejecutando las lineas intermedias de forma normal
*
* Skip all breakpoint
*
* Hay puntos de ejecucion condicionales
* se pueden usar las variables del programa
* ejem: i==3
*
* Tambien el panel expresiones
* para hacer comprobaciones indicamos que nos muestre el valor de esta sentencia
* cuando ocurra, si es que ocurre o determinar si se ejecuta cierta expresion
* expressions: codigo de programacion para comprobar que valor puede tomar una variable
*
*
* El programa llena una matriz con numeros aleatorios
*/
package excepciones;

import javax.swing.JOptionPane;

public class Aleatorios {
    
    public static void main(String[] args) {
        
        int elementos = Integer.parseInt(JOptionPane.showInputDialog("Introduce elementos de la matriz"));
        int numAleatorio[]=new int[elementos];

        // el programa no genera numeros aleatorios, solo ceros
        for (int i=0;i<numAleatorio.length;i++) {
            // aqui se introduce el punto de interrupcion
            numAleatorio[i]=(int)(Math.random()*100);
        }

        for (int elem : numAleatorio) {
            System.out.println(elem);
        }
        
    }
    
}
