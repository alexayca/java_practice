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
				showBookAppointmentMenu();
				break;

			case 2:
				showPatientMyAppoinments();
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
			
			Scanner sc = new Scanner(System.in);
			int responseDateSelected = Integer.valueOf(sc.nextLine());
			Map<Integer, Doctor> doctorAvailableSelected = doctors.get(responseDateSelected);
			Integer indexDate = 0;
			Doctor doctorSelected = new Doctor("","");	// doctor inicializado con datos en blanco
			
			// Recorrido para obtener los datos confirmados
			for (Map.Entry<Integer, Doctor> doc : doctorAvailableSelected.entrySet()) {
				indexDate = doc.getKey();
				doctorSelected = doc.getValue();
			}
			
			System.out.println(doctorSelected.getName() + 
					". Date: " + doctorSelected.getAvailableAppointments().get(indexDate).getDate() +
					". Time: " + doctorSelected.getAvailableAppointments().get(indexDate).getTime());
			
			System.out.println("Confirm you appointment: \n1. Yes\n2. Change Data");
			response = Integer.valueOf(sc.nextLine());
			
			if (response == 1) {
				UIMenu.patientLogged.addAppointmentDoctors(doctorSelected, 
						doctorSelected.getAvailableAppointments().get(indexDate).getDate(null), 
						doctorSelected.getAvailableAppointments().get(indexDate).getTime());
				
				showPatientMenu();
			}
			
		} while (response !=0);
	}
	
	
	private static void showPatientMyAppoinments() {
		 int response = 0;
	        do {
	            System.out.println("::My Appointments");
	            if (UIMenu.patientLogged.getAppointmentDoctors().size() == 0){
	                System.out.println("Don't have appointments");
	                break;
	            }

	            for (int i = 0; i < UIMenu.patientLogged.getAppointmentDoctors().size(); i++) {
	                int j = i + 1;		// cantidad de citas que tiene
	                System.out.println(j + ". " +
	                        "Date: " + UIMenu.patientLogged.getAppointmentDoctors().get(i).getDate() +
	                        " Time: " + UIMenu.patientLogged.getAppointmentDoctors().get(i).getTime() +
	                        "\n Doctor: " + UIMenu.patientLogged.getAppointmentDoctors().get(i).getDoctor().getName()
	                        );
	            }

	            System.out.println("0. Return");
	        }while (response!=0);
	    }
	
	

}
