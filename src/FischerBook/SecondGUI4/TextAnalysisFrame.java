package FischerBook.SecondGUI4;

import FischerBook.Its.SimpleFrame;

import java.awt.*;
import javax.swing.JButton;

public class TextAnalysisFrame extends SimpleFrame {

    public TextAnalysisFrame() {
        this.setSize(350,220);
        TextAnalysisPanel taPanel=new TextAnalysisPanel();
        this.getContentPane().add(taPanel,BorderLayout.CENTER);
        JButton analyseButton = new JButton("Analyse");
        analyseButton.setBackground(Color.BLUE);
        analyseButton.setBackground(Color.YELLOW);
        this.getContentPane().add(analyseButton,BorderLayout.SOUTH);

        TextAnalysisListener taList = new TextAnalysisListener(taPanel);
        analyseButton.addActionListener(taList);
        analyseButton.addKeyListener(taList);
    }

}
