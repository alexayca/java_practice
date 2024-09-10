/** Chat pildoras informaticas Sockets
 * 190.I - 191.II
 *
 *     // abre un puero para comunicarse
 *     // recibe texto desde el cliente
 *     // permanece a la escucha en segundo plano con un hilo
 * */

package sockets_red;

import javax.swing.*;
import java.awt.*;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorPI {
    public static void main(String[] args) {
        MarcoServidor mimarco=new MarcoServidor();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

class MarcoServidor extends JFrame implements Runnable {
    public MarcoServidor(){
        JLabel texto=new JLabel("SERVIDOR");
        setBounds(1200,300,280,350);
        JPanel milamina= new JPanel();
        milamina.setLayout(new BorderLayout());
        areatexto=new JTextArea();
        milamina.add(texto,BorderLayout.NORTH);
        milamina.add(areatexto,BorderLayout.CENTER);
        add(milamina);
        setVisible(true);

        // creamos un hilo para ejecutar el metodo run al ejecutarse el constructor del marco
        Thread mihilo = new Thread(this);
        mihilo.start();
    }
    private	JTextArea areatexto;

    @Override
    public void run() {
        System.out.println("Hilo a la escucha");

        try {
            // se programa el socket TCP para abrir un puerto y tenerlo a la escucha
            ServerSocket servidor = new ServerSocket(9999);
            while (true){   // bucle infinito
                // aceptar conexion del exterior
                Socket misocket = servidor.accept();
                // flujo de entrada que recoje los datos enviados del cliente (socket por el que viaja la info de entrada)
                DataInputStream flujoentrada = new DataInputStream(misocket.getInputStream());
                // leer lo que viene en el flujo de entra
                String mensaje_texto = flujoentrada.readUTF();
                // Idicamos que lo escriba en el JTextArea
                areatexto.append("\n" + mensaje_texto);
                // cierra la conexión ,por lo que no se puede recibir otro mensaje
                // para evitar esto se debe introduce en un bucle
                misocket.close();
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
