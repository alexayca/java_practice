package FischerBook.FirstGUI3;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class CounterKeyAdapter extends KeyAdapter {

    private CounterPanel counterPanel;

    public CounterKeyAdapter(CounterPanel cp){
        counterPanel=cp;
    }

    @Override
    public void keyPressed(KeyEvent e){
        int keyCode=e.getKeyCode();
        Object source=e.getComponent();
        System.out.println("Source "+source);
        if (keyCode==38)
            counterPanel.increment();
        if (keyCode==40)
            counterPanel.decrement();
    }

}
