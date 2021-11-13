

public class Main {

	public static void main(String[] args) {
		
		// declarando el objeto <- Instanciado el objeto con el MetodoConstructor();
        Doctor myDoctor = new Doctor();
        myDoctor.name = "Alejandro  Vaccuno";
        
        Doctor myMedical = new Doctor("Susana");
        
        myDoctor.showName();
        
        // El alcance de la variable esta limitado por lo que retorna NULL.
        myMedical.showName();

	}

}
