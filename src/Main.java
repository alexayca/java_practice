/*  ******* 
 * Un objeto es una referencia a un espacio en memoria. 
 * Cuando creamos objetos, Java los guarda en la memoria y nos devuelve coordenadas con las que podremos acceder a la información que almacenamos.
 * 
 * Existen dos tipos de memoria: Stack y Heap.
 * La memoria Stack es mucho más rápida y permite almacenar nuestra información de forma “ordenada”. 
 * Aquí se guardan las variables y sus valores de tipos de datos primitivos.
 * Los objetos también usan la memoria Stack, pero no para guardar su información, 
 * sino para guardar las coordenadas a la verdadera ubicación del objeto en la memoria Heap, 
 * una memoria que nos permite guardar grandes cantidades de información, pero con un poco menos de velocidad.
 * ******* */

import java.util.Date;

import ui.UIMenu;

public class Main 
{

	public static void main(String[] args) 
	{
		
        //UIMenu.showMenu();
		
		Doctor miGinecolaga = new Doctor("Dayana", "Ginecologia");

		// Agregamos una nueva cita al doctor
		miGinecolaga.addAvailableAppointment(new Date(), "4pm");
		miGinecolaga.addAvailableAppointment(new Date(), "10am");
		miGinecolaga.addAvailableAppointment(new Date(), "1pm");
		// Muestra la lista de objetos (al parecer direcciones de memoria)
		System.out.println(miGinecolaga.getAvailableAppointments());
		// ciclo foreach para mostrar la lista
		for (Doctor.AvailableAppointment availableAppointment : miGinecolaga.getAvailableAppointments()) {
			System.out.println(availableAppointment.getDate() + " " + availableAppointment.getTime());
		}
		
/*
	        System.out.println("\n\n\n");
	        Patient patient1 = new Patient("Alejandra", "alejandra@mail.com");
	        Patient patient2 = new Patient("Anahi", "anahi@mail.com");

	        // Se muestran las direcciones de memoria
	        System.out.println(patient1 +" Paciente1: " +patient1.getName());
	        System.out.println(patient2 +" Paciente2: " +patient2.getName());
	        patient2 = patient1;	// Asignamos la direccion de memoria de patient1 a patient2

	        System.out.println(patient1 +" Paciente1: " +patient1.getName());
	        System.out.println(patient2 +" Paciente2: " +patient2.getName());
	        
	        // Al parecer no es posible apuntar nuevamente a la direccion de memoria de patient2
	        patient2.setName("Manuel");
	        System.out.println(patient1 +" Paciente1: " +patient1.getName());
	        System.out.println(patient2 +" Paciente2: " +patient2.getName());
*/
	}

}
