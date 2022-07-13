package FischerBook.FirstGUI3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonsLabelListener implements ActionListener {

    private ButtonsLabelPanel buttonPanel;

    public ButtonsLabelListener(ButtonsLabelPanel buttonPanel) {
        this.buttonPanel = buttonPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("You're pushed a button");
        int actionCommand=Integer.valueOf(e.getActionCommand());
        switch (actionCommand){
            case 1:
                System.out.println("1");
                buttonPanel.showValuePushed(1);
                break;
            case 2:
                System.out.println("2");
                buttonPanel.showValuePushed(2);
                break;
            case 3:
                System.out.println("3");
                buttonPanel.showValuePushed(3);
                break;
            case 4:
                System.out.println("4");
                buttonPanel.showValuePushed(4);
                break;
        }

    }
}
