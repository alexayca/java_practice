import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/* *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** */
public class EventosTeclado {
    public static void main(String[] args) {
        MarcoConTeclas myFrame = new MarcoConTeclas();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


/* *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** */
class MarcoConTeclas extends JFrame{
    public MarcoConTeclas(){
        setBounds(700,300,600,450);
        setVisible(true);
        EventoDeTeclado tecla = new EventoDeTeclado();
        addKeyListener(tecla);
    }
}


/* *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** */
class EventoDeTeclado implements KeyListener{
    @Override
    public void keyPressed(KeyEvent e) {
        char letra = e.getKeyChar();
        int codigo = e.getKeyCode();
        System.out.println(codigo + " pressed "+ letra);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        char letra = e.getKeyChar();
        int codigo = e.getKeyCode();
        System.out.println(codigo + " released "+ letra);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        char letra = e.getKeyChar();
        int codigo = e.getKeyCode();        // Retorna 0, siempre. Y algunas teclas no las retorna
        System.out.println(codigo + " typed "+ letra);
    }
}

