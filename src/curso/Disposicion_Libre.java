package curso;

import javax.swing.*;
import java.awt.*;

public class Disposicion_Libre {
    public static void main(String[] args) {
        Frame_Libre myFrameLibre = new Frame_Libre();
        myFrameLibre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


class Frame_Libre extends JFrame{
    public Frame_Libre() {
        setBounds(300, 400, 1000, 350);
        Panel_Libre myPanelFree = new Panel_Libre();
        add(myPanelFree);
        setVisible(true);
    }
}


class Panel_Libre extends JPanel{
    public Panel_Libre() {

        setLayout(new DisposicionPropia());    // Indica la disposicion creada

        JLabel nombre = new JLabel("Nombre: ");
        JTextField c_nombre = new JTextField();
        JLabel apellido = new JLabel("Apellido: ");
        JTextField c_apellido = new JTextField();
        JLabel edad = new JLabel("Edad: ");
        JTextField c_edad = new JTextField();

        add(nombre);
        add(c_apellido);
        add(apellido);
        add(c_nombre);
        add(edad);
        add(c_edad);

    }
}


class DisposicionPropia implements LayoutManager {

    private int x = 20;
    private int y = 20;

    @Override
    public void layoutContainer(Container parent) {
        int contador = 0;
        int cantidadComponentes = parent.getComponentCount();

        for (int i=0; i<cantidadComponentes;i++){
            contador++;
            Component c = parent.getComponent(i);
            c.setBounds(x,y,100,20);
            x+=100;
            if (contador%2==0){
                // Reinicia la ubicacion en X y despues de agregar dos componentes agrega el siguiente el la proxima linea
                x=20;
                y+=40;
            }

        }
    }

    @Override
    public void addLayoutComponent(String name, Component comp) {

    }

    @Override
    public void removeLayoutComponent(Component comp) {

    }

    @Override
    public Dimension preferredLayoutSize(Container parent) {
        return null;
    }

    @Override
    public Dimension minimumLayoutSize(Container parent) {
        return null;
    }
}
