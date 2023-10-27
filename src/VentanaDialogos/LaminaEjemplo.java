package VentanaDialogos;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class LaminaEjemplo extends JPanel {

    public void paintComponent(Graphics g){

        super.paintComponent(g);
        Graphics2D g2=(Graphics2D) g;

        // pintamos un rectangulo amarillo con las mismas dimensiones de la lamina LaminaEjemplo
        Rectangle2D rectangulo = new Rectangle2D.Double(0,0,getWidth(),getHeight());
        g2.setPaint(Color.YELLOW);
        g2.fill(rectangulo);

    }
}
