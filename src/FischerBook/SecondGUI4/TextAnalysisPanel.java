package FischerBook.SecondGUI4;

import javax.swing.*;
import java.awt.*;

public class TextAnalysisPanel extends JPanel {

    private JLabel lastTextLabel;
    private JLabel numberOfEsLabel;
    private JLabel numberOfTextsLabel;
    private JTextField inputField;
    private TextAnalysisModel analysisModel;

    public TextAnalysisPanel() {
        analysisModel=new TextAnalysisModel();

        this.setBackground(Color.YELLOW);
        this.setLayout(new GridLayout(3,2,10,10));
        JLabel questionLabel =new JLabel("Enter text: ");
        JLabel replyLabel=new JLabel("Current text: ");
        JLabel numberTextLabel=new JLabel("No. of Es in current text: ");
        lastTextLabel=new JLabel("");
        numberOfEsLabel=new JLabel("--");
        inputField=new JTextField("");

        questionLabel.setOpaque(true);
        questionLabel.setBackground(Color.BLACK);
        questionLabel.setForeground(Color.WHITE);

        replyLabel.setOpaque(true);
        replyLabel.setBackground(Color.BLACK);
        replyLabel.setForeground(Color.WHITE);

        numberTextLabel.setOpaque(true);
        numberTextLabel.setBackground(Color.BLACK);
        numberTextLabel.setForeground(Color.WHITE);

        numberOfEsLabel.setOpaque(true);
        numberOfEsLabel.setBackground(Color.RED);
        numberOfEsLabel.setForeground(Color.WHITE);

        lastTextLabel.setOpaque(true);
        lastTextLabel.setBackground(Color.RED);
        lastTextLabel.setForeground(Color.WHITE);

        this.add(questionLabel);
        this.add(inputField);
        this.add(replyLabel);
        this.add(lastTextLabel);
        this.add(numberTextLabel);
        this.add(numberOfEsLabel);
    }

    public void startAnalysisAndDisplayResult(){
        String text=inputField.getText();
        analysisModel.analyse(text);
        lastTextLabel.setText(analysisModel.getCurrentText());
        int noOfEs=analysisModel.getCurrentNumberOfEs();
        numberOfEsLabel.setText(Integer.toString(noOfEs));
        inputField.setText("");
    }
}
