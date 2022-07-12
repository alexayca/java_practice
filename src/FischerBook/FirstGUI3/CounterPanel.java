package FischerBook.FirstGUI3;

import javax.swing.*;
import java.awt.*;

public class CounterPanel extends JPanel {
    private CounterModel counter;
    private JLabel valueLabel;

    public CounterPanel(String label){
        counter = new CounterModel();

        BorderLayout bordLay = new BorderLayout();
        this.setLayout(bordLay);

        JButton upButton = new JButton("Up");
        JButton downButton = new JButton("Down");
        JButton resetButton = new JButton("Reset");
        valueLabel = new JLabel(""+counter.getValue(),SwingConstants.CENTER);

        upButton.setToolTipText("Incrementar");
        downButton.setToolTipText("Disminuir");
        resetButton.setToolTipText("Restablecer a 0");

        this.add(new JLabel(label,JLabel.CENTER),BorderLayout.NORTH);
        this.add(downButton,BorderLayout.WEST);
        this.add(upButton,BorderLayout.EAST);
        this.add(valueLabel,BorderLayout.CENTER);
        this.add(resetButton,BorderLayout.SOUTH);

        // The next three lines are used to incorporate the listener
        CounterListener countList = new CounterListener(this);
        upButton.addActionListener(countList);
        downButton.addActionListener(countList);
        resetButton.addActionListener(countList);

        CounterKeyAdapter cka=new CounterKeyAdapter(this);
        upButton.addKeyListener(cka);
        downButton.addKeyListener(cka);

    }

    public void increment(){
        counter.increment();
        this.setValueCounter();
    }

    public void decrement(){
        counter.decrement();
        this.setValueCounter();
    }

    public void reset(){
        counter.reset();
        this.setValueCounter();
    }

    private void setValueCounter(){
        valueLabel.setText(""+counter.getValue());
    }

}   // class
