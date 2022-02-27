package curso;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tipos_Cuadro_Dialogos {
    public static void main(String[] args) {
        FrameCuadrosDialogos myFrame = new FrameCuadrosDialogos();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    }
}


class FrameCuadrosDialogos extends JFrame{
    public FrameCuadrosDialogos(){
        setBounds(500,300,400,250);
        add(new PanelCuadroDialogo());
    }
}


class PanelCuadroDialogo extends JPanel{

    private JButton botonA, botonB, botonC, botonD;

    public PanelCuadroDialogo() {

        botonA = new JButton("Boton A");
        botonB = new JButton("Boton B");
        botonC = new JButton("Boton C");
        botonD = new JButton("Boton D");

        botonA.addActionListener(new AccionBotones());
        botonB.addActionListener(new AccionBotones());
        botonC.addActionListener(new AccionBotones());
        botonD.addActionListener(new AccionBotones());

        add(botonA);
        add(botonB);
        add(botonC);
        add(botonD);
    }

    private class AccionBotones implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==botonA){
                System.out.println("Pulsaste boton A");
                // Indico que pertenece a una clase interna que se encuentra dentro del panel (clase donde se encuentra)
                // solo this haria referencia a la clase privada
                JOptionPane.showMessageDialog(PanelCuadroDialogo.this,"Ventana de mensaje de dialogo");
            }else if (e.getSource()==botonB) {
                System.out.println("Pulsaste boton B");
                JOptionPane.showInputDialog(PanelCuadroDialogo.this,"Introduce el dato", "Introduccion datos",2);
            }else if (e.getSource()==botonC) {
                JOptionPane.showConfirmDialog(PanelCuadroDialogo.this,"Elige opcion", "V Confirmar",1);
                System.out.println("Pulsaste boton C");
            }else {
                JOptionPane.showOptionDialog(PanelCuadroDialogo.this,"Elige","Titulo de ventana",1,1,null,null,null);
                System.out.println("Pulsaste boton D");
            }

        }
    }
}

