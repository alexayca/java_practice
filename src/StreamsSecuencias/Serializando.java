/* * * * * * * * *
*
*
* * * * * * * * */

package StreamsSecuencias;


import java.util.*;
import java.io.*;

public class Serializando {

    public static void main(String[] args) {

        Administrador jefe = new Administrador("Juan", 80000, 2022, 05, 11);
        jefe.setIncentivo(5000);

        Empleado[] personal = new Empleado[3];  // Se serializara el array de objetos personal

        personal[0] = jefe;
        personal[1] = new Empleado("Ana", 25000,2008,10,1);
        personal[2] = new Empleado("Luis", 18000,2012,9,15);

        try {
            // -- flujo de datos hacia el exterior, guardando el archivo --
            ObjectOutputStream escribiendoFichero =
                    new ObjectOutputStream(new FileOutputStream("C:\\tmp\\empleado.dat"));

            // escribimos el objeto que llevamos al exterior
            escribiendoFichero.writeObject(personal);
            escribiendoFichero.close();

            // -- flujo de datos hacia el interior --
            ObjectInputStream recuperandoFichero =
                    new ObjectInputStream(new FileInputStream("C:\\tmp\\empleado.dat"));

            Empleado[] personalRecuperado=(Empleado[]) recuperandoFichero.readObject(); // cast del archivo leido como Object
            recuperandoFichero.close();

            // Leyendo el archivo
            for (Empleado e : personalRecuperado){
                System.out.println(e);  // utilizamos el metodo override toString 
            }

        }catch (Exception e){

        }
    }

}


// -----------------------------------------------------------------------------------------
class Empleado implements Serializable{ /* permite serializar la clase */
    private String nombre;
    private double sueldo;
    private Date fechaContrato;

    public Empleado(String n, double s, int agno, int mes, int dia){
        nombre = n;
        sueldo = s;
        GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
        fechaContrato = calendario.getTime();
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getSueldo() {
        return sueldo;
    }
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    public Date getFechaContrato() {
        return fechaContrato;
    }
    public void setFechaContrato(Date fechaContrato) {
        this.fechaContrato = fechaContrato;
    }
    public void SubirSueldo(double porcentaje){
        double aumento = sueldo*porcentaje/100;
        sueldo+=aumento;
    }
    public String toString(){
        return "Nombre = " + nombre + " ,su sueldo es " + sueldo + " , fecha de contrato: " + fechaContrato;
    }

}


// -----------------------------------------------------------------------------------------
class Administrador extends Empleado{
    private double incentivo;

    public Administrador(String n, double s, int agno, int mes, int dia){
        super(n,s,agno,mes,dia);
        incentivo = 0;
    }

    public double getSueldo() {
        double sueldoBase = super.getSueldo();
        return sueldoBase+incentivo;
    }
    public void setIncentivo(double incentivo) {
        this.incentivo = incentivo;
    }
    public String toString(){
        return super.toString()+ " Incentivo = " + incentivo;
    }

}
