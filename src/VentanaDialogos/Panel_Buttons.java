package VentanaDialogos;

import javax.swing.*;

public class Panel_Buttons extends JPanel {

    private ButtonGroup grupoBotones;

    public Panel_Buttons(String titulo, String [] opciones) {

        setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), titulo));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        grupoBotones = new ButtonGroup();
        for (int i=0; i<opciones.length;i++){
            JRadioButton button = new JRadioButton(opciones[i]);
            // establecemos la accion del boton
            button.setActionCommand(opciones[i]);
            // agregamos el boton
            add(button);
            grupoBotones.add(button);
            button.setSelected(i==0);       // para tener el primer boton seleccionado
        }

    }

    public String dameSeleccion(){

        ButtonModel buttonSelected = grupoBotones.getSelection(); // almacena el JRadioButton seleccionado
        String s = buttonSelected.getActionCommand();   // devuelve el mensaje de la opcion de comando
        return s;
        //return grupoBotones.getSelection().getActionCommand();    // metodo en una linea

    }
}
