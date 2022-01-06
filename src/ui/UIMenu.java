package ui;
import java.util.ArrayList;
import java.util.Scanner;

import model.Doctor;
import model.Patient;

// Al ser static permite ser conceptualizado sin crear instancias para un menu
// Porque no tiene propiedades. La idea de crear clases y atributos estaticos 
// es poder llamarlos mas alla de la clase.
public class UIMenu {
	
	private static String msgError = "Please select a correct answer. You typed an incorrect option, please type the number according";
	// modificador de acceso, static otorga un scope global, final hace a la variable "constante"
	public static final String[] MONTHS = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
	public static Doctor doctorLogged;
	public static Patient patientLogged;
	
    public static void showMenu() /* el metodo se hace publico para poder accesarlo desde otro package */
    {
    	Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to My Appointments");
        System.out.println("Selecciona la opción deseada");

        int response = 0;
        do {
            System.out.println("\t1. Doctor");
            System.out.println("\t2. Patient");
            System.out.println("\t0. Salir");

            try {
            	response = Integer.valueOf(sc.nextLine());
			} catch (NumberFormatException e) {
				// handle exception
				response = 9;
			}

            switch (response){
                case 1:
                    System.out.println("Doctor");
                    response = 0;
                    authUser(1);
                    break;
                case 2:
                    response = 0;
                    authUser(2);
                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println(msgError);
            }
        }while (response != 0);
        //sc.close();
    }
    
    
    private static void authUser(int userType) {
    	// userType = 1 Doctor
    	// userType = 2 Paciente
    	
    	// ArraList es una lista que almacena objetos (colecciones de objetos)
    	ArrayList<Doctor> doctors = new ArrayList<>();
    	doctors.add(new Doctor("Alejandro", "alejandro@mail.com"));
    	doctors.add(new Doctor("Natalia", "natalia@mail.com"));
    	doctors.add(new Doctor("Susana", "susana@mail.com"));
    	
    	// Imaginemos que acudimos a la capa de persistencia de datos y traemos a todos los usuarios registrados
    	ArrayList<Patient> patients = new ArrayList<>();
    	patients.add(new Patient("Diana","diana@mail.com"));
    	patients.add(new Patient("Lena","lenaa@mail.com"));
    	patients.add(new Patient("Nadia","nadia@mail.com"));
    	
    	boolean emailCorrect = false;
    	do {
    		System.out.println("Inser your email: user@mail.co");
    		Scanner sc = new Scanner(System.in);
    		String email = sc.nextLine();
    		
    		// Estas validaciones deberian estar en el query a la DB
    		if (userType ==1) {
    			// Se recorrera la lista de los doctores para encontrar el que hace match con el email introducido
				for (Doctor d : doctors) {
					// se usa el metodo equals para comparar los objetos, equivalente al == de los primitivos
					if (d.getEmail().equals(email)) {
						emailCorrect = true;
						// Obtener los datos del usuario logeado
						doctorLogged = d;	// Se asignan los datos del doctor logueado
						// TODO showDoctorMenu
						UIDoctorMenu.showDoctorMenu();
					}
				}
			}
    		if (userType ==2) {
    			for (Patient p : patients) {
					if (p.getEmail().equals(email)) {
						emailCorrect = true;
						patientLogged = p;
						UIPatientMenu.showPatientMenu();
					}
				}
			}
    		
    	}while(!emailCorrect);
    }
    

    /*public*/ static void showPatientMenu()
    {
    	Scanner sc = new Scanner(System.in);
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println(":: Menu Patient");
            System.out.println("\t1. Book an appointment");
            System.out.println("\t2. My appointments");
            System.out.println("\t0. Return");

            try {
            	response = Integer.valueOf(sc.nextLine());
			} catch (NumberFormatException e) {
				// handle exception
				response = 9;
			}

            switch (response){
                case 1:
                    System.out.println("::Book an appointment");
                    for (int i = 5; i<8; i++) {
						System.out.println(i+1 + " " +MONTHS[i]); // No funciona correctamente i++
						
					}
                    break;
                    
                case 2:
                    System.out.println("::My appointments");
                    break;
                    
                case 0:
                    showMenu();
                    break;
                    
                default:
                	System.out.println(msgError);
            }
        }while (response != 0);
        sc.close();
    }

}
