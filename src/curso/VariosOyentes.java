import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class VariosOyentes {
    public static void main(String[] args) {
        MarcoPrincipal myFrame = new MarcoPrincipal();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    }
}


/* *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** */
class MarcoPrincipal extends JFrame{
    public MarcoPrincipal(){
        setTitle("Prueba varios oyentes. Una fuente");
        setBounds(1300,100,300,200);
        LaminaPrincipal myPanel = new LaminaPrincipal();
        add(myPanel);
    }
}


/* *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** */
class LaminaPrincipal extends JPanel{

    JButton botonCerrar;

    public LaminaPrincipal() {
        JButton botonNuevo = new JButton("Nuevo");
        add(botonNuevo);
        botonCerrar = new JButton("Cerrar todo");
        add(botonCerrar);
        // El botonNuevo es una fuente de evento
        OyenteNuevo myListener = new OyenteNuevo();
        botonNuevo.addActionListener(myListener);
    }

    // Clase interna
    private class OyenteNuevo implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            MarcoEmergente marco = new MarcoEmergente(botonCerrar);
            marco.setVisible(true);
        }
    }
}

class MarcoEmergente extends JFrame{

    private static int iterador =0;

    public MarcoEmergente(JButton botonCerrarDePrincipal) {
        iterador++;
        setTitle("Ventana " + iterador);
        setBounds(40*iterador,40*iterador,300,150);
        CierraTodos oyenteCerrar = new CierraTodos();   // Instancia de la clase oyente creada
        botonCerrarDePrincipal.addActionListener(oyenteCerrar);
    }

    // Cuando reciba un evento cerrara todas las ventanas (clase interna)
    private class CierraTodos implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            dispose();  // Method inherited from class java.awt.Window
            MarcoEmergente.iterador=0;
        }
    }
}
