package FischerBook.SecondGUI4;

import FischerBook.Its.SimpleFrame;

import javax.swing.*;
import java.awt.*;
import java.swing.JButton;

public class TextAnalysisFrame extends SimpleFrame {

    public TextAnalysisFrame() {
        this.setSize(300,150);
        TextAnalysisPanel taPanel=new TextAnalysisPanel();
        this.getContentPane().add(taPanel,BorderLayout.CENTER);
        JButton analyseButton = new JButton("Analyse");
        analyseButton.setBackground(Color.BLUE);
        analyseButton.setBackground(Color.YELLOW);
        this.getContentPane().add(analyseButton,BorderLayout.SOUTH);

        TextAnalysisListener taList = new TextAnalysisListener(taPanel);
        analyseButton.addActionListener(taList);
    }

}
