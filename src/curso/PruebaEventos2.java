import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PruebaEventos2 {
    public static void main(String[] args) {
        MarcoBotones2 miMarco = new MarcoBotones2();
        miMarco.setVisible(true);
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


class MarcoBotones2 extends JFrame{
    public MarcoBotones2(){
        setTitle("Botones y Eventos");
        setBounds(700,300,500,300);
        LaminaBotones2 miLamina = new LaminaBotones2();
        add(miLamina);

    }
}


class LaminaBotones2 extends JPanel{

    JButton blueButton = new JButton("Azul");
    JButton redButton = new JButton("Rojo");
    JButton yellowButton = new JButton("Amarillo");


    public LaminaBotones2(){

        add(blueButton);
        add(redButton);
        add(yellowButton);

        ColorFondo azul = new ColorFondo(Color.BLUE);
        ColorFondo rojo = new ColorFondo(Color.RED);
        ColorFondo amarillo = new ColorFondo(Color.YELLOW);

        blueButton.addActionListener(azul);
        redButton.addActionListener(rojo);
        yellowButton.addActionListener(amarillo);

    }

    // CLASE INTERNA
    // Creamos otro objeto que sera el listener
    private class ColorFondo implements ActionListener{
        private Color colorDeFondo;

        public ColorFondo(Color c){
            colorDeFondo = c;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            setBackground(colorDeFondo);    // Al estar en una clase interna se puede invocar al metodo heredado

        }
    }

}

