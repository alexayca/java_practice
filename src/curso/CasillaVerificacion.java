import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CasillaVerificacion {
    public static void main(String[] args) {
        MarcoCheck miFrame = new MarcoCheck();
        miFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoCheck extends JFrame{
    public MarcoCheck() throws HeadlessException {
        setBounds(550,300,550,350);
        setVisible(true);
        LaminaCheck miPanel =  new LaminaCheck();
        add(miPanel);
    }
}

class LaminaCheck extends JPanel{

    private JLabel texto;
    private JCheckBox check1, check2;

    public LaminaCheck() {
        setLayout(new BorderLayout());

        Font miLetra = new Font("Serif", Font.PLAIN, 24);
        texto = new JLabel("En una galaxia muy muy lejana ...");
        texto.setFont(miLetra);

        JPanel PanelText = new JPanel();
        PanelText.add(texto);
        add(PanelText, BorderLayout.CENTER);

        check1 = new JCheckBox("Negrita");
        check2 = new JCheckBox("Cursiva");

        check1.addActionListener(new ManejaChecks());
        check2.addActionListener(new ManejaChecks());

        JPanel PanelChecks = new JPanel();
        PanelChecks.add(check1);
        PanelChecks.add(check2);
        add(PanelChecks, BorderLayout.SOUTH);

    }

    class ManejaChecks implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            int tipo=0;
            if (check1.isSelected()) tipo+=Font.BOLD;
            if (check2.isSelected()) tipo+=Font.ITALIC;

            texto.setFont(new Font("Serif", tipo, 24));


        }
    }
}
