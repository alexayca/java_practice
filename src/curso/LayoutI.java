import javax.swing.*;
import java.awt.*;

public class LayoutI {
    public static void main(String[] args) {
        MarcoLayout myFrame = new MarcoLayout();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    }
}


/* *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** */
class MarcoLayout extends JFrame {
    public MarcoLayout() {
        setTitle("Prueba de Plantillas I");
        setBounds(600,350,600,300);
        PanelLayout miLamina = new PanelLayout();
        add(miLamina);
    }
}


/* *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** */
class PanelLayout extends JPanel{
    public PanelLayout() {
        // Normalmente la disposicion y los elementos se establecen en el mismo sitio, en este caso en el constructor de la lamina
        //setLayout(new FlowLayout(FlowLayout.CENTER,75,30));  // Default FlowLayout.CENTER
        setLayout(new BorderLayout(10,10));
        add(new JButton("Amarillo"),BorderLayout.NORTH);
        add(new JButton("Rojo"),BorderLayout.WEST);
        add(new JButton("Azul"),BorderLayout.EAST);
        add(new JButton("Verde"),BorderLayout.SOUTH);
        add(new JButton("Violeta"),BorderLayout.CENTER);
    }
}


