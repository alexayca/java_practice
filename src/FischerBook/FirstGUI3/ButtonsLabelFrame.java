package FischerBook.FirstGUI3;

import FischerBook.Its.SimpleFrame;

public class ButtonsLabelFrame extends SimpleFrame {
    public ButtonsLabelFrame() {
        ButtonsLabelPanel buttonsPanel=new ButtonsLabelPanel();
        this.getContentPane().add(buttonsPanel);
    }
}
