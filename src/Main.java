

import ui.UIMenu;

public class Main 
{

	public static void main(String[] args) 
	{
		
        //UIMenu.showMenu();
		
		Doctor miGinecolaga = new Doctor("Dayana", "Ginecologia");
		System.out.println(Doctor.id +" . " +miGinecolaga.name +" - " +miGinecolaga.speciality);
		
		Patient paciente = new Patient("Mila", "mila@mail.com");
		System.out.println(paciente.getName() +" - " +paciente.getEmail());
		paciente.setWeight(54.6);
		System.out.println(paciente.getWeight());
		paciente.setPhoneNumber("12345678");
		System.out.println(paciente.getPhoneNumber());

	}

}
