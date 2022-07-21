package FischerBook.SecondGUI4;

import java.awt.event.*;

public class TextAnalysisListener implements ActionListener, KeyListener {

    private TextAnalysisPanelButton taPanel;

    public TextAnalysisListener(TextAnalysisPanelButton t){
        taPanel=t;
    } // constructor

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("This a actionPerformedEvent");
        taPanel.startAnalysisAndDisplayResult();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("This a keytypedEvent");
        taPanel.startAnalysisAndDisplayResult();
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
