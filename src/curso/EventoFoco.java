import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class EventoFoco {
    public static void main(String[] args) {
        MarcoFoco myFrame = new MarcoFoco();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


/* *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** */
class MarcoFoco extends JFrame{
    public MarcoFoco(){
        setBounds(300,300,600,450);
        add(new LaminaFoco());
        setVisible(true);
    }
}


/* *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** */
class LaminaFoco extends JPanel{
    JTextField cuadro1;
    JTextField cuadro2;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        setLayout(null);
        cuadro1 = new JTextField();
        cuadro1.setBounds(120,10,150,20);
        cuadro2 = new JTextField();
        cuadro2.setBounds(120,50,150,20);
        add(cuadro1);
        add(cuadro2);

        // Poner a la escucha los componentes
        OyenteFoco elFoco = new OyenteFoco();
        cuadro1.addFocusListener(elFoco);

    }

    /* *** *** *** *** *** *** Clase Interna *** *** *** *** */
    private class OyenteFoco implements FocusListener{
        @Override
        public void focusGained(FocusEvent e) {

        }

        // El componente es el que pierde el enfoque
        @Override
        public void focusLost(FocusEvent e) {
            // Pierde
            //cuadro1 = (JTextField) e.getSource();
            String email = cuadro1.getText();
            boolean comprobacion =false;
            for (int i = 0; i < email.length(); i++) {
                if (email.charAt(i)=='@') {
                    comprobacion = true;
                }
            }
            if (comprobacion) {
                System.out.println("Correcto");
            }else{
                System.out.println("Incorrecto");
            }
        }

    }
}




