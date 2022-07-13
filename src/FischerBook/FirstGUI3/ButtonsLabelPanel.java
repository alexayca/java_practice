package FischerBook.FirstGUI3;

import javax.swing.*;
import java.awt.*;

public class ButtonsLabelPanel extends JPanel {
    private JLabel titleLabel=new JLabel("Exercise 3.3",0);
    private JLabel labelLastButtonPushed;
    private ButtonsLabelModel lastvalue;

    public ButtonsLabelPanel(){
        lastvalue=new ButtonsLabelModel();
        labelLastButtonPushed=new JLabel("No button pushed",SwingConstants.CENTER);

        BorderLayout layoutNCS=new BorderLayout();
        this.setLayout(layoutNCS);

        GridLayout gridLayout=new GridLayout(2,2);
        JPanel gridPanel=new JPanel();
        gridPanel.setLayout(gridLayout);

        JButton button1=new JButton("1");
        JButton button2=new JButton("2");
        JButton button3=new JButton("3");
        JButton button4=new JButton("4");

        gridPanel.add(button1);
        gridPanel.add(button2);
        gridPanel.add(button3);
        gridPanel.add(button4);

        this.add(titleLabel,BorderLayout.NORTH);
        this.add(gridPanel,BorderLayout.CENTER);
        this.add(labelLastButtonPushed,BorderLayout.SOUTH);

        ButtonsLabelListener buttonListener=new ButtonsLabelListener(this);
        button1.addActionListener(buttonListener);
        button2.addActionListener(buttonListener);
        button3.addActionListener(buttonListener);
        button4.addActionListener(buttonListener);

    }   // constructor

    public void showValuePushed(int v){
        lastvalue.setvaluePushed(v);
        labelLastButtonPushed.setText("Last button pushed was no. "+lastvalue.getvaluePushed());
    }


}
