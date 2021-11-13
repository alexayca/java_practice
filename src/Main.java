// Pueden importarse clases: import static nombre.de.la.clase.*
import static java.lang.Math.*;

public class Main {

	public static void main(String[] args) {
		
		// declarando el objeto <- Instanciado el objeto con el MetodoConstructor();
        Doctor myDoctor = new Doctor();
        myDoctor.name = "Alejandro  Vaccuno";
        
        Doctor myMedical = new Doctor("Susana");
        
        myDoctor.showName();
        
        // El scope de la variable esta limitado por lo que retorna NULL.
        myMedical.showName();
        
        // Variable static
        Doctor d1 = new Doctor();
        Doctor d2 = new Doctor();
        Doctor d3 = new Doctor();
        System.out.println(d1.getId() + " " + d2.getId() + " " +d3.getId());
        
        // al llamar a la variable o metodo puede omitirse el nombreClase. por la forma de importar Math.PI
        System.out.println(PI);	

	}

}
