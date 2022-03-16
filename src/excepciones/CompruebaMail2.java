/*
* Creacion de excepciones propias
* Se creara una clase que herede de Exception IOException o RuntimeException
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
            examinaMail2(elMail);   // al heredar de Exception requiere el bloque try&catch
        }catch (LongitudMailErronea e){       // Debe coincidir la excepcion con la clase de excepcion indicada en el metodo
            // excepcion controlada, por lo que se requiere try&catch
            System.out.println("La direccion de mail NO es correcta");
            // Muestra la pila de llamadas con el metodo printStackTrace
            // Para conocer que clase a generado la excepcion
            e.printStackTrace();
        }
    }


    /* La EOFException no corresponde al ser una excepcion de manejo de archivos
        referente al final del archivo. Pero se usa para ilustrar el ejemplo de una
        excepcion controlada

       Se utiliza la clase propia de manejo de excepciones LongitudMailErronea
     */
    static void examinaMail2(String mail) throws LongitudMailErronea{

        int arroba=0;
        boolean punto = false;

        if (mail.length()<=3){
            //throw  new EOFException();
            // Se puede utilizar cualquiera de los dos constructores
            // el parametro permite personalizar el mensaje de error
            // se puede omitir el mensaje porque se esta capturando el error,
            // y este genera ya un mensaje          el mensaje deberia ser mas especifico
            throw new LongitudMailErronea("El mail no puede tener menos de 3 caracteres");

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

/** Esta clase normalmente se recomienda que haya dos constructores
 * Si se consulta la api, observamos que todas las excepciones
 * cuentan con al menos 2 constructores
 * al heredar de Exception requiere las clausuas try&catch
 * Si heredara de RuntimeException no serian necesarias (no controlados)
 */
class LongitudMailErronea extends Exception{

    public LongitudMailErronea(){

    }


    public LongitudMailErronea(String mensajeError){
        // Constructs a new heritaged exception with the specified detail message
        super(mensajeError);
    }
}
