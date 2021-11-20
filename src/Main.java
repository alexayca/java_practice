/*  ******* 
 * Un objeto es una referencia a un espacio en memoria. 
 * Cuando creamos objetos, Java los guarda en la memoria y nos devuelve coordenadas con las que podremos acceder a la informaciï¿½n que almacenamos.
 * 
 * Existen dos tipos de memoria: Stack y Heap.
 * La memoria Stack es mucho mï¿½s rï¿½pida y permite almacenar nuestra informaciï¿½n de forma ï¿½ordenadaï¿½. 
 * Aquï¿½ se guardan las variables y sus valores de tipos de datos primitivos.
 * Los objetos tambiï¿½n usan la memoria Stack, pero no para guardar su informaciï¿½n, 
 * sino para guardar las coordenadas a la verdadera ubicaciï¿½n del objeto en la memoria Heap, 
 * una memoria que nos permite guardar grandes cantidades de informaciï¿½n, pero con un poco menos de velocidad.
 * 
 * Polimorfismo
 * https://ifgeekthen.nttdata.com/es/polimorfismo-en-java-programaci%C3%B3n-orientada-objetos
 * Los metodos marcados como final o static no se pueden sobrescribir.
 * Final es para definir algo que no va a cambiar.
 * Static es para hacer mas global un elemento
 * 
 * El Polimorfismo es una característica de la programación orientada a objetos que consiste en sobrescribir algunos métodos de la clase 
 * de la cual heredan nuestras subclases para asignar comportamientos diferentes.
 * 
 * Además de los métodos de las superclases, también podemos redefinir el comportamiento de los métodos que “heredan” todos nuestros objetos, 
 * así como .toString, hashCode, finalize, notify, entre otros.
 * 
 * La sobreescritura de constructores consiste en usar los miembros heredados de una supreclase pero con argumentos diferentes.
 * 
 * Recuerda que no podemos sobrescribir los métodos marcados como final o static.
 * 
 * ******* */

import java.util.Date;

import model.Doctor;
import model.Patient;
import model.User;
import ui.UIMenu;

public class Main 
{

	public static void main(String[] args) 
	{
		
        //UIMenu.showMenu();
		
		Doctor miGinecolaga = new Doctor("Dayana", "Ginecologia@correo.com");

		// Agregamos una nueva cita al doctor
		miGinecolaga.addAvailableAppointment(new Date(), "4pm");
		miGinecolaga.addAvailableAppointment(new Date(), "10am");
		miGinecolaga.addAvailableAppointment(new Date(), "1pm");
		// Muestra la lista de objetos (el hashCode)
		System.out.println(miGinecolaga.getAvailableAppointments());
		// ciclo foreach para mostrar la lista
		for (Doctor.AvailableAppointment availableAppointment : miGinecolaga.getAvailableAppointments()) {
			System.out.println(availableAppointment.getDate() + " " + availableAppointment.getTime());
		}
		
		// Observe como aplica el polimorfisco 
		// Se instancia la clase User como Doctor
		User user = new Doctor("Anahi", "ana@ana.com");

	        System.out.println("\n\n\n");
	        Patient patient1 = new Patient("Alejandra", "alejandra@mail.com");
	        Patient patient2 = new Patient("Anahi", "anahi@mail.com");

	        /* Cuando se imprime un objeto el metodo toString se llama implicitamente
	         * para llamarlo explicitamente: System.out.println(patient.toString());
	         * Vease como se muestra la informacion completa decada usuario en particular
	         * */
	        System.out.println(patient1);
	        System.out.println(miGinecolaga);
	        

	}

}
