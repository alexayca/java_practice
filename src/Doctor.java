
public class Doctor 
{
    //Atributos
	static int ID = 0;	// las variables static pertenecen a la clase, siempre tendra el mismo valor para todos los objetos
    int id;
    String name;
    String speciality;
    
    // Metodo constructor
    Doctor(/*parametros*/)
    {
    	id = ID;
    	ID++;
    	// Instrucciones que se ejecutan al instanciar 
    	// un nuevo objeto con la clase Doctor
    	System.out.println("Construyendo el objeto Doctor sin parametros");
    }
    
    // Metodo constructor sobrecargado
    Doctor(String name)
    {
    	System.out.println("El nombre del Doctor asignado es: " + name + " (con parametros) ");
    	// Para modificar la variable 'name' deberia asignarse con this. Pass by value
    }
    
    // Metodos
    public void showName()
    {
        System.out.println(name);
    }
    
    public int getId() 
    {
    	// por la variable static cada que se cree un nuevo objeto incrementara el ID
    	return id;    	
    }

}
