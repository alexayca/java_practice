/* * * * * * *
 * https://www.youtube.com/watch?v=NbYgm0r7u6o
 *
 *  */
package antologia;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList {
    public static void main(String[] args) {

        // Create
        /* puede tener primitivos u objetos */
        String[] friendsArray = new String[4];   // nunca cambian una vez creados
        String[] friendsArray2 = {"John","Chris","Eric","Luke"};

        /* Solo puede contener objetos, pero soporta wrapper types de los primitivos */
        ArrayList<String> friendsArrayList = new ArrayList<>(); // Crece y se ajusta automaticamente
        ArrayList<String> friendsArrayList2 =
                new ArrayList<>(Arrays.asList("John","Chris","Eric","Luke"));

        // Get element
        System.out.println(friendsArray2[1]);
        System.out.println(friendsArrayList2.get(1));

        // Get size
        System.out.println(friendsArray2.length);
        System.out.println(friendsArrayList2.size());

        // Add elements
        // Can't add an element to the end of the array due to it having a fixed size
        friendsArrayList2.add("Juliette");
        System.out.println(friendsArrayList2.get(4));

        // Set an element
        friendsArray[0] = "Carl Jr";
        System.out.println(friendsArray[0]);
        friendsArrayList2.set(1,"Susy");     // remplaza, si se introduce nuevo genera error
        System.out.println(friendsArrayList2.get(0));

        // Remove an element
        // Arrays can't remove elements, due to its fixed size
        friendsArrayList2.remove("Chris");
        System.out.println(friendsArrayList2.get(1));

        // Print. printing arrays is pretty useless, printing arrayList works perfectly
        System.out.println(friendsArray);
        System.out.println(friendsArrayList2);


    }
}
