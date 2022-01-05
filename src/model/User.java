package model;
/* * * * * * 
 * En java se aplica la herencia usando la palabra clave 'extends'
 * despues del nombre de la clase hija y seguido de la clase padre
 * La clase user es la clase padre que hereda a Doctor y Patient
 * Se puede hacer la clase User de tipo:
 * public abstract class User {}
 * para que no puedan ser instanciada por si sola.
 * */
public abstract class User {
	
	int id;
	private String name;
	private String email;
	private String address;
	private String phoneNumber;

	// Al ser la clase abstract no podra ser instanciada directamente
	// Se puede instanciar si se aplica un modelo de polimorfismo
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
	
	/*
	 * Al imprimir cualquier objeto en la consola con System.out.println(object), en realidad, 
	 * estamos ejecutando el método .toString() de dicho objeto, por lo que si sobreescribimos 
	 * este método en nuestras clases, el resultado en la consola también cambiará automáticamente.
	 */
	@Override
	public String toString() {
		return "User: " +name +", email: " +email
				+"\nAddress: " +address + " Phone: " +phoneNumber;
	}
	
	// Metodo abstracto para que la clase se considere abstracta
	// Solo se declara el metodo
	public abstract void showDataUser();

}
