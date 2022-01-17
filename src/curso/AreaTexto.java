import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AreaTexto {
    public static void main(String[] args) {
        FrameArea myMarco = new FrameArea();
        myMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


class FrameArea extends JFrame{
    public FrameArea(){
        setBounds(500,300,500,350);
        PanelArea miLamina = new PanelArea();
        add(miLamina);
        setVisible(true);
    }
}

class PanelArea extends JPanel{
    private JTextArea miAreaEscritura;      // Se declara en la clase *

    public PanelArea(){
        miAreaEscritura = new JTextArea(5,10);  // * Se inicia en el constructor

        // Al area de texto no se puede agregar directamente barras de scroll, se debe insertar dentro de un Panel
        // y a esta lamina agregar las barras de scroll. Dado que el area de texto crece tambien en vertical.
        JScrollPane laminaBarraDesplazamiento = new JScrollPane(miAreaEscritura);   // se envia como parametro el objeto JTextArea

        // Modifica el comportamiento por defecto (linea continua crece), permitiendo agregar saltos de linea automaticamente
        miAreaEscritura.setLineWrap(true);      // Si no se incluye, tambien se generarian scroll verticales
        add(laminaBarraDesplazamiento);         // Se agrega la lamina con el scroll horizontal. miAreaEscritura NO incluye scrolls

        JButton miBoton = new JButton("Mostrar");
        miBoton.addActionListener(new GestionaAreaTexto());     // Agrego el listener al boton con el constructor de la clase que implementa ActionListener
        add(miBoton);
    }

    class GestionaAreaTexto implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            // El texto se muestra en consola de la misma forma que en el JTextArea, con Wrap
            System.out.println(miAreaEscritura.getText());
        }
    }

}

