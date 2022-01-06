/* ** ** **
 * Las estructuras de árbol pertenecen al grupo de estructuras de datos no lineales, es decir, 
 * donde toda la información es almacenada con un orden específico. En estas estructuras tenemos 
 * “troncos” principales con diferentes ramificaciones que surgen a partir de ellos. Son muy útiles 
 * para trabajar con grandes cantidades de datos organizados de forma jerárquica.
 * 
 * La forma de implementarlos en Java es usando un Map de tipo TreeMap. Recuerda que también 
 * podemos guardar Maps dentro de otros Maps. De esta forma podemos definir una lista ordenada de doctores 
 * y sus fechas disponibles para agendar citas médicas.
 * 
 * ** ** **/
package ui;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import model.Doctor;

public class UIPatientMenu {
	
	public static void showPatientMenu() {
		int response = 0;
		do {
			System.out.println("\n\n");
			System.out.println("::MENU Patient");
			System.out.println("Welcome " + UIMenu.patientLogged.getName() +"\n\tChoose an option: ");
			System.out.println("\t1. Book an Appointment");
			System.out.println("\t2. My Appointment");
			System.out.println("\t0. Logout");
			
			Scanner sc = new Scanner(System.in);
			response = Integer.valueOf(sc.nextLine());
			
			switch (response) {
			case 1:
				
				break;

			case 2:
				
				break;
				
			case 0:
				UIMenu.showMenu();
				break;
			}
			
		} while (response !=0);
	}
	
	
	private static void showBookAppointmentMenu() {
		int response = 0;
		do {
			System.out.println("::Book an Appointment");
			System.out.println(":: Select date");
			// Mostrar las fechas de los doctores que dejaron fechas disponibles 
			// Integer: numeracion de la lista de fechas (primer key)
			// Integer: indice de la fecha que seleccione el usuario (2o key)
			// Value sera [Doctor]
			Map<Integer, Map<Integer, Doctor>> doctors = new TreeMap<>();
			int k = 0;	// primer key1
			
			for (int i = 0; i < UIDoctorMenu.doctorsAvailableAppointments.size(); i++) {
				ArrayList<Doctor.AvailableAppointment> availableAppointments 
				= UIDoctorMenu.doctorsAvailableAppointments.get(i).getAvailableAppointments();
				
				Map<Integer, Doctor> doctorAppointments = new TreeMap<>();
				
				for (int j = 0; j < availableAppointments.size(); j++) {
					k++;
					System.out.println(k + ". " + availableAppointments.get(j).getDate());
					doctorAppointments.put(Integer.valueOf(j), UIDoctorMenu.doctorsAvailableAppointments.get(i)); // no se pueden recibir primitivos en Maps, recibe objetos
					doctors.put(Integer.valueOf(k), doctorAppointments);
				}
			}
			
		} while (response !=0);
	}

}
