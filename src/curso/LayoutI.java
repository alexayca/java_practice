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
        PanelLayout2 mi2Lamina = new PanelLayout2();
        add(miLamina, BorderLayout.NORTH);
        add(mi2Lamina, BorderLayout.SOUTH);
    }
}


/* *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** */
class PanelLayout extends JPanel{
    public PanelLayout() {
        // Normalmente la disposicion y los elementos se establecen en el mismo sitio, en este caso en el constructor de la lamina
        //setLayout(new FlowLayout(FlowLayout.CENTER,75,30));  // Default FlowLayout.CENTER
        setLayout(new FlowLayout(FlowLayout.CENTER));   // Los botones ocupan un espacio minimo
        add(new JButton("Amarillo"));
        add(new JButton("Verde"));

    }
}


/* *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** */
class PanelLayout2 extends JPanel{
    public PanelLayout2() {
        setLayout(new BorderLayout());      // Los botones ocuapan el ancho de la ventana
        add(new JButton("Rojo"), BorderLayout.WEST);
        add(new JButton("Azul"), BorderLayout.EAST);
        add(new JButton("Violeta"), BorderLayout.CENTER);
    }
}

