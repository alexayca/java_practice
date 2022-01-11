/* ** ** ** **
 * Eventos de ventana
 * pildoras 68 - 70
 *
 * ** ** ** */
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class EventosVentana {
    public static void main(String[] args) {
        MarcoVentana myFrame = new MarcoVentana();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setTitle("Ventana 1");
        myFrame.setBounds(100,300,500,350);

        MarcoVentana miMarco2 = new MarcoVentana();
        miMarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        miMarco2.setTitle("Ventana 2");
        miMarco2.setBounds(700,300,500,350);

    }
}


class MarcoVentana extends JFrame{
    public MarcoVentana() {
        //setTitle("Respondiendo Eventos de Ventana");
        //setBounds(300,300,500,350);
        setVisible(true);

        //ClaseOyenteVentana oyenteVentanaInterfaz = new ClaseOyenteVentana();
        //addWindowListener(oyenteVentanaInterfaz);

        /*claseAdaptadoraOyente ventanaOyenteCAdaptadora = new claseAdaptadoraOyente();
        addWindowListener(ventanaOyenteCAdaptadora);*/
        addWindowListener(new claseAdaptadoraOyente());

    }
}

// Para no implementar todos los metodos que requiere la interfaz
// Se pueden utilizar las adapter class que ya tiene implementados
// todos los metodos de las interfaces Listener
class ClaseOyenteVentana implements WindowListener{

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Ventana Activada");
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("La ventana ha sido cerrada");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Cerrando Ventana");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Ventana Desactivada");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Ventana Restaurada");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Ventana Minimizada");
    }

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Ventana Abierta");
    }

}

// clase Adaptadora
class claseAdaptadoraOyente extends WindowAdapter {
    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Ventana Minimizada");
    }
}