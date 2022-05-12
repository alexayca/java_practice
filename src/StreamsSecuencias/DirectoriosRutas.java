package StreamsSecuencias;

import java.io.*;

public class DirectoriosRutas {
    public static void main(String[] args) {
        File archivo=new File("ejemplo_de_archivo");    // Usa el directorio por defecto del proyecto
        System.out.println(archivo.exists() +"\t"+ archivo.getAbsolutePath()  );
    }
}


class AccesoFicheros{

    public static void main(String[] args) {

        // Ver los archivos y directorios de una ubicacion
        File ruta=new File("C:\\tmp");
        System.out.println(ruta.getAbsolutePath());

        String[] nombresArchivos= ruta.list();  // arreglo de los archivos en el directorio especificado

        for (int i = 0; i < nombresArchivos.length; i++) {
            System.out.println(nombresArchivos[i]);

            File f=new File(ruta.getAbsolutePath(),nombresArchivos[i]);
            if(f.isDirectory()){
                String[] archivosSubcarpeta=f.list();
                for (int j = 0; j < archivosSubcarpeta.length; j++) {
                    System.out.println("\t"+archivosSubcarpeta[j]);
                }
            }
        }
    }

}
