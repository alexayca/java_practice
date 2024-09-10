import logica.Boleto;
import logica.Sala;
import logica.MenuConsola;
import java.time.LocalDate;
import logica.Taquilla;


/*
 * Un teatro para 100 personas
 * NO es necesario hacer IGU
 * Solo salida por consola
 * 
 * 
 * https://projectlombok.org/#
 * 
 * 
 * "Sistema de reserva de asientos"
 * El teatro cuenta con 10 filas de 10 asientos cada una.
 * 1 Cargar el "mapa" de filas y asientos. Indicando con X los asientos ocupados
 * y con L los asienros libres.
 * 2 Manejar la reserva de asientos contemplando que un asiento solo puede ser 
 * reservado si se encuentra en estado L, en caso de que este en estado X, se 
 * debera permitir al comprador elegir otro asiento. Si se encuentra en estado L, 
 * debera pasar automaticamente al estado X.
 * 3 Para finalizar el programa se debera ingresar un valor en particular. 
 * Contemplar que no existe una cantidad exacta de veces que el programa se 
 * pueda ejecutar.
 * 4 No se permite sobreventa
 * extra: Visualizar los asientos libres. 
 * 
 * "Sistema de tickets para reservar asiento"
 * 1 Crear la plantilla necesaria para guardar los siguientes datos por ticket:
 *  numero, fila, asiento, fecha de compra, fecha de validez, precio
 * 2 Usar una base de datos logica mediante alguna estructura de datos que 
 * permita almacenar un numero indeterminado de tickets. Cargar una serie de 
 * tickes a dicha estructura.
 * 3 Crear un metodo que recorra la estructura seleccionada y sume los precios 
 * de todos los tickets, mostrar por pantalla el total.
 * 4 Solicitar al usuario que ingrese un numero de fila. A partir de esto 
 * mostrar por pantalla los datos de los tickets pertenecientes a esa fila.
 * extra: Plantilla para clientes con los datos: id, dni, nombre, apellido. 
 * Como se implementaria?
 * De que manera se relacionaria con ticket para que el mismo posea los datos 
 * del cliente que tiene asignado?
 * 
 */


/**
 *
 * @author alexa
 */
public class Teatro {

    public static void main(String[] args) {
        Sala sala = new Sala();
        MenuConsola<Sala> menu = new MenuConsola<>(sala);
        
        menu.seleccionarOpciones();


    }
    
}
