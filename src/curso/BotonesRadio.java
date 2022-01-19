import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotonesRadio {
    public static void main(String[] args) {
        MarcoRadioBoton miFrame = new MarcoRadioBoton();
        miFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoRadioBoton extends JFrame{
    public MarcoRadioBoton() throws HeadlessException {
        setBounds(550,300,550,350);
        setVisible(true);
        LaminaRadioButton miPanel =  new LaminaRadioButton();
        add(miPanel);
    }
}

class LaminaRadioButton extends JPanel{

    public LaminaRadioButton() {
        // Agrupamos componentes con la clase ButtonGroup, para quq solo se seleccione uno
        // Pero el grupo NO se puede agregar a la lamina
        ButtonGroup miGrupo1=new ButtonGroup();

        JRadioButton botonR1 = new JRadioButton("Azul", false);
        JRadioButton botonR2 = new JRadioButton("Rojo", true);
        JRadioButton botonR3 = new JRadioButton("Verde", false);

        miGrupo1.add(botonR1);
        miGrupo1.add(botonR2);
        miGrupo1.add(botonR3);

        add(botonR1);
        add(botonR2);
        add(botonR3);

        ButtonGroup miGrupo2=new ButtonGroup();
        JRadioButton botonR4 = new JRadioButton("Masculino", false);
        JRadioButton botonR5 = new JRadioButton("Femenino", false);
        miGrupo2.add(botonR4);
        miGrupo2.add(botonR5);
        add(botonR4);
        add(botonR5);

    }


    class ManejaRadioButton implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {



        }
    }
}
