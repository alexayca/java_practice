package StreamsSecuencias;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreandoArchivosDirectorios {

    public static void main(String[] args) {

        // Indicamos en el pathname el nombre del nuevo directorio
        File rutaNuevoDirectorio=new File("C:"+File.separator+"tmp"
                +File.separator+"CarpetaJava");
        rutaNuevoDirectorio.mkdir();

        // Crear un nuevo archivo y escribir en el
        File rutaNuevoArchivo=new File("C:"+File.separator+"tmp"
                +File.separator+"documento.txt");
        String archivoDestino=rutaNuevoArchivo.getAbsolutePath();
        try {
            rutaNuevoArchivo.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //
        EscribiendoArchivo accede_es =new EscribiendoArchivo();
        accede_es.escribir(archivoDestino);

    }
}


class EscribiendoArchivo{

    void escribir(String rutaArchivo){

        String frase="Esto es un ejemplo";

        try {
            FileWriter escritura=new FileWriter(rutaArchivo);

            for (int i = 0; i < frase.length(); i++) {
                escritura.write(frase.charAt(i));
            }
            escritura.close();

        }catch (IOException e){

        }
    }
}

/** Se elimina el archivo creado con la clase CreandoArchivosDirectorios */
class EliminarArchivo{
    public static void main(String[] args) {
        File rutaNuevoArchivo=new File("C:"+File.separator+"tmp"
                +File.separator+"documento.txt");
        rutaNuevoArchivo.delete();
    }
}
