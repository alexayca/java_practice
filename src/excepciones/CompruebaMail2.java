/*
* Creacion de excepciones propias
*
* Clausula throw
*
* Se reutiliza el mismo codigo de CompruebaMail
* */
package excepciones;

import javax.swing.*;
import java.io.EOFException;

public class CompruebaMail2 {

    public static void main(String[] args) {

        String elMail = JOptionPane.showInputDialog("Introduce mail");

        try {
            examinaMail2(elMail);
        }catch (EOFException e){
            // excepcion controlada, por lo que se requiere try&catch
            System.out.println("La direccion de mail NO es correcta");
        }
    }


    /* La EOFException no corresponde al ser una excepcion de manejo de archivos
        referente al final del archivo. Pero se usa para ilustrar el ejemplo de una
        excepcion controlada

     */
    static void examinaMail2(String mail) throws EOFException{

        int arroba=0;
        boolean punto = false;

        if (mail.length()<=3){
            throw  new EOFException();

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
