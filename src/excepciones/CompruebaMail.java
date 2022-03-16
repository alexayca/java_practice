/*
* Lanzamiento de excepciones de forma manual
* Clausula throw
*
* La clausula throws se utiliza en la declaracion de un metodo
* para indicar que ese metodo podria lanzar una excepcion.
* Mientras que throws se puede utilizar en cualquier parte
* del codigo para indicar que en ese punto concreto del codigo
* se lanza una excepcion.
*
* Se lanzara una excepcion de forma manual si se introduce un mail
* con menos de 3 caracteres         <=3 throw exception
*
* */
package excepciones;

import javax.swing.*;

public class CompruebaMail {

    public static void main(String[] args) {

        String elMail = JOptionPane.showInputDialog("Introduce mail");

        // si se tratase de un excepcion controlada se debe utilizar try&catch en este punto
        examinaMail(elMail);
    }


    // Se debe indicar si un metodo puede lanzar una excepcion con la clausula throws
    // que se lanzara si cumple la condicion
    // Dependiendo de donde herede la excepcion, sera controlada o no controlada
    static void examinaMail(String mail) throws ArrayIndexOutOfBoundsException{

        int arroba=0;
        boolean punto = false;

        /* Evaluamos para lanzar la excepcion
            Debemos considerar que tipo de excepcion se lanzara
            si coincide con algun tipo de excepcion de la api.
            Si no coincide deberemos crear una propia.
            Se utilizara una excepcion propia de la api, aunque no corresponde al tipo
         */
        if (mail.length()<=3){
                // se instancia la clase de la excepcion
            //ArrayIndexOutOfBoundsException myException = new ArrayIndexOutOfBoundsException();
                // Lanzamos la instancia creada con la clausula throw
            //throw myException;
                // La excepcion se lanzara solo si se introducen 3 caracteres, pese a que se incluya @.

            // Normalmente se instancia dentro de la clausula throw, reduciendo el codigo anterior
            throw  new ArrayIndexOutOfBoundsException();

            // si se tratase de un excepcion controlada se debe utilizar try&catch

        }else {

            for (int i = 0; i < mail.length(); i++) {
                if (mail.charAt(i) == '@') {
                    arroba++;
                }
                if (mail.charAt(i) == '.') {
                    punto = true;
                }
            }

            if (arroba == 1 && punto == true) {
                System.out.println("Es correcto");
            } else {
                System.out.println("Indica un mail valido");
            }
        }
    }
}
