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
        // Especificamos la disposicion de los elementos de la lamina, antes de agregarla
        FlowLayout disposicionElementos = new FlowLayout(FlowLayout.LEFT);  // Default FlowLayout.CENTER
        miLamina.setLayout(disposicionElementos);
        add(miLamina);
    }
}


/* *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** */
class PanelLayout extends JPanel{
    public PanelLayout() {
        add(new JButton("Amarillo"));
        add(new JButton("Rojo"));
        add(new JButton("Azul"));
        add(new JButton("Verde"));
    }
}


