package ProgramacionGenerica;

/* T & V are Type Parameters */
public class PrinterGeneric2<T, V> {

    T thingToPrint;
    V otherThing;

    public PrinterGeneric2(T thingToPrint){

        this.thingToPrint = thingToPrint;
    }   // end constructor

    public void print(){

        System.out.println(thingToPrint);
    }
}
