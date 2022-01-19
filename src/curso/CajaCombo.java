/* ** ** ** ** ** **
 * El ComboBox es un tipo de menu desplegable
 * TODO: Investigar como tener algunas variables super globales a las clases
 *  supongo  que con una interfaz e implementarla (size of fonts)
 *
 *  */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CajaCombo {
    public static void main(String[] args) {
        MarcoCajaCombo miFrame = new MarcoCajaCombo();
        miFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoCajaCombo extends JFrame{
    public MarcoCajaCombo() throws HeadlessException {
        setBounds(550,300,850,450);
        LaminaComboCaja miPanel =  new LaminaComboCaja();
        add(miPanel);
        setVisible(true);
    }
}

class LaminaComboCaja extends JPanel{

    private JLabel texto;
    private JComboBox miMenuDesplegable;

    public LaminaComboCaja() {
        setLayout(new BorderLayout());
        texto = new JLabel("El primero de mayo sali de Munich a las 8:35 de la noche, y llegue a Viena al dia siguiente;");
        texto.setFont(new Font("Serif", Font.PLAIN,18));
        add(texto, BorderLayout.CENTER);

        JPanel laminaNorte = new JPanel();

        miMenuDesplegable = new JComboBox();
        miMenuDesplegable.setEditable(true);        // Permite editar la lista desplegable

        miMenuDesplegable.addItem("Serif");
        miMenuDesplegable.addItem("Lucida Handwriting");
        miMenuDesplegable.addItem("Tahoma");
        miMenuDesplegable.addItem("Comic Sans MS");

        EventoComboBox miEvent = new EventoComboBox();
        miMenuDesplegable.addActionListener(miEvent);

        laminaNorte.add(miMenuDesplegable);
        add(laminaNorte, BorderLayout.NORTH);


    }


    private class EventoComboBox implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            // getSelectedItem() devuelve un objeto, por lo que se realiza un cast Object -> String
            texto.setFont(new Font((String) miMenuDesplegable.getSelectedItem(), Font.PLAIN,18));
        }
    }


}
