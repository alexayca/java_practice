# Herencia en interfaces
https://platzi.com/clases/1629-java-oop/21603-herencia-en-interfaces/

Las interfaces pueden heredar de otras interfaces utilizando la palabra clave extends, el concepto de herencia se aplicará como naturalmente se practica en clases, es decir, la interfaz heredará y adquirirá los métodos de la interfaz padre.

Una cosa interesante que sucede en caso de herencia con interfaces es que, aquí sí es permitido la herencia múltiple como ves a continuación:

public interface IReadable {
	public void read();
}


public interface Visualizable extends IReadable, Serializable {
	public void setViewed();
	public Boolean isViewed();
	public String timeViewed();
}
Además siguiendo las implementaciones de métodos default y private de las versiones Java 8 y 9 respectivamente podemos sobreescribir métodos y añadirles comportamiento, si es el caso.

public interface Visualizable extends IReadable, Serializable {
	public void setViewed();
	public Boolean isViewed();
	public String timeViewed();
	
@Override
	default void read() {
	// TODO Auto-generated method stub
}
}
