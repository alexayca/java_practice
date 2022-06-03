package FischerBook.Its;

import java.awt.LayoutManager;
import java.awt.Color;

public class LayoutFrame extends SimpleFrame {
    public LayoutFrame(LayoutManager layout) {
        this.getContentPane().setLayout(layout);
        ColorPanel CP1 = new ColorPanel(Color.red,30,30);
        ColorPanel CP2 = new ColorPanel(Color.yellow,40,20);
        ColorPanel CP3 = new ColorPanel(Color.green);
        ColorPanel CP4 = new ColorPanel(Color.blue);
        ColorPanel CP5 = new ColorPanel(Color.white,80,20);

        /* When calling a method of a graphic component
            we sometimes unnecessarily add the key word this
            to make clear to which component the method belongs.
        */
        this.getContentPane().add(CP1);
        this.getContentPane().add(CP2);
        this.getContentPane().add(CP3);
        this.getContentPane().add(CP4);
        this.getContentPane().add(CP5);
    }
}
