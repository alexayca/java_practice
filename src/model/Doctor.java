package model;
import java.text.ParseException;
import java.text.SimpleDateFormat;
/*El polimorfismo es la posibilidad de sobreescribir un 
 * metodo con comportamientos diferentes.
 * */
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User
{
    //Atributos
    private String speciality;
    
    // Metodo constructor sobrecargado
    public Doctor(String name, String email)
    {
    	super(name,email);
    	// Observe que para modificar speciality se usa el metodo SET
        //this.setSpeciality(speciality); // el parametro pasado se asigna a la instancia
        // Comento la siguiente linea para que no aparezcan los nombres en el menu, al instanciar la clase
        //System.out.println("El nombre del medico asignado es: " + name);
    }
    
    public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	// Colecciones (coleccion de objetos)
    // La clase ArrayList almacena datos en memoria de forma similar a los Arrays 
    // con la ventaja de que el numero de elementos que almacena, es din�mico; No es necesario declarar su tama�o.
    // Declaraci�n de un ArrayList de "String". Puede ser de cualquier otro Elemento u Objeto
    // ArrayList<String> nombreArrayList = new ArrayList<String>();
    // algunos de sus metodos mas importantes:
    // nombreArrayList.add(element); 	nombreArrayList.size(); 	.get(index); .set(index, element); .remove(index);	
    private ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    
    // Metodo a nivel de la clase exterior para llamar a la clase estatica anidada
    // para a�adir citas al doctor que se a�adiran al array
    public void addAvailableAppointment(String date, String time) 
    {
    	// array list si se utiliza por dentro
    	// si se utilizara por fuera seria: Doctor.AvailableAppointment(date, time)
    	availableAppointments.add(new AvailableAppointment(date, time));
    }
    
    // Devolver la lista completa de citas disponibles del array
    // aunque al parecer en la videoclase no.16 no fue realmente util
    // Tambien hay clases internas y locales a un metodo
    // aunque normalmente no se usan, pueden representar un desperdicio de memoria
    public ArrayList<AvailableAppointment> getAvailableAppointments()
    {
    	return availableAppointments;
    }

    @Override
	public String toString() {
		// Se reutiliza todo el comportamiento definido en la clase User
    	// y se agregan mas comportamientos de la clase Doctor y su clase inner
		return super.toString() + "\nSpecialityt: " +speciality +"\nAvailable" +availableAppointments.toString();
	}

	@Override
	public void showDataUser() {
		System.out.println("Hospital: Cruz Roja");
		System.out.println("Departamento: Oncologia");
	}

	// Clase anidada estatica (inner class)
    // Siguiendo la logica del negocio, el doctor es el unico que puede agendar citas
    // al detectar un atributo que su estructura de datos tiene muchos datos puede considerarse 
    // si requiere una clase anidada o puede ser independiente (Anahi)
    public static class AvailableAppointment 
    {
        private int id;
        private Date date;
        private String time;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        
        // Constructor que requiere minimo la fecha
        public AvailableAppointment(String date, String time) 
        {
        	try {
				this.date = format.parse(date);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	this.time = time;
        }
        
        public int getId() {return id;}
        public void setId(int id) {this.id = id;}
        
        // Sobrecarga de metodos
        public Date getDate(String DATE) {return date;}								
        public String getDate() {return format.format(date);}
        public void setDate(Date date) {this.date = date;}        

        public String getTime() {return time;}
        public void setTime(String time) {this.time = time;}

		@Override
		public String toString() {
			return "Available Appointments \nDate: " +date +"\nTime: " +time;
		}
        
        
        
    }

}
