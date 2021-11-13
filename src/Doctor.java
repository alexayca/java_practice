
public class Doctor 
{
    //Atributos
	static int id = 0;	// Autoincrement
    String name;
    String speciality;
    
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
    
    // Metodos


}
