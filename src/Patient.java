/* * * * * * * 
 * Las Variables son entidades elementales muy sencillas (datos primitivos).
 * Los Objetos son entidades complejas que pueden estar formadas por la agrupaci�n de diferentes variables y m�todos.
 * Los Objetos Primitivos o Clases Wrapper son variables primitivas que trabajan con alg�n tipo de dato y tambi�n tienen las caracter�sticas de los objetos.
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

	public String getWeight() {
		return weight + " Kg.";
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getHeight() {
		return height +" m";
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		if (phoneNumber.length() != 8) {
			System.out.println("El telefono debe tener 8 digitos");
		}else if(phoneNumber.length() == 8)
			this.phoneNumber = phoneNumber;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getBlood() {
		return blood;
	}

	public void setBlood(String blood) {
		this.blood = blood;
	}
	
	

}
