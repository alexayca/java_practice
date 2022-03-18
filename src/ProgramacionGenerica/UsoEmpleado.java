/*
 * Los arrays tradicionales solo permiten un tipo de dato, y su dimension es fija
 * ArrayList
 * ArrayList permite crear listas dinamicas
 *
 *
*/

package ProgramacionGenerica;

public class UsoEmpleado {
    public static void main(String[] args) {
        
        Empleado listaEmpleados[]=new Empleado[3];

        listaEmpleados[0]=new Empleado("Ana", 45, 2500);
        listaEmpleados[1]=new Empleado("Antonio", 55, 2000);
        listaEmpleados[2]=new Empleado("Maria", 25, 2600);

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
