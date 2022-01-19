import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotonesRadioEjemplo {
    public static void main(String[] args) {
        MarcoRadioBotonE miFrame = new MarcoRadioBotonE();
        miFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoRadioBotonE extends JFrame{
    public MarcoRadioBotonE() throws HeadlessException {
        setBounds(550,300,850,350);
        setVisible(true);
        LaminaRadioButtonE miPanel =  new LaminaRadioButtonE();
        add(miPanel);
    }
}

class LaminaRadioButtonE extends JPanel{

    private JLabel texto;
    private JRadioButton botonR1, botonR2, botonR3, botonR4;

    public LaminaRadioButtonE() {
        setLayout(new BorderLayout());
        texto=new JLabel("- Ya veo... - dijo el vampiro, pensativo, y lentamente cruzó la habitacion hacia la ventana.");
        add(texto, BorderLayout.CENTER);

        ButtonGroup miGrupoBotones = new ButtonGroup();
        botonR1=new JRadioButton("Pequeño", false);
        botonR2=new JRadioButton("Mediano", true);
        botonR3=new JRadioButton("Grande", false);
        botonR4=new JRadioButton("Gigante", false);

        JPanel laminaRadio = new JPanel();
        ManejaRadioButtonE eventoRadio = new ManejaRadioButtonE();

        botonR1.addActionListener(eventoRadio);
        botonR2.addActionListener(eventoRadio);
        botonR3.addActionListener(eventoRadio);
        botonR4.addActionListener(eventoRadio);

        miGrupoBotones.add(botonR1);
        miGrupoBotones.add(botonR2);
        miGrupoBotones.add(botonR3);
        miGrupoBotones.add(botonR4);

        laminaRadio.add(botonR1);
        laminaRadio.add(botonR2);
        laminaRadio.add(botonR3);
        laminaRadio.add(botonR4);

        add(laminaRadio, BorderLayout.SOUTH);


    }

    // Clase interna para asociar el metodo actionPerformed, y agregar el listener a los RadioButtons
    class ManejaRadioButtonE implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            // Devuelve el origen del evento, quien desencadeno
            if (e.getSource()==botonR1) {       /* Devuelve el desencadenate del objeto */
                // System.out.println("Has pulsado el boton 1");
                texto.setFont(new Font("Serif", Font.PLAIN, 10));
            } else if (e.getSource()==botonR2){
                texto.setFont(new Font("Serif", Font.PLAIN, 12));   // Es el tamaño y tipo por default, sin metodo
            } else if (e.getSource()==botonR3){
                texto.setFont(new Font("Serif", Font.PLAIN, 14));
            } else if (e.getSource()==botonR4){
                texto.setFont(new Font("Serif", Font.PLAIN, 20));
            }


        }
    }
}
