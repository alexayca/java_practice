package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

public class Lamina extends JPanel {

    // se sobreescribe el metodo de la clase JComponent
    public void paintComponent(Graphics g){
        // El metodo debe hacer su trabajo original, al sobreescribirlo se cambia,
        // Por lo que se invoca el comportamiento por defecto con super
        super.paintComponent(g);    // En este ejemplo no se aprecia su funcionamiento
        // Más el comportamiento agregado
        //g.drawString("Texto en la lamina",100,100);
        //g.drawRect(95,105,120,20);

        // Refundicion: se convierte el objeto Graphis a Graphics2D
        Graphics2D g2d = (Graphics2D) g;

        g2d.addRenderingHints(new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON)); //Antialiasing

        // Clase anidada
        Rectangle2D rectangulo2d = new Rectangle2D.Double(100,100,200,150);

        Ellipse2D elipse2d = new Ellipse2D.Double();
        elipse2d.setFrame(rectangulo2d);

        double centroX = elipse2d.getCenterX();
        double centroY = elipse2d.getCenterY();
        double radio = 300;

        Ellipse2D circulo = new Ellipse2D.Double();
        circulo.setFrameFromCenter(centroX, centroY, centroX+radio, centroY+radio);
        g2d.setPaint(Color.BLACK);
        g2d.draw(circulo);          // Checar la API para ver la interface Shape
        g2d.setPaint(Color.GRAY);
        g2d.fill(circulo);          // Checar la API para ver la interface Shape

        g2d.setPaint(Color.BLACK);
        g2d.draw(rectangulo2d);     // el color por defecto es negro
        g2d.setPaint(Color.RED);
        g2d.fill(rectangulo2d);

        g2d.setPaint(new Color(25,25,250).darker());  // Se instancia Paint con el metodo darker()
        g2d.draw(elipse2d);
        g2d.setPaint(Color.GREEN);
        g2d.fill(elipse2d);

        // Se dibuja una linea instanciando dentro del metodo draw
        g2d.setPaint(Color.BLACK);
        g2d.draw(new Line2D.Double(200,100,200,250));

        Font fecha = new Font("Arial", Font.BOLD, 10);
        g2d.setFont(fecha);
        g2d.drawString("09Ene2022",10,20);

        Font miFuente = new Font("ROG Fonts", Font.BOLD, 62);
        g2d.setFont(miFuente);
        g2d.setColor(Color.PINK);
        g2d.drawString("Alex",340,200);
    }

}
