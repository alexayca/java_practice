import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.PrintStream;

public class EventosRaton {
    public static void main(String[] args) {
        MouseFrame myMarcoMouse = new MouseFrame();
        myMarcoMouse.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


/* *** *** *** *** *** *** *** *** Objeto Fuente *** *** *** *** *** *** *** *** */
class MouseFrame extends JFrame{
    public MouseFrame() /*throws HeadlessException*/ {
        setBounds(700,300,600,450);
        setVisible(true);
        EventosDeraton objetoMouseListener = new EventosDeraton();
        addMouseListener(objetoMouseListener);
        addMouseMotionListener(objetoMouseListener);
        //AdapterEventosDeRaton objetoAdapterMouseListener = new AdapterEventosDeRaton();
        //addMouseListener(objetoAdapterMouseListener);
    }
}


/* *** *** *** *** *** *** *** *** Objeto Oyente clase adaptadora *** *** *** *** *** *** *** *** */
// Observe que la clase adapter implementa solo los metodos que nos interesan
class AdapterEventosDeRaton extends MouseAdapter{

/*    @Override
    public void mouseClicked(MouseEvent e) {
        super.mouseClicked(e);
        System.out.println("Haz hecho clic en coordenadas. \nX: " +e.getX() + "\tY: " + e.getY());
        System.out.println(e.getClickCount());
    }
*/
    @Override
    public void mousePressed(MouseEvent e) {
        super.mousePressed(e);

        if (e.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK)
            System.out.println("Haz hecho clik izquierdo");
        else if (e.getModifiersEx()==MouseEvent.BUTTON2_DOWN_MASK)
            System.out.println("Haz hecho clik con el boton central (rueda)");
        else if (e.getModifiersEx()==MouseEvent.BUTTON3_DOWN_MASK)
        System.out.println("Haz hecho clik derecho");
    }
}


/* *** *** *** *** *** *** *** *** Objeto Oyente *** *** *** *** *** *** *** *** */
class EventosDeraton implements MouseListener, MouseMotionListener {
    /* *** *** *** *** *** *** *** Metodos de MouseMotionListener *** *** *** */
    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("Estas arrastrando");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("Estas moviendo");
    }
    /* *** *** *** *** *** *** *** *** Metodos de MouseListener *** *** *** */
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Haz hecho clic");
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Haz entrado a la ventana");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Haz salido de la ventana");
    }
}
