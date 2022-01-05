package model;
/* * * * * * * 
 * Las Variables son entidades elementales muy sencillas (datos primitivos).
 * Los Objetos son entidades complejas que pueden estar formadas por la agrupaci�n de diferentes variables y m�todos.
 * Los Objetos Primitivos o Clases Wrapper son variables primitivas que trabajan con alg�n tipo de dato y tambi�n tienen las caracter�sticas de los objetos.
 * * * * * * */

public class Patient extends User {
	
	private String birthday;
	private double weight;
	private double height;
	private String blood;
	
	// La raz�n por la cual sali� el error en el super, 
	// es porque al mandar llamar al constructor de la clase padre 
	// este debe de ir siempre al inicio del constructor de la clase hijo
	public Patient(String name, String email)
	{
		super(name, email);	// hace referencia al metodo constructor de la clase padre
		// quitando los atributos que pertenecian a la misma clase
		// indicados por this.
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
	
	@Override
	public String toString() {
		return super.toString() + "\nAge: " +birthday 
				+"\nWeight: " +getWeight() +"\nHeight: " + getHeight()
				+"\nBlood: " +getBlood();
	}

	@Override
	public void showDataUser() {
		System.out.println("Paciente");
		System.out.println("Historial completo");		
	}

}
