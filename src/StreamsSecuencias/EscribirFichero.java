package StreamsSecuencias;

import java.io.FileWriter;
import java.io.IOException;

public class EscribirFichero {
    public static void main(String[] args) {
        Escribiendo accedeEs=new Escribiendo();
        accedeEs.escribir();
    }
}


class Escribiendo{

    public void escribir(){
        String frase="Esto es una prueba de escritura";
        try {
            // Nuevo archivo, si existe lo sobreescribe
            FileWriter escritura=new FileWriter("C:\\tmp\\texto.txt");

            // archivo existente agrega el texto
            //FileWriter escritura=new FileWriter("C:\\tmp\\texto.txt",true);

            for (int i=0;i<frase.length();i++){
                escritura.write(frase.charAt(i));
            }

            escritura.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
