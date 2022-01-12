import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

public class EventoFocoVentana extends JFrame implements WindowFocusListener {

    EventoFocoVentana marco1;
    EventoFocoVentana marco2;

    public static void main(String[] args) {
        EventoFocoVentana miV = new EventoFocoVentana();
        miV.iniciarMarcos();
    }

    public void iniciarMarcos(){
        marco1 = new EventoFocoVentana();
        marco2 = new EventoFocoVentana();

        marco1.setVisible(true);
        marco2.setVisible(true);

        marco1.setBounds(300,100,600,350);
        marco2.setBounds(1200,100,600,350);

        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        marco1.addWindowFocusListener(this);
        marco2.addWindowFocusListener(this);
    }

    @Override
    public void windowGainedFocus(WindowEvent e) {
        if (e.getSource()==marco1){
            marco1.setTitle("Tengo el enfoque " +marco1.getName());
        }else {
            marco2.setTitle("Tengo el enfoque " +marco2.getName());
        }
    }

    @Override
    public void windowLostFocus(WindowEvent e) {
        if (e.getSource()==marco1){
            marco1.setTitle("" +marco1.getName());
        }else {
            marco2.setTitle("" +marco2.getName());
        }
    }

}
