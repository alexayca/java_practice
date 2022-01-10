package curso;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ObjectStreamException;

public class PruebaEventos {
    public static void main(String[] args) {
        MarcoBotones miMarco = new MarcoBotones();
        miMarco.setVisible(true);
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


class MarcoBotones extends JFrame{
    public MarcoBotones(){
        setTitle("Botones y Eventos");
        setBounds(700,300,500,300);
        LaminaBotones miLamina = new LaminaBotones();
        add(miLamina);

    }
}


class LaminaBotones extends JPanel implements ActionListener {
    // El oyente debe implementar la interfaz ActionListener e incluir los metodos de esta
    JButton blueButton = new JButton("Azul");   // objeto fuente que desencadena el evento
    JButton redButton = new JButton("Rojo");
    JButton yellowButton = new JButton("Amarillo");

    // Constructor
    public LaminaBotones(){
        // El evento se desencadena al hacer clic en el boton
        add(blueButton);
        add(redButton);
        add(yellowButton);
        // El objeto listener sobre el que se desencadena la accion a realizar
        // Sera la lamina al cambiar de color. Ponemos a la escucha a la propia lamina
        blueButton.addActionListener(this); // Con this (listener, el que recibe el evento) nos referimos a esta clase (LaminaBotones) [Action al hacer clic (fuente)]
        redButton.addActionListener(this);
        yellowButton.addActionListener(this);
        // Aqui hay tres objetos fuente (botones) con un listener (this la lamina)

    }

    // Se incluyen el metodo de la interfaz que ejecutara la accion cuando ocurra el evento con el listener
    // El objeto evento viaja automaticamente al objeto ActionEvent e del metodo actionPerformed
    @Override
    public void actionPerformed(ActionEvent e){
        // El metodo recibe constantemente un objeto del tipo ActionEvent de los metodos Listener
        // Sin definir que fuente o quien a desencadenado el evento
        Object botonPulsado = e.getSource();    // Capturar el origen del evento

        if (botonPulsado==blueButton)
            setBackground(Color.BLUE);
        else if (botonPulsado==redButton)
            setBackground(Color.RED);
        else if (botonPulsado==yellowButton) /* pese a que se compara un objeto se usa el operador ==*/
            setBackground(Color.YELLOW);
    }



}
