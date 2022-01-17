import jdk.dynalink.NamedOperation;

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
    private JTextField campo1;
    private JLabel resultado;

    public LaminaTexto() {
        setLayout(new BorderLayout());      // Establece el BorderLayout para este panel
        JPanel myPanel2 = new JPanel();
        myPanel2.setLayout(new FlowLayout());// Estable el FlowLayout para myPanel2

        resultado=new JLabel("Resultado",JLabel.CENTER);         // Inherited from interface SwingConstants
        JLabel texto1 = new JLabel("email:");
        myPanel2.add(texto1);
        campo1 = new JTextField("Captura",10);
        myPanel2.add(campo1);
        add(resultado, BorderLayout.CENTER);       // Agrega resultado en el centro del panel
        JButton myButton = new JButton("OK");
        IntroducirTexto myEvent = new IntroducirTexto();
        myButton.addActionListener(myEvent);
        myPanel2.add(myButton);     // Se agrega el boton a myPanel2
        add(myPanel2, BorderLayout.NORTH);  // Agrega myPanel2 en el borde norte del panel
    }

    private  class IntroducirTexto implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            int arrobas=0;
            String email=campo1.getText().trim();   // Obtiene el texto y quita espacios en blanco
            for (int i=0;i<email.length();i++){
                if (email.charAt(i)=='@'){
                    arrobas++;
                }
            }
            if (arrobas!=1){
                String s ="Incorrecto";
                resultado.setText(s);
                System.out.println(s);
            }else {
                String s ="Correcto";
                resultado.setText(s);
                System.out.println(s);
            }
        }
    }
}


