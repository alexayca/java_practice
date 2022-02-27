```java
/* * * * * * * 
 * https://platzi.com/clases/1629-java-oop/21592-enumerations/
 * Son tipos de datos muy especiales, sirve para declarar una colección de constantes.
 * 
 * * * * * * */
package lectura;

public class Enumerations {

	// Así podemos declarar un enumeration usando la palabra reservada enum.
	public enum Day {
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
		THURSDAY, FRIDAY, SATURDAY
	}
	
	 // Crear referencias de enumerations de la siguiente forma:
		 Day day;
		 switch (day) {
		 	case MONDAY:
		 		System.out.println(“Mondays are good.”);
		 		break;
		 	case FRIDAY:
		 		System.out.println(“Fridays are nice”);
		 		break;
		 	case SATURDAY: case: SUNDAY:
		 		System.out.println(“Weekends are the best”);
		 		break;
		 	default:
		 		System.out.println(“Midweek are so-so”);
		 		break;
		 }

	
		 // llamar un valor del enumeration así:
			 Day.MONDAY;
			 Day.FRIDAY;
			 Day.SATURDAY;
			 
		// pueden tener atributos, métodos y constructores, como se muestra:

				 public enum DayT {
				   MONDAY("Lunes");
				   TUESDAY("Jueves");
				   FRIDAY("Viernes");
				   SATURDAY("Sábado");
				   SUNDAY("Domingo");

				   private String spanish;
				   private DayT(String s) {
				     spanish = s;
				   }

				   private String getSpanish() {
				     return spanish;
				   }
				 }
				 
				 // para utilizarlo lo podemos hacer así:
					 System.out.println(Day.MONDAY);
				// Imprimirá: MONDAY
					 System.out.println(Day.MONDAY.getSpanish());
				// Imprimirá: Lunes
}
```
