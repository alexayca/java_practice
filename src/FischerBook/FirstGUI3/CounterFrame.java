package FischerBook.FirstGUI3;

import FischerBook.Its.SimpleFrame;

import java.awt.*;

public class CounterFrame extends SimpleFrame {
    public CounterFrame(){
        CounterPanel counterPane = new CounterPanel();
        // frame.getContentPane ...
        this.getContentPane().add(counterPane, BorderLayout.CENTER);
    }
}
