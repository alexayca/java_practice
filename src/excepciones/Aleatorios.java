/*
* Existen otro tipo de errores, del tipo logicos
* para encontrarlos se usa el depurador de codigo
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

        for (int i=0;i<numAleatorio.length;i++) {
            numAleatorio[i]=(int)Math.random()*100;
        }

        for (int elem : numAleatorio) {
            System.out.println(elem);
        }
        
    }
    
}
