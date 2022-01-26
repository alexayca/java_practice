import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/* ** ** ** **
 * Eventos de multiples fuentes
 *  Clic o combinacion de teclas
 *
 * Asignando acciones al teclado
 *  - Crear un mapa de entrada                  [InputMap   JComponent.getInputMap(int condicion)]
 *  - Crear combinacion de teclas               static[KeyStroke.getKeyStroke(String s)]
 *  - Asignar combinacion de teclas al objeto   [InputMap.put(keyStroke, Object)]
 *  - Asignar objeto a accion                   [ActionMap.put(Object, accion)]
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
        setBounds(600,350,900,500);
        PanelAccion lamina = new PanelAccion();
        add(lamina);
            //
    }
}


/* *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** */
class PanelAccion extends JPanel{
    public PanelAccion() {
        AccionColor accionAmarillo = new AccionColor("Amarillo", new ImageIcon("src/ico/yellow.png"), Color.YELLOW );
        AccionColor accionAzul = new AccionColor("Azul", new ImageIcon("src/ico/blue.png"), Color.BLUE );
        AccionColor accionRojo = new AccionColor("Rojo", new ImageIcon("src/ico/red.png"), Color.RED );
            // Creamos los botones y Agregamos los botones a la lamina (objetos fuente botones)
        JButton botonAmarillo = new JButton(accionAmarillo);
        add(botonAmarillo);
        add(new JButton(accionAzul));
        add(new JButton(accionRojo));

        // Fuente de combinacion de teclas
            // Mapa de entrada
        InputMap mapaEntrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);      // El objeto que recibe el foco es el boton, al estar dentro de la ventana del foco (dentro de la lamina)
        //InputMap mapaEntrada = getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);  // Funciona
        //InputMap mapaEntrada = getInputMap(JComponent.WHEN_FOCUSED);    // NO funciona, al ser el foco la propia lamina, Sin tocar ningun boton al iniciar funciona
            // Crear combinacion de teclas
        KeyStroke teclaAmarillo = KeyStroke.getKeyStroke("ctrl Y");
            // Asignar la combinacion de teclas al objeto correspondiente
        mapaEntrada.put(teclaAmarillo, "fondo_amarillo");
        mapaEntrada.put(KeyStroke.getKeyStroke("ctrl A"), "fondo_azul");    // Se puede desencadenar la misma accion con otra combinacion de teclas
        mapaEntrada.put(KeyStroke.getKeyStroke("ctrl B"), "fondo_azul");    // Combina y asigna
        mapaEntrada.put(KeyStroke.getKeyStroke("ctrl R"), "fondo_rojo");    // Combina y asigna
            // Asignar el objeto a la accion
        ActionMap mapaAccion = getActionMap();
        mapaAccion.put("fondo_amarillo", accionAmarillo);
        mapaAccion.put("fondo_azul", accionAzul);
        mapaAccion.put("fondo_rojo", accionRojo);


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


