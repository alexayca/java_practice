/* * * * * * 
 * En java se aplica la herencia usando la palabra clave 'extends'
 * despues del nombre de la clase hija y seguido de la clase padre
 * La clase user es la clase padre que hereda a Doctor y Patient
 * */
public class User {
	
	int id;
	private String name;
	private String email;
	private String address;
	private String phoneNumber;

	public User(String name, String email) {
		this.name = name;
		this.email = email;
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
	
	

}
