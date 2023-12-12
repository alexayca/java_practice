/** Chat pildoras informaticas Sockets 190.1 */

package sockets_red;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientePI {
    public static void main(String[] args) {
        MarcoCliente mimarco=new MarcoCliente();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}




class MarcoCliente extends JFrame{

    public MarcoCliente(){
        setBounds(600,300,280,350);
        LaminaMarcoCliente milamina=new LaminaMarcoCliente();
        add(milamina);
        setVisible(true);
    }

}

class LaminaMarcoCliente extends JPanel{

    public LaminaMarcoCliente(){
        JLabel texto=new JLabel("CLIENTE");
        add(texto);
        campo1=new JTextField(20);
        add(campo1);
        miboton=new JButton("Enviar");
        // instancia del boton listener
        EnviaTexto mievento = new EnviaTexto();
        miboton.addActionListener(mievento);

        add(miboton);
    }

    private JTextField campo1;
    private JButton miboton;

    /* manejo de eventos */
    private class EnviaTexto implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(campo1.getText());

            // creacion del socket
            try {
                Socket misocket = new Socket("10.4.3.120",9999);
            }catch (UnknownHostException uhe){
                uhe.printStackTrace();
            }catch (IOException ioe){
                ioe.printStackTrace();
                System.out.println(ioe.getMessage());
            }

        }
    }

}
