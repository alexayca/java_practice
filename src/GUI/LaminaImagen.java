package GUI;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import  java.io.*;

public class LaminaImagen extends JPanel {

    private Image imagen;

    public LaminaImagen(){
        // excepcion comprobada
        try {
            imagen=ImageIO.read(new File("GUI/images/favicons.png"));
        }catch (IOException e){
            System.out.println("La imagen no se encuentra");
        }

    }

    public void paintComponent(Graphics g) throws NullPointerException{
        super.paintComponent(g);

        // excepcion no comprobada (null pointer exception)        
        try{
            int alturaImagen = imagen.getHeight(this);
            int anchoImagen = imagen.getWidth(this);

            g.drawImage(imagen,0,0,null);

            for (int i=0;i<4;i++)
                for (int j=0;j<6;j++)
                    if (i+j>0)
                        g.copyArea(0,0,anchoImagen,alturaImagen,alturaImagen*j,anchoImagen*i);

            // this hace referencia al objeto donde nos encontramos
            System.out.println("Propiedades imagen:\n\tAncho: " + alturaImagen +" Alto: " + anchoImagen);
        }catch(NullPointerException e){
            g.drawString("No se ha podido cargar la imagen", 10, 10);
        }
    }

}
