package VentanaDialogos;

import javax.swing.*;

public class Panel_Buttons extends JPanel {

    public Panel_Buttons(String titulo, String [] opciones) {

        setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), titulo));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        ButtonGroup grupoBotones = new ButtonGroup();
        for (int i=0; i<opciones.length;i++){
            JRadioButton button = new JRadioButton(opciones[i]);
            add(button);
            grupoBotones.add(button);
            button.setSelected(i==0);
        }

    }
}
