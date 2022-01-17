import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;

public class CampoPassword {
    public static void main(String[] args) {
        MarcoPassword passwordFrame = new MarcoPassword();
        passwordFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoPassword extends JFrame{
    public MarcoPassword() {
        setBounds(400,300,550,400);
        MainPanelPassword miLamina = new MainPanelPassword();
        setVisible(true);
        add(miLamina);
    }
}

class MainPanelPassword extends JPanel{

    JPasswordField campoPasword;

    public MainPanelPassword() {
        setLayout(new BorderLayout());  // Disposicion de la lamina principal
        JPanel laminaSuperior = new JPanel();   // Instanciamos un nuevo panel
        laminaSuperior.setLayout(new GridLayout(2,2));  // Establecemos el layout de panelSuperior
        // Se agrega la lamina secundaria a la parte norte de la lamina principal
        add(laminaSuperior,BorderLayout.NORTH);

        // Elementos
        JLabel etiqueta1 = new JLabel("Usuario");
        JLabel etiqueta2 = new JLabel("Contraseña");
        JTextField campoUsuario = new JTextField(15);
        campoPasword = new JPasswordField(15);

        // Lectura del campoTextoPassword con listener y evento asociado
        RevisionPassword eventoEscribir= new RevisionPassword();
        campoPasword.getDocument().addDocumentListener(eventoEscribir);

        // Disposion de los elementos, considerando el GridLayout
        laminaSuperior.add(etiqueta1);
        laminaSuperior.add(campoUsuario);
        laminaSuperior.add(etiqueta2);
        laminaSuperior.add(campoPasword);

        JButton botonEnviar = new JButton("Enviar");
        add(botonEnviar, BorderLayout.SOUTH);

    }

    private class RevisionPassword implements DocumentListener{

        char [] password;

        @Override
        public void insertUpdate(DocumentEvent e) {

            password = campoPasword.getPassword();
            if (password.length<8 || password.length>12){
                campoPasword.setBackground(Color.ORANGE);
            }else {campoPasword.setBackground(Color.WHITE);
            }

        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            password = campoPasword.getPassword();
            if (password.length<8 || password.length>12){
                campoPasword.setBackground(Color.GRAY);
            }
        }

        @Override
        public void changedUpdate(DocumentEvent e) {

        }
    }
}