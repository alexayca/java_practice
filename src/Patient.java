/* * * * * * * 
 * Los Modificadores de Acceso nos ayudan a limitar desde dónde podemos leer o modificar atributos especiales 
 * de nuestras clases. Podemos definir qué variables se pueden leer/editar por fuera de las clases donde fueron creadas. 
 * Esto lo conocemos como Encapsulamiento.
 * * * * * * */

public class Patient {
	
	int id;
	private String name;
	private String email;
	private String address;
	private String phoneNumber;
	private String birthday;
	private double weight;
	private double height;
	private String blood;
	
	Patient(String name, String email)
	{
		this.name = name;
		this.email = email;
	}

}
