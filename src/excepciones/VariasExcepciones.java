/*
* el programa lanza varias excepciones
*       runtimeException    unchecked
*  - al dividir entre cero  arithmeticException
*  - al introducir valores de no numericos numberFormatException
*
* Aunque no se considera una buena practica de programacion
* No se pueden abreviar los bloques catch
* */

package excepciones;

import javax.swing.JOptionPane;

public class VariasExcepciones {
    public static void main(String[] args) {

        /* Las excepciones se capturan con varios bloques catch
            Se suelen ocupar 3 metodos
                - getMessage()
                - getClass()
                - getName()
        */

        try{
            division();
        }catch(ArithmeticException e){
            System.out.println("NO se puede dividir entre cero");
        }catch(NumberFormatException e){
            System.out.println("Debe introducir un valor numerico");
            System.out.println(e.getMessage());
            System.out.println("Se ha generado un error de este tipo " + e.getClass().getName());
        }
    }


    static void division(){
        int num1=Integer.parseInt(JOptionPane.showInputDialog("Introduce el dividendo"));
        int num2=Integer.parseInt(JOptionPane.showInputDialog("Introduce el divisor"));
        System.out.println("El resultado es: " + num1/num2);
    }
}
