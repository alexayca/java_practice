package FischerBook.Its;

import java.awt.*;

public class SimplePanelFrame extends SimpleFrame{
    public SimplePanelFrame(){
        ColorPanel CPWest = new ColorPanel(Color.white,50,20);
        ColorPanel CPEast = new ColorPanel(Color.red);
        ColorPanel CPNorth = new ColorPanel(Color.yellow);
        ColorPanel CPSouth = new ColorPanel(Color.green);
        ColorPanel CPCenter = new ColorPanel(Color.blue);

        // obtenemos el Container para agregar los Panels en el BorderLayout
        this.getContentPane().add(CPWest,BorderLayout.WEST);
        this.getContentPane().add(CPEast,BorderLayout.EAST);
        this.getContentPane().add(CPNorth,BorderLayout.NORTH);
        this.getContentPane().add(CPSouth,BorderLayout.SOUTH);
        this.getContentPane().add(CPCenter,BorderLayout.CENTER);
    }
}
