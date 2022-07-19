package FischerBook.SecondGUI4;

import java.awt.event.*;

public class TextAnalysisListener implements ActionListener, KeyListener {

    private TextAnalysisPanel taPanel;

    public TextAnalysisListener(TextAnalysisPanel t){
        taPanel=t;
    } // constructor

    @Override
    public void actionPerformed(ActionEvent e) {
        taPanel.startAnalysisAndDisplayResult();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        taPanel.startAnalysisAndDisplayResult();
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
