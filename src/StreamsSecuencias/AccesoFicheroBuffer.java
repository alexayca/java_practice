package StreamsSecuencias;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AccesoFicheroBuffer {
    public static void main(String[] args) {
        LeerFicheroBuffer accediendo=new LeerFicheroBuffer();
        accediendo.leer();
    }
}


class LeerFicheroBuffer{

    FileReader entrada;

    public void leer(){
        try {
            entrada = new FileReader("C:\\Users\\alexa\\git_alexayca\\java_practice\\src\\StreamsSecuencias\\texte.txt");
            BufferedReader miBuffer=new BufferedReader(entrada);
            String linea="";

            while (linea!=null) /* -1 representa el final del archivo*/ {
                linea=miBuffer.readLine();
                if (linea!=null)    // Para evitar imprimir la palabra null al final del archivo
                    System.out.println(linea);
            }

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("No se ha encontrado el archivo");
        }finally {
            try {
                entrada.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
