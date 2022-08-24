package FischerBook.SecondGUI4;

import javax.swing.*;

public class TrafficLightPanelButtons extends JPanel {
    public TrafficLightPanelButtons(){
        JButton buttonRed =new JButton("Red");
        JButton buttonYellow =new JButton("Yellow");
        JButton buttonGreen =new JButton("Green");

        this.add(buttonRed);
        this.add(buttonYellow);
        this.add(buttonGreen);
    }
}
