/* * * * * * * * * * * * * * * * *
 * Write an application that displays four buttons labelled ‘1’,
 * ‘2’, ‘3’ and ‘4’ and a label. Arrange the components as shown
 * in Figure 3.7. The label initially displays the text ‘No button
 * pushed’. When one of the four buttons is pushed the text in the
 * label changes to ‘Last button pushed was no. X’, where X is the
 * number of the button.
 *
 * */
package FischerBook.FirstGUI3;

public class ButtonsLabelModel {
    private int valuePushed;

    public ButtonsLabelModel() {
        this.valuePushed = 0;
    }   // constructor

    public void setvaluePushed(int value) {
        this.valuePushed = value;
    }

    public int getvaluePushed() {
        return valuePushed;
    }
}
