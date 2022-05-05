package ProgramacionGenerica;

import java.io.Serializable;

/* Solo maneja tipos de Animales por el limite que impone la herencia
 * multiples bounds one class and  list the class name firts
 * public class PrinterGenericAnimal<T extends Animal & Serializable ...
 * */
public class PrinterGenericAnimal<T extends Animal> {
    // Animal types
    T animalToPrint;

    public PrinterGenericAnimal(T thingToPrint){

        this.animalToPrint = thingToPrint;
    }   // end constructor

    public void printAnimal(){
        animalToPrint.eat();
        System.out.println(animalToPrint);  // prints address's object
    }
}
