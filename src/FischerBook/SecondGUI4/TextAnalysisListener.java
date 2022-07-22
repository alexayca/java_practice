package FischerBook.SecondGUI4;

import java.awt.event.*;
import javax.swing.*;

public class TextAnalysisListener extends KeyAdapter implements ActionListener {

    private TextAnalysisPanelButton taPanel;

    public TextAnalysisListener(TextAnalysisPanelButton t){
        taPanel=t;
    } // constructor

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("This a actionPerformedEvent "+e.getActionCommand());
        taPanel.startAnalysisAndDisplayResult(e.getActionCommand());
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //  e.getSource() instanceof JButton
        String sourceEvent=((JButton)e.getSource()).getText();
        System.out.println("This a keytypedEvent "+String.valueOf(sourceEvent));
        taPanel.startAnalysisAndDisplayResult(sourceEvent);
    }

}
