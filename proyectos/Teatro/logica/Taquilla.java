/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alexa
 */
public class Taquilla {
    
    // Base de datos logica
    private List<Boleto> listaBoletos = new ArrayList<Boleto>();    // polimorfismo, se indica el tipo boleto para que no sea la clase objeto

    public Taquilla(boolean flag) {
        if (flag) {
            Boleto boleto = new Boleto(1,1,LocalDate.of(2023,04,03),100);
            Boleto boleto1 = new Boleto(1,1 );
            Boleto boleto2 = new Boleto(1,2);
            Boleto boleto3 = new Boleto(1,3 );
            boleto3.setPrecio(1100);

            // se agregan elementos a la lista
            listaBoletos.add(boleto1);
            listaBoletos.add(boleto2);
            listaBoletos.add(boleto3);
            listaBoletos.add(boleto);
        }
    }
    
    
    public void sumarPrecios(){
        double sumatoria=0;
        // Recorremos la colección y sumamos los precios
        for(Boleto ticket:listaBoletos){
            sumatoria = sumatoria+ticket.getPrecio();
        }
        System.out.println("Ventas por boletos: " + sumatoria);
    }
    
    
    public void mostrarFila(int fila){
        boolean flag = false;
        for(Boleto ticket:listaBoletos){
            if (ticket.getFila()==fila) {
                System.out.println(ticket.toString());
                flag=true;
            }
        }
        if(flag==false){
            System.out.println("No se encontrarón datos de la fila: "+fila);
        }
    }

    
    /**
     * Algoritmo de LUHN
     * @author <a href="http://www.chriswareham.demon.co.uk/software/Luhn.java">Chris Wareham</a>
     * https://gist.github.com/mdp/9691528
     * https://commons.apache.org/proper/commons-validator/apidocs/org/apache/commons/validator/routines/checkdigit/LuhnCheckDigit.html
     * 
     */
    public static boolean validarTarjeta(String ccNumber){
        int sum = 0;
        boolean alternate = false;
        
        for (int i = ccNumber.length() - 1; i >= 0; i--){
            int n = Integer.parseInt(ccNumber.substring(i, i + 1));
            if (alternate){
                n *= 2;
                if (n > 9)
                    n = (n % 10) + 1;
            }
            sum += n;
            alternate = !alternate;
        }
        return (sum % 10 == 0);
    }
    
}
