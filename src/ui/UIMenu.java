package ui;
import java.util.Iterator;
import java.util.Scanner;

// Al ser static permite ser conceptualizado sin crear instancias para un menu
// Porque no tiene propiedades. La idea de crear clases y atributos estaticos 
// es poder llamarlos mas alla de la clase.
public class UIMenu {
	
	private static String msgError = "Please select a correct answer. You typed an incorrect option, please type the number according";
	// modificador de acceso, static otorga un scope global, final hace a la variable "constante"
	public static String[] MONTHS = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
	
    public static void showMenu() /* el metodo se hace publico para poder accesarlo desde otro package */
    {
    	Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to My Appointments");
        System.out.println("Selecciona la opción deseada");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Salir");

            try {
            	response = Integer.valueOf(sc.nextLine());
			} catch (NumberFormatException e) {
				// handle exception
				response = 9;
			}

            switch (response){
                case 1:
                    System.out.println("Doctor");
                    break;
                case 2:
                    response = 0;
                    showPatientMenu();

                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println(msgError);
            }
        }while (response != 0);
        sc.close();
    }

    /*public*/ static void showPatientMenu()
    {
    	Scanner sc = new Scanner(System.in);
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

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
