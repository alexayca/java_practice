import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLOutput;

public class CuadroTexto {
    public static void main(String[] args) {
        MarcoTexto myFrame = new MarcoTexto();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoTexto extends JFrame{
    public MarcoTexto() throws HeadlessException {
        setBounds(600,300,600,350);
        LaminaTexto myPanel = new LaminaTexto();
        add(myPanel);
        setVisible(true);
    }
}

class LaminaTexto extends JPanel{
    private JTextField campo1 = new JTextField("Captura",10);
    public LaminaTexto() {
        JLabel texto1 = new JLabel("email:");
        add(texto1);
        add(campo1);
        JButton myButton = new JButton("OK");
        IntroducirTexto myEvent = new IntroducirTexto();
        myButton.addActionListener(myEvent);
        add(myButton);
    }

    private  class IntroducirTexto implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(campo1.getText().trim());    // Obtiene el texto y quita espacios en blanco
        }
    }
}


