/* Las interfaces en java si permiten la implementacion multiple de interfaces.
 * Cuando se implementa una interface en una clase los metodos de las interfaces
 * son obligatorios implementarlos.
 * 
 * Las interfaces permite reutilizar comportamientos en diferentes familias indiferentes clases.
 * Abstrayendo esos comportamientos y entonces aplicar el concepto de composición 
 * y estar componiendo en nuestras clases tantas veces lo necesitemos.
 * Los datos se almacenan en variables conocidas como atributos, entre ellos los objetos. 
 * Lo que se conoce como composición ya que se tiene un objeto dentro de un objeto.
 * */
package model;

import java.util.Date;

public interface ISchedulable {
	
	// Firma de un metodo
	void schedule(Date date, String time);

}
