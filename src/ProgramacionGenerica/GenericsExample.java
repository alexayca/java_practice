/* * * * * * * * * *
 * La programacion generica ofrece la capacidad de usar una misma clase
 * que es flexible para muchos tipos de datos. En ella se define un
 * parametro <T> que recibe el tipo de dato.
 * Normalmente la programacion generica es usada todo el tiempo con java collections
 *
 *
 *
 * printer for whatever type we want
 * https://www.youtube.com/watch?v=K1iu1kXkVoA
 * * * * * * * * * */
package ProgramacionGenerica;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {
    public static void main(String[] args) {
        // we're passing in the angle brackets
        PrinterGeneric<Integer> printerInteger = new PrinterGeneric<>(256);
        printerInteger.print();

        PrinterGeneric<String> printerString = new PrinterGeneric<>("Hello");
        printerString.print();

        /* Object es generico a diferencia de Cat */
        ArrayList<Object> cats = new ArrayList<>();
        //ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new Cat());
        /* muestra un error porque el tipo de dato del arrayList es Cat,
            al obtener el segundo elemento de la lista */
        cats.add(new Dog());

        Cat myCat = (Cat) cats.get(0);  // cast

        /* * * * * * * * * * * * * *  * * * * * * * * * * * * * * * * * * * *  * * * * * */
        PrinterGenericAnimal<Cat> printerCat = new PrinterGenericAnimal<>(new Cat());
        printerCat.printAnimal();

        PrinterGenericAnimal<Dog> printerDog = new PrinterGenericAnimal<>(new Dog());
        printerDog.printAnimal();

        shout("Alex", 101);
        shout(57, 2022);
        shout(new Cat(), "Cute cat");

        /* * * * * * * * * * * * * *  * * * * * * * * * * * * * * * * * * * *  * * * * * */
        List<Integer> intList = new ArrayList<>();
        intList.add(3);
        /* this is where a wildcard will work to solve problem so instead
        *of saying that this is a list of objects we say that is going to
        * be a list of unknown by passing in a question mark this is the wildcard
        * You use a  wildcard a question mark as the tyoe parameter when you're using
        * a generic when you don't know what exactly that generic type is going to be
        * */
        printListGeneric(intList);

        List<Cat> catList = new ArrayList<>();
        catList.add(new Cat());
        printList(catList);

    }

    // Generic method signature. GenericTypes T & V
    private static <T, V> void shout(T thinhToShout, V otherThing){
        System.out.print(thinhToShout + " !!!!!!!\t");
        System.out.println(otherThing + " ?????");
    }

    // Overload method return T
    private static <T> T shout(T thinhToShout){
        System.out.print(thinhToShout + " !!!!!!!\t");
        return thinhToShout;
    }

    /* List<Object>     List<?>      Object is remplaced by WildCard ?
    */
    private static void printListGeneric(List<?> myList){
        System.out.println(myList);
    }

    /* this is a list of something that extends
    * */
    private static void printList(List<? extends Animal> myList){
        System.out.println(myList);
    }
}
