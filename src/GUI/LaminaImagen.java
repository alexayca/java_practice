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

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        if (imagen==null){
            g.drawString("No podemos cargar la imagen",10,10);
        }else{

            try {
                imagen = ImageIO.read(new File("GUI/images/857409.png"));
            }
            catch (IOException e){
                System.out.println("La imagen no se encuentra disponible.");
            }

            int alturaImagen = imagen.getHeight(this);
            int anchoImagen = imagen.getWidth(this);

            g.drawImage(imagen,0,0,null);

            for (int i=0;i<4;i++)
                for (int j=0;j<6;j++)
                    if (i+j>0)
                        g.copyArea(0,0,anchoImagen,alturaImagen,alturaImagen*j,anchoImagen*i);

            // this hace referencia al objeto donde nos encontramos
            System.out.println("Propiedades imagen:\n\tAncho: " + alturaImagen +" Alto: " + anchoImagen);
        }
    }

}
