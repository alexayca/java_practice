package FischerBook.FirstGUI3;
/* * * * * * * * * * * * * * * *
* The model part of the program deals with storing,
* maintaining or manipulating the data.
* The graphical view part displays the data and
* provides the components for user interaction.
* The control  part ensures that the user actions
* result in the desired responses by the program.
* The control part is the bridge between the model
* and view parts.
*
*
* */

public class CounterModel {

    private int value;

    // the constructor initializes the counter to 0
    public CounterModel(){
        value =0;
    }

    public void increment(){
        value++;
    }
    public void decrement(){
        value--;
    }
    public void reset(){
        value=0;
    }
    public int getValue(){
        return(value);
    }

}
