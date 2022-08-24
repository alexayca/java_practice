package FischerBook.SecondGUI4;

import FischerBook.Its.SimpleFrame;

import java.awt.*;

public class TrafficLightFrame extends SimpleFrame {
    public TrafficLightFrame(){
        this.setSize(440,220);

        TrafficLightPanelButtons tlpButtons=new TrafficLightPanelButtons();
        TrafficLightPanel tlPanel=new TrafficLightPanel();

        this.getContentPane().add(tlPanel, BorderLayout.NORTH);
        this.getContentPane().add(tlpButtons,BorderLayout.CENTER);

    }
}
