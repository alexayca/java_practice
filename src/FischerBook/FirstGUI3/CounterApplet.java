package FischerBook.FirstGUI3;
import javax.swing.JApplet; // it's deprecated
import java.awt.*;


public class CounterApplet extends JApplet {
    public void init(){
        CounterPanel cPane=new CounterPanel("Counter");
        this.getContentPane().add(cPane, BorderLayout.CENTER);
    }

    public void start(){
        System.out.println("Start");
    }

    public void stop(){
        System.out.println("Stop");
    }

    public void destroy(){
        System.out.println("Destroy");
    }
}
