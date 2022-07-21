package FischerBook.SecondGUI4;

import FischerBook.Its.SimpleFrame;

import java.awt.*;
import javax.swing.JButton;

public class TextAnalysisFrame extends SimpleFrame {

    public TextAnalysisFrame() {
        this.setSize(350,220);
        TextAnalysisPanel taPanel=new TextAnalysisPanel();
        this.getContentPane().add(taPanel,BorderLayout.CENTER);
        TextAnalysisPanelButton tapButton=new TextAnalysisPanelButton(taPanel);
        this.getContentPane().add(tapButton,BorderLayout.SOUTH);

    }

}
