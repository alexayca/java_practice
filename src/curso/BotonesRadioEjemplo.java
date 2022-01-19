import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotonesRadioEjemplo {
    public static void main(String[] args) {
        MarcoRadioBotonE miFrame = new MarcoRadioBotonE();
        miFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoRadioBotonE extends JFrame{
    public MarcoRadioBotonE() throws HeadlessException {
        setBounds(550,300,850,350);
        setVisible(true);
        LaminaRadioButtonE miPanel =  new LaminaRadioButtonE();
        add(miPanel);
    }
}

class LaminaRadioButtonE extends JPanel{

    private JLabel texto;
    private JRadioButton botonR1, botonR2, botonR3, botonR4;
    private ButtonGroup miGrupo;
    private JPanel laminaBotones;

    public LaminaRadioButtonE() {
        setLayout(new BorderLayout());
        texto=new JLabel("- Ya veo... - dijo el vampiro, pensativo, y lentamente cruzó la habitacion hacia la ventana.");
        texto.setFont(new Font("Serif", Font.PLAIN, 12));
        add(texto, BorderLayout.CENTER);

        // Las clases se instancian en el constructor, y no dentro del metodo colocarBotones
        laminaBotones = new JPanel();
        miGrupo = new ButtonGroup();

        colocarBotones("Pequeño", false,10);
        colocarBotones("Mediano", true,12);
        colocarBotones("Grande", false,18);
        colocarBotones("Gigante", false,26);

        add(laminaBotones, BorderLayout.SOUTH);
    }

    public void colocarBotones(String nombre, boolean seleccionado, final int tamanio){
        JRadioButton boton = new JRadioButton(nombre, seleccionado);
        miGrupo.add(boton);
        laminaBotones.add(boton);
        // Se instancio el listener (interfaz) dentro de metodo (interfaz interna)
        // al hacer esto genera un problema, con tamanio el cual se requiere sea una constante
        // para que no se pueda modificar, agregando final
        ActionListener miEvento = new ActionListener(){
            @Override
                    public void actionPerformed(ActionEvent e){
                        texto.setFont(new Font("Serif", Font.PLAIN, tamanio));
            }
        };
        boton.addActionListener(miEvento);

    }

    // Se elimina la clase interna, porque no es necesaria para manejar los eventos

}
