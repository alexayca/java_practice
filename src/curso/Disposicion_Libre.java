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

        setLayout(null);    // Indica que es disposicion libre

        JLabel nombre = new JLabel("Nombre: ");
        JLabel apellido = new JLabel("Apellido: ");
        JTextField c_nombre = new JTextField();
        JTextField c_apellido = new JTextField();

        nombre.setBounds(20,20,80,15);
        c_nombre.setBounds(100,20,100,20);
        apellido.setBounds(20,60,80,15);
        c_apellido.setBounds(100,60,100,20);

        add(nombre);
        add(apellido);
        add(c_apellido);
        add(c_nombre);

/*
        JButton boton1 = new JButton("Boton A");
        boton1.setBounds(50,50,150,50);
        add(boton1);

        JButton boton2 = new JButton("Boton B");
        boton2.setBounds(250,150,80,30);
        add(boton2);
*/
    }
}
