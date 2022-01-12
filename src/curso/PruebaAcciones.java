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
        setBounds(600,350,900,500);
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
            // Creamos los botones y Agregamos los botones a la lamina
        JButton botonAmarillo = new JButton(accionAmarillo);
        add(botonAmarillo);
        add(new JButton(accionAzul));
        add(new JButton(accionRojo));
    }

    /* *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** */
// Ponemos la lamina a la escucha, que se encargara de cambiar su color. Y la hacemos clase interna
    private class AccionColor extends AbstractAction{
        public AccionColor(String nombre, Icon icono, Color colorBoton) {
            // Cuando se construya el objeto del evento se guardara clave: valor
            putValue(Action.NAME, nombre);
            putValue(Action.SMALL_ICON, icono);
            putValue(Action.SHORT_DESCRIPTION, "Cambia el color de la lamina "+nombre);
            putValue("Color_de_fondo", colorBoton);
        }

        @Override   // Se llama automaticamente cuando ocurre el evento
        public void actionPerformed(ActionEvent e) {
            Color c=(Color) getValue("Color_de_fondo"); // obtenemos el valor de la clave, de tipo objeto cast to color
            setBackground(c);       // Corresponde a la clase JPanel
            System.out.println("Name: " +getValue(Action.NAME) +". \nShort description: " +getValue(Action.SHORT_DESCRIPTION));
        }
    }
}


