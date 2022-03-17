/*
* Existen otro tipo de errores, del tipo logicos
* para encontrarlos se usa el depurador de codigo
*
* Para comenzar a utilizar el debugger
*   Se introduce un punto de interrupcion
*   Se ejecuta el programa con el boton debug
*       Se presentara la vista debug con panel debug, variables y breakpoints
*    Step over : avanza una linea mas depues de la pausa
*    Step Into
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
