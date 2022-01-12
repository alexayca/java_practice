import javax.swing.*;
import java.awt.event.ActionEvent;

/* ** ** ** **
 * Eventos de multiples fuentes
 *
 *  */
public class PruebaAcciones {
    public static void main(String[] args) {
            // Invocamos al marco
        MarcoAccion marco = new MarcoAccion();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
}


/* *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** */


class MarcoAccion extends JFrame{
    public MarcoAccion(){
            // Establecemos el marco principal
        setTitle("Prueba Acciones");
        setBounds(600,350,600,300);
        PanelAccion lamina = new PanelAccion();
        add(lamina);
            //
    }
}


/* *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** */
class PanelAccion extends JPanel{
    public PanelAccion() {
            // Creamos los botones
        JButton botonAmarillo = new JButton("Amarillo");
        JButton botonAzul = new JButton("Azul");
        JButton botonRojo = new JButton("Rojo");
            // Agregamos los botones a la lamina
        add(botonAmarillo);
        add(botonAzul);
        add(botonRojo);
    }
}


/* *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** */
// Ponemos la lamina a la escucha, que se encargara de cambiar su color
class AccionColor extends AbstractAction{

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}