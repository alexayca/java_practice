package FischerBook.FirstGUI3;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CounterListener implements ActionListener{ /* interface */

    private CounterPanel countPane;

    public CounterListener(CounterPanel counp){
        countPane = counp;
    }

    // This method is called by the runtime system.
    // the programmer has to add the code to be executed
    // as a response to the event.

    @Override
    public void actionPerformed(ActionEvent e) {
        // Beginning of own code
        String actionCommand = e.getActionCommand(); // extracts the action command out of the event object e
        if (actionCommand.equals("Up")){
            countPane.increment();
        }
        else if (actionCommand.equals("Down")){
            countPane.decrement();
        }
        else if(actionCommand.equals("Reset")){
            countPane.reset();
        }
        else {
            System.out.println("ERROR: Unexpected ActionCommand");
        }
        // End of own code
    }
}
