package FischerBook.SecondGUI4;

import javax.swing.*;
import java.awt.*;

public class TextAnalysisPanel extends JPanel {

    private JLabel lastTextLabel;
    private JLabel numberOfEsLabel;
    private JLabel numberOfTextsLabel;
    private JLabel numberTextsAnalysed;
    private JLabel numberEsSeen;
    private JTextField inputField;
    private TextAnalysisModel analysisModel;

    public TextAnalysisPanel() {
        analysisModel=new TextAnalysisModel();

        this.setBackground(Color.YELLOW);
        this.setLayout(new GridLayout(5,2,10,10));
        JLabel questionLabel =new JLabel("Enter text: ");
        JLabel replyLabel=new JLabel("Current text: ");
        JLabel numberTextLabel=new JLabel("No. of Es in current text: ");
        JLabel totalEs=new JLabel("Total number of E's seen: ");
        lastTextLabel=new JLabel("");
        lastTextLabel.setHorizontalAlignment(SwingConstants.CENTER);
        numberOfEsLabel=new JLabel("--");
        numberOfEsLabel.setHorizontalAlignment(SwingConstants.CENTER);
        numberOfTextsLabel=new JLabel("Number of all texts analysed: ");
        numberTextsAnalysed=new JLabel(" - - ");
        numberTextsAnalysed.setHorizontalAlignment(SwingConstants.CENTER);
        numberEsSeen=new JLabel(" - - ");
        numberEsSeen.setHorizontalAlignment(SwingConstants.CENTER);
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

        numberOfTextsLabel.setOpaque(true);
        numberOfTextsLabel.setBackground(Color.BLACK);
        numberOfTextsLabel.setForeground(Color.WHITE);

        totalEs.setOpaque(true);
        totalEs.setBackground(Color.BLACK);
        totalEs.setForeground(Color.WHITE);

        numberOfEsLabel.setOpaque(true);
        numberOfEsLabel.setBackground(Color.RED);
        numberOfEsLabel.setForeground(Color.WHITE);

        lastTextLabel.setOpaque(true);
        lastTextLabel.setBackground(Color.RED);
        lastTextLabel.setForeground(Color.WHITE);

        numberTextsAnalysed.setOpaque(true);
        numberTextsAnalysed.setBackground(Color.RED);
        numberTextsAnalysed.setForeground(Color.WHITE);

        numberEsSeen.setOpaque(true);
        numberEsSeen.setBackground(Color.RED);
        numberEsSeen.setForeground(Color.WHITE);

        this.add(questionLabel);
        this.add(inputField);
        this.add(replyLabel);
        this.add(lastTextLabel);
        this.add(numberTextLabel);
        this.add(numberOfEsLabel);
        this.add(numberOfTextsLabel);
        this.add(numberTextsAnalysed);
        this.add(totalEs);
        this.add(numberEsSeen);
    }

    public void startAnalysisAndDisplayResult(){
        String text=inputField.getText();
        analysisModel.analyse(text);
        lastTextLabel.setText(analysisModel.getCurrentText());
        int noOfEs=analysisModel.getCurrentNumberOfEs();
        numberOfEsLabel.setText(Integer.toString(noOfEs));
        numberTextsAnalysed.setText(Integer.toString(analysisModel.getTotalNumberOfTexts()));
        numberEsSeen.setText(Integer.toString(analysisModel.getTotalNumberOfEs()));
        inputField.setText("");
    }
}
