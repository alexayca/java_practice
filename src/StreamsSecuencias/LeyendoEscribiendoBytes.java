/* * *
 * Copiamos los bytes de un archivo a otro lugar
 *
 * */
package StreamsSecuencias;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class LeyendoEscribiendoBytes {
    public static void main(String[] args) {
        int contadorBytes=0;
        int datosEntrada[]=new int[55404];
        try {
            FileInputStream archivoLectura=new FileInputStream("C:\\tmp\\3878-1-191919.png");
            boolean final_archivo=false;

            while (!final_archivo){
                int byte_entrada=archivoLectura.read();
                if(byte_entrada!=-1)
                    datosEntrada[contadorBytes]=byte_entrada;   // El archivo se almacena en un array
                else    /*if(byte_entrada==-1)*/
                    final_archivo=true;
                System.out.println(datosEntrada[contadorBytes]);    // Muestra cada byte del archivo
                contadorBytes++;
            }

            archivoLectura.close();
        }catch (IOException e){
            System.out.println("Error de acceso a la imagen");
        }
        System.out.println(contadorBytes);  // Muestra el tamano del archivo

        creaArchivoBinario(datosEntrada);   // Pasamos el array como parametro
    } // END main


    static void creaArchivoBinario(int datosNuevoFichero[]){
        try {
            FileOutputStream ficheroNuevo=new FileOutputStream("C:\\tmp\\3878-1-191919_copia.png");
            for (int i=0;i<datosNuevoFichero.length;i++){
                ficheroNuevo.write(datosNuevoFichero[i]);
            }
            ficheroNuevo.close();
        }catch (IOException e){
            System.out.println("Error al crear la imagen");
        }
    }
}
