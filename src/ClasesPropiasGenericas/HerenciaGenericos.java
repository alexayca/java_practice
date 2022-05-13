/* * * * * * *
 * Herencia y tipos comodin
 * https://www.youtube.com/watch?v=jlbAY9ITLXM&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk
 * La programacion generica no siempre funciona igual
 * que en las clases ordinarias, sobre todo al llamar
 * a metodos creados en una clase generica.
 * La herencia no funciona igual, el principio de sustitucion
 * (... es un ...) no funciona en las clases genericas. Para solucionar
 * se usan los tipos comodin.
 *
 *
 * */

package ClasesPropiasGenericas;

import ProgramacionGenerica.*;

public class HerenciaGenericos {
    public static void main(String[] args) {

        Empleado administrativa=new Empleado("Elena",45,15000);
        Jefe directoraComercial=new Jefe("Yolanda",29,100000);
            // aplicando la herencia y el principio un jefe ... es un ... empleado
            // En clases genericas no es de la misma forma
        Empleado nuevoEmpleado=directoraComercial;


        Pareja<Empleado>administrativa2=new Pareja<>();
        Pareja<Jefe>directoraComercial2=new Pareja<>();
            // aqui no aplica el principio de sustitucion
    //    Pareja<Empleado>nuevoEmpleado2=directoraComercial2;
        Pareja.imprimirTrabajador(administrativa2);
        // Muestra error de compilacion al no poder usar el metodo porque no acepta ese tipo generico
        Pareja.imprimirTrabajador(directoraComercial2);
    /* Para solucionar lo anterior utilizamos tipos comodin
    * ? extends vease la clase pareja metodo imprimirTrabajador
    * */



    }
}
