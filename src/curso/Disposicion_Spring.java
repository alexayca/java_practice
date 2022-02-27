package curso;

import javax.swing.*;
import java.awt.*;

public class Disposicion_Spring {
    public static void main(String[] args) {
        Frame_Muelle myFrameSpring = new Frame_Muelle();
        myFrameSpring.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


class Frame_Muelle extends JFrame{
    public Frame_Muelle() {
        setBounds(300, 400, 1000, 350);
        Panel_Muelle myPanelSpring = new Panel_Muelle();
        add(myPanelSpring);
        setVisible(true);
    }
}


class Panel_Muelle extends JPanel{
    public Panel_Muelle() {

        JButton boton1 = new JButton("Boton 1");
        JButton boton2 = new JButton("Boton 2");
        JButton boton3 = new JButton("Boton 3");

        SpringLayout myLayoutSpring = new SpringLayout();
        setLayout(myLayoutSpring);      // Aparecen los botones uno encima del otro, al no acomodarse

        add(boton1);
        add(boton2);
        add(boton3);

        Spring myMuelle = Spring.constant(0,10,100);
        // this hace referencia al borde del contenedor de la lamina, el primer muelle entre el boton1 y el borde izq
        myLayoutSpring.putConstraint(SpringLayout.WEST, boton1, myMuelle, SpringLayout.WEST,this);
        myLayoutSpring.putConstraint(SpringLayout.WEST, boton2, myMuelle, SpringLayout.EAST, boton1);
        myLayoutSpring.putConstraint(SpringLayout.WEST, boton3, myMuelle, SpringLayout.EAST, boton2);
        myLayoutSpring.putConstraint(SpringLayout.EAST, this, myMuelle, SpringLayout.EAST, boton3);

    }
}