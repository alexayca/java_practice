import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

/* ** ** ** ** ** ** **
 * Siempre hay Evento, Fuente y Oyente.
 * Según que tipo de Eventos se implementa una Interfaz u otra.
 * El Oyente siempre implementa la Interfaz.
 * El Evento, es el método al que se invoca.
 * Y la Fuente, es el Objeto que tenga el método add…Listener.
 * En algunos casos (raros) Fuente  y Oyente coinciden.
 *
 *
 * ** ** ** ** ** ** ** */
public class CambioEstadoVentana {
    public static void main(String[] args) {
        MarcoEstado miMarco = new MarcoEstado();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


class MarcoEstado extends JFrame{
    public MarcoEstado(){
        setBounds(300,300,500,350);
        setVisible(true);

        // Creamos la instancia de la clase que esta a la escucha
        CambiaEstado nuevo_estado = new CambiaEstado();
        addWindowStateListener(nuevo_estado);   // Metodo que recibe los eventos de esta ventana
    }
}


class CambiaEstado implements WindowStateListener{
    @Override
    // Este metodo se invoca cuando el estado de la ventana cambia
    public void windowStateChanged(WindowEvent e) {
        System.out.println("La ventana ha cambiado de estado " + e.getNewState());
        if (e.getNewState()== Frame.MAXIMIZED_BOTH){
            System.out.println("La ventana esta a pantalla completa");
        }else if(e.getNewState()== Frame.NORMAL){
            System.out.println("La ventana esta normal");
        }else if(e.getNewState()== Frame.ICONIFIED){
            System.out.println("La ventana esta minimizada");
            // No muestra el cambio de maximizar a minimizar
        }
    }
}
