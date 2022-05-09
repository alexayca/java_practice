package StreamsSecuencias;

import java.io.IOException;
import java.io.FileReader;

public class AccesoFichero {
    public static void main(String[] args) {
        LeerFichero accediendo=new LeerFichero();
        accediendo.leer();
    }
}


class LeerFichero{

    public void leer(){
        try {
            FileReader entrada = new FileReader("C:\\Users\\alexa\\git_alexayca\\java_practice\\src\\StreamsSecuencias\\texte.txt");
            int c= entrada.read();

            while (c!=-1) /* -1 representa el final del archivo*/ {
                c=entrada.read();// c almacena el codigo de los caracteres unicode
                char letra=(char)c;
                System.out.print(letra);
            }

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("No se ha encontrado el archivo");
        }

    }
}
