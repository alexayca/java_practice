package ui;

import java.util.ArrayList;
import java.util.Scanner;

import model.Doctor;

public class UIDoctorMenu {
	
	public static ArrayList<Doctor> doctorsAvailableAppointments = new ArrayList<>();	// array de solo los doctores que tienen disponibles citas
	
	public static void showDoctorMenu() {
		int response = 0;
		do {
			System.out.println("\n\n");
			System.out.println("::MENU Doctor");
			System.out.println("Welcome " + UIMenu.doctorLogged.getName() +"\n\tChoose an option: ");
			System.out.println("\t1. Add Available Appointment");
			System.out.println("\t2. My Scheduled Appointment");
			System.out.println("\t0. Logout");
			
			Scanner sc = new Scanner(System.in);
			response = Integer.valueOf(sc.nextLine());
			
			switch (response) {
			case 1:
				showAddAvailableAppointmentsMenu();
				break;

			case 2:
				
				break;
				
			case 0:
				UIMenu.showMenu();
				break;
			}
			
		} while (response !=0);
	}

	
	private static void showAddAvailableAppointmentsMenu() {
		int response = 0;
		do {
			System.out.println("::Add Available Appointment");
			System.out.println("::Select a Month");
			
			// Las citas disponibles seran los proximos 3 meses
			for (int i = 0; i < 3; i++) {
				int j=i+1;
				System.out.println(j+ ". " + UIMenu.MONTHS[i]);
			}
			System.out.println("0. Return");
			
			Scanner sc = new Scanner(System.in);
			response = Integer.valueOf(sc.nextLine());
			
			if (response > 0 && response < 4) {
				// tenemos las opciones 1, 2, 3.
				int monthSelected = response;	// variable para dar mayor legibilidad al c�digo
				System.out.println(monthSelected + " . " + UIMenu.MONTHS[monthSelected-1]);
				
				System.out.println("Insert the date available: [dd/mm/yyyy]");
				String date = sc.nextLine();
				
				System.out.println("Your date is: " + date + "\n1. Correct \n2. Change Date");
				int responseDate = Integer.valueOf(sc.nextLine());	// una clase wrapper 
				if (responseDate == 2) continue; 
				// La sentencia continue provoca que �nicamente la iteraci�n actual del bucle m�s interno detenga su ejecuci�n 
				// y que comience inmediatamente la siguiente iteraci�n si el bucle todav�a no ha terminado. 
				//		https://rekkeb.wordpress.com/2009/04/11/curiosidades-java-break-y-continue/
				
				int responseTime = 0;
				String time = "";
				do {
					System.out.println("Insert the time available for date: " +date +" [hh:mm]");
					time = sc.nextLine();
					System.out.println("Your time is: " + time + "\n1. Correct \n2. Change Time");
					responseTime = Integer.valueOf(sc.nextLine());
					
				} while (responseTime == 2);
				
				UIMenu.doctorLogged.addAvailableAppointment(date, time);	// el date es un String que se ajusto en el metodo 
				checkDoctorAvailableAppointments(UIMenu.doctorLogged);
				
			}else if(response == 0) {
				showDoctorMenu();
			}
			
		} while (response !=0);
	}
	
	
	private static void checkDoctorAvailableAppointments(Doctor doctor) {
		if(doctor.getAvailableAppointments().size() > 0
				&& !doctorsAvailableAppointments.contains(doctor)) {
			doctorsAvailableAppointments.add(doctor);
		}
	}
	
	
}
