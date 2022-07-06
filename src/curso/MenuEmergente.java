package curso;

import javax.swing.*;
import java.awt.*;

public class MenuEmergente {
    public static void main(String[] args) {
        MarcoMenuEmergente emergenteFrame = new MarcoMenuEmergente();
        emergenteFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoMenuEmergente extends JFrame{
    public MarcoMenuEmergente() {
        setBounds(100,100,300,250);
        PanelMenuEmergente panelEmergente = new PanelMenuEmergente();
        add(panelEmergente);
        setVisible(true);
    }
}

class PanelMenuEmergente extends JPanel{
    public PanelMenuEmergente() {
        setLayout(new BorderLayout());
        JPanel panelMenu =new JPanel();
        JMenuBar myBar =new JMenuBar();
        JMenu fuente =new JMenu("Fuente");
        JMenu estilo =new JMenu("Estilo");
        JMenu tamanio =new JMenu("Tamaño");
        myBar.add(fuente);
        myBar.add(estilo);
        myBar.add(tamanio);
        panelMenu.add(myBar);
        add(panelMenu,BorderLayout.NORTH);
        JTextPane myArea =new JTextPane();
        add(myArea,BorderLayout.CENTER);

        // Creamos el objeto menu emergente
        JPopupMenu emergente = new JPopupMenu();
        // Agregamos los items que apareceran en el menu
        JMenuItem opcion1=new JMenuItem("Opcion 1");
        JMenuItem opcion2=new JMenuItem("Opcion 2");
        JMenuItem opcion3=new JMenuItem("Opcion 3");
        emergente.add(opcion1); // Los agragamos al menu emergente
        emergente.add(opcion2);
        emergente.add(opcion3);
        // El menu emergente saldra al hacer clic derecho en JTextPane
        myArea.setComponentPopupMenu(emergente);
    }
}