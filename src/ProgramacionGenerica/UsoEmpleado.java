/* ArrayList
 * Los arrays tradicionales solo permiten un tipo de dato, y su dimension es fija
 *
 * ArrayList permite crear listas dinamicas
 * permite almacenar objetos, pero no tipos primitivos
 * los elementos se incluyen en el mismo orden que se van introduciendo
 * Las posiciones empiezan en 0
 *
 * Para recorrer el ArrayList se usa el bucle ForEach, con un bucle Fori
 * no se cuenta con indices, por lo que se vuelve mas conplejo.
 *
 *
 * ArrayList<parametro_de_tipo> nombre_del_arrayList = new ArrayList<parametro_de_tipo>();
 *
 *
*/

package ProgramacionGenerica;

import java.util.ArrayList;
import java.util.Iterator;

public class UsoEmpleado {
    public static void main(String[] args) {
        
/*        Empleado listaEmpleados[]=new Empleado[3];

        listaEmpleados[0]=new Empleado("Ana", 45, 2500);
        listaEmpleados[1]=new Empleado("Antonio", 55, 2000);
        listaEmpleados[2]=new Empleado("Maria", 25, 2600);
*/
        // Se usa el constructor por defecto, con 10 elementos. Reserva este espacio
        // Si son mas crea una copia internamente de si mismo para reservar mas espacio,
        // y se destruye la copia inicial, de forma interna consumiendo mas recursos
        ArrayList<Empleado>listaEmpleados=new ArrayList<Empleado>();

        // Crea inicialmente un espacio para 11 elementos,
        // Para optimizar recursos si se sabe el numero preciso de elementos a almacenar
        // evitando un consumo extra de recursos.
        // Evitando el proceso anterior de crear, transferir y destruir
        listaEmpleados.ensureCapacity(11);

        // Almacenamos datos en su interior con add(), con el tipo de objeto que deseamos anadir
        listaEmpleados.add(new Empleado("Ana", 45, 2500));
        listaEmpleados.add(new Empleado("Antonio", 55, 2000));
        listaEmpleados.add(new Empleado("Maria", 25, 2600));
        listaEmpleados.add(new Empleado("Jose", 35, 2200));
        listaEmpleados.add(new Empleado("Jaime", 35, 2200));

        // Para insertar un elemento en una posicion especifica
        // set incluye o remplaza un objeto
        listaEmpleados.set(1, new Empleado("Olga", 33, 2200));
        // get obtiene un elemento de una posicion deseada
        System.out.println(listaEmpleados.get(1).dameDatos()); // muestra la direccion de memoria

        // Si se sabe que ya no se van a incluir mas elementos
        // Se puede cerrar el array list, optimizando recursos
        // Cortando el exceso de memoria
        listaEmpleados.trimToSize();


        System.out.println(listaEmpleados.size());  // muestra el tamano de la lista

        for (Empleado emp : listaEmpleados) {
            System.out.println(emp.dameDatos());
        }


        // Iterador<tipo_de_elemento> = ArrayList.iterator(); Devuelve un objeto de tipo iterator
        Iterator<Empleado> myIterator = listaEmpleados.iterator();

        while (myIterator.hasNext()) {
            // El iterador devuelve el siguiente elemento (su direccion) con next()
            // o bien se va recorriendo el ArrayList
            System.out.println(myIterator.next().dameDatos());
        }


        for (int i = 0; i < listaEmpleados.size(); i++) {
            Empleado e = listaEmpleados.get(i); // Para obtener la posicion de cada elemento
            System.out.println(e.dameDatos());
        }

        // Tambien se puede copiar el contenido de un ArrayList en un Array convencional
        Empleado arrayConvEmpleados[]=new Empleado[listaEmpleados.size()];
        listaEmpleados.toArray(arrayConvEmpleados); // copia los elementos del arrayList al array tradicional

        for (int i = 0; i < arrayConvEmpleados.length; i++) {
            System.out.println(arrayConvEmpleados[i].dameDatos());
        }

    }
}


