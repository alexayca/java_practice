import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/* ** ** ** **
 * Eventos de multiples fuentes
 *  Clic o combinacion de teclas
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
        AccionColor accionAmarillo = new AccionColor("Amarillo", new ImageIcon("src/ico/yellow.gif"), Color.YELLOW );
        AccionColor accionAzul = new AccionColor("Azul", new ImageIcon("src/ico/blue.gif"), Color.BLUE );
        AccionColor accionRojo = new AccionColor("Rojo", new ImageIcon("src/ico/red.png"), Color.RED );
/*            // Creamos los botones
        JButton botonAmarillo = new JButton("Amarillo");
        JButton botonAzul = new JButton("Azul");
        JButton botonRojo = new JButton("Rojo");
            // Agregamos los botones a la lamina
        add(botonAmarillo);
        add(botonAzul);
        add(botonRojo);
*/    }
}


/* *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** */
// Ponemos la lamina a la escucha, que se encargara de cambiar su color
class AccionColor extends AbstractAction{
    public AccionColor(String nombre, Icon icono, Color colorBoton) {
        // Cuando se construya el objeto del evento se guardara clave: valor
        putValue(Action.NAME, nombre);
        putValue(Action.SMALL_ICON, icono);
        putValue(Action.SHORT_DESCRIPTION, "Cambia el color de la lamina "+nombre);
        putValue("Color_de_fondo", colorBoton);
    }

    @Override   // Se llama automaticamente cuando ocurre el evento
    public void actionPerformed(ActionEvent e) {

    }
}