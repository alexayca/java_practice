package FischerBook.SecondGUI4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextAnalysisListener implements ActionListener {

    private TextAnalysisPanel taPanel;

    public TextAnalysisListener(TextAnalysisPanel t){
        taPanel=t;
    } // constructor

    @Override
    public void actionPerformed(ActionEvent e) {
        taPanel.startAnalysisAndDisplayResult();
    }
}
