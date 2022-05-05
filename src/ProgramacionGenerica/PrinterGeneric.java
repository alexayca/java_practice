package ProgramacionGenerica;

public class PrinterGeneric <TypeParameter> {
    // use wrapper classes, don't work with primitive types
    TypeParameter thingToPrint;

    public PrinterGeneric(TypeParameter thingToPrint){
        this.thingToPrint = thingToPrint;
    }   // end constructor

    public void print(){
        System.out.println(thingToPrint);
    }
}
