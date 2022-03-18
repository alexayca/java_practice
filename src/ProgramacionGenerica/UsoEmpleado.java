/* ArrayList
 * Los arrays tradicionales solo permiten un tipo de dato, y su dimension es fija
 *
 * ArrayList permite crear listas dinamicas
 * permite almacenar objetos, pero no tipos primitivos
 * los elementos se incluyen en el mismo orden que se van introduciendo
 *
 * ArrayList<data_type> nombre_del_arrayList
 *
*/

package ProgramacionGenerica;

import java.util.ArrayList;

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
        listaEmpleados.add(new Empleado("jose", 35, 2200));
        listaEmpleados.add(new Empleado("Pedro", 22, 2200));

        // Si se sabe que ya no se van a incluir mas elementos
        // Se puede cerrar el array list, optimizando recursos
        // Cortando el exceso de memoria
        listaEmpleados.trimToSize();


        System.out.println(listaEmpleados.size());  // muestra el tamano de la lista

        for (Empleado emp : listaEmpleados) {
            System.out.println(emp.dameDatos());
        }
    }
}


/**
 * Empleado
 */
class Empleado{

    private String nombre;
    private int edad;
    private double salario;

    public Empleado(String nombre, int edad, double salario){
        this.nombre=nombre;
        this.edad=edad;
        this.salario=salario;
    }


    public String dameDatos(){
        return "El empleado se llama " +nombre+". Tiene " +edad +" anios. Y un salario de " +salario;
    }


}
