import java.util.ArrayList;
import java.util.Date;

public class Doctor 
{
    //Atributos
	static int id = 0;	// Autoincrement
    private String name;
    private String email;
    private String speciality;
   
    // Metodo constructor
    Doctor()
    {
    	id++;
    	this.name = "Nombre por defecto";
        this.speciality = "Especialidad por defecto: General";    	
    }
    
    // Metodo constructor sobrecargado
    Doctor(String name, String speciality)
    {
    	id++;
        this.name = name;	// this Hace referencia a los elementos de la instancia de clase
        this.speciality = speciality; // el parametro pasado se asigna a la instancia
    }
    
    // Colecciones (coleccion de objetos)
    // La clase ArrayList almacena datos en memoria de forma similar a los Arrays 
    // con la ventaja de que el numero de elementos que almacena, es dinámico; No es necesario declarar su tamaño.
    // Declaración de un ArrayList de "String". Puede ser de cualquier otro Elemento u Objeto
    // ArrayList<String> nombreArrayList = new ArrayList<String>();
    // algunos de sus metodos mas importantes:
    // nombreArrayList.add(element); 	nombreArrayList.size(); 	.get(index); .set(index, element); .remove(index);	
    ArrayList<AvailableAppointment> availableAppointments = new ArrayList();
    
    // Metodo a nivel de la clase exterior para llamar a la clase estatica anidada
    // para añadir citas al doctor que se añadiran al array
    public void addAvailableAppointment(Date date, String time) 
    {
    	// array list si se utiliza por dentro
    	// si se utilizara por fuera seria: Doctor.AvailableAppointment(date, time)
    	availableAppointments.add(new AvailableAppointment(date, time));
    }
    
    // Devolver la lista completa de citas disponibles del array
    public ArrayList<AvailableAppointment> getAvailableAppointments()
    {
    	return availableAppointments;
    }

    // Clase anidada estatica
    // Siguiendo la logica del negocio, el doctor es el unico que puede agendar citas
    // al detectar un atributo que su estructura de datos tiene muchos datos puede considerarse 
    // si requiere una clase anidada o puede ser independiente (Anahi)
    public static class AvailableAppointment 
    {
        private int id;
        private Date date;
        private String time;
        
        // Constructor que requiere minimo la fecha
        public AvailableAppointment(Date date, String time) 
        {
        	this.date = date;
        	this.time = time;
        }
        
        public int getId() {return id;}
        public void setId(int id) {this.id = id;}
        
        public Date getDate() {return date;}
        public void setDate(Date date) {this.date = date;}        

        public String getTime() {return time;}
        public void setTime(String time) {this.time = time;}        
        
    }

}
