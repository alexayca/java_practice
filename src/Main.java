

import ui.UIMenu;

public class Main 
{

	public static void main(String[] args) 
	{
		
        //UIMenu.showMenu();
        
		Doctor miPediatra = new Doctor("Gregory", "Pediatria");
		System.out.println(miPediatra.id +" . " +miPediatra.name +" - " +miPediatra.speciality);
		
		Doctor general = new Doctor();
		System.out.println(general.id +" . " +general.name +" - " +general.speciality);
		
		Doctor miGinecolaga = new Doctor("Dayana", "Ginecologia");
		System.out.println(Doctor.id +" . " +miGinecolaga.name +" - " +miGinecolaga.speciality);

	}

}
