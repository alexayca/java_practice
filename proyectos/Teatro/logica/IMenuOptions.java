/*
 * Debe implementar la interfaz MenuOptions, que define los métodos getOp1(), getOp2(), y getOp3(). 
 * Esto asegura que T de la clase generica tenga los métodos necesarios para obtener las opciones del menú.
 */
package logica;

public interface IMenuOptions {
    
    String opInvalida = "Elige una opción valida.";
    
    String getOp1();
    String getOp2();
    String getOp3();
    
    boolean asignarAsiento(int fila, int asiento);
    void mostrarSala();
}
