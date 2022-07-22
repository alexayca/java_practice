package FischerBook.SecondGUI4;

import javax.swing.*;
import java.awt.*;

public class TextAnalysisPanelButton extends JPanel {

    private TextAnalysisModel analysisModel;
    private TextAnalysisPanel analysisPanel;
    public TextAnalysisPanelButton(TextAnalysisPanel o) {
        analysisPanel=o;
        analysisModel=new TextAnalysisModel();

        JButton analyseButton = new JButton("Analyse");
        analyseButton.setBackground(Color.BLUE);
        analyseButton.setBackground(Color.YELLOW);

        JButton restartButton = new JButton("Reset");
        restartButton.setBackground(Color.BLUE);
        restartButton.setBackground(Color.YELLOW);

        this.add(analyseButton);
        this.add(restartButton);

        TextAnalysisListener taList = new TextAnalysisListener(this);
        analyseButton.addActionListener(taList);
        analyseButton.addKeyListener(taList);

        restartButton.addActionListener(taList);
        restartButton.addKeyListener(taList);
    }

    public void startAnalysisAndDisplayResult(String source){
        String text=analysisPanel.resumeTextInputField();
        if (source=="Reset"){
            analysisModel.resetCounters();
        } else if (source=="Analyse") {
            analysisModel.analyse(text);
        }else {
            System.out.println("Command not found");
        }
        analysisPanel.displayResult(analysisModel);
    }

}
