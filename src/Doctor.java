
public class Doctor 
{
    //Atributos
    int id;
    String name;
    String speciality;
    
    // Metodo constructor
    Doctor(/*parametros*/)
    {
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

}
