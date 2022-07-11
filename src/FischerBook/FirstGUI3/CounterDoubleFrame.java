package FischerBook.FirstGUI3;

import FischerBook.Its.SimpleFrame;

import java.awt.*;

public class CounterDoubleFrame extends SimpleFrame {
    public CounterDoubleFrame(){

        CounterPanel counter1Pane = new CounterPanel("Counter A");
        this.getContentPane().add(counter1Pane, BorderLayout.CENTER);
        CounterPanel counter2Pane = new CounterPanel("Counter B");
        this.getContentPane().add(counter2Pane, BorderLayout.SOUTH);
    }
}
