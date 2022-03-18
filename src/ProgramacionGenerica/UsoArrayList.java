package ProgramacionGenerica;

import java.io.*;

public class UsoArrayList {

    public static void main(String[] args) {
        
        ArrayList2 archivos = new ArrayList2(5);

        archivos.add("Juan");
        archivos.add("Pedro");
        archivos.add("Maria");
        archivos.add("Luis");
        archivos.add(new File("gestion_Pedidos.accdb"));

        // No se puede convertir el objeto a String
        // Debido a que la clase ArrayList debe se generica
        // Por lo que debe realizarse casting
        // Genera un error en tiempo de ejecucion
        String nombrePersona = (String)archivos.get(4); //(2)
        System.out.println(nombrePersona);
/*
        // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
        // Esto genera un error en tiempo de ejecucion
        archivos.add(new File("gestion_Pedidos.accdb"));

        File nombrePesonaFile =(File)archivos.get(0);   // Casting
        System.out.println(nombrePesonaFile);
*/
        
    }
}
