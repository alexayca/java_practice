/* * * * * *
 * Paso de argumentos de tipo objeto
 * El nombre de un objeto es una referencia al mismo, por tanto
 * al pasar un objeto a un método se realiza un llamado por referencia
 * afectando al objeto original.
 *
 * En este caso, las acciones efectuadas a los miembros del objeto referenciado por reference
 * dentro del método launchInputParametersMethod de la clase PasoArgumentosObjeto afectan a los miembros del
 * objeto referenciado por myTestObject dado que en realidad se trata de dos referencias
 * diferentes que apuntan al mismo objeto y por lo tanto a los mismos miembros.
 *
 *
 * Retorno de valores tipo Objeto
 * Un método puede devolver cualquier tipo de dato, incluido un objeto.
 *
 * Como puede apreciarse, cada vez que se invoca al método launchInputParametersMethod, se crea un nuevo objeto
 * de tipo OutputParameter con un incremento de diez a su atributo c. El valor de retorno es la referencia al
 * objeto creado, la cual se almacena en myObjWR1 permitiendo que el objeto no sea recogido por el garbage collector.
 *
 *
 * Para mayor claridad cada tema se muestra en una clase independiente.
 * * * * * */
package antologia;


public class PasoArgumentosObjeto {

    int a, b;

    public PasoArgumentosObjeto(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void launchInputParametersMethod(PasoArgumentosObjeto reference){
        reference.a*=2;
        reference.b*=2;
    }
}


/* - - - - - - - - - - - - - - - - - - - - - - - - - - - - */
class OutputParameter{

    int c;

    public OutputParameter(int c) {
        this.c = c;
    }

    OutputParameter launchResultObject(){
        OutputParameter temporalObject = new OutputParameter(10+c);
        return temporalObject;
    }

}


/* - - - - - - - - - - - - - - - - - - - - - - - - - - - - */
class Lanzamiento{

    public static void main(String[] args) {

    // Paso de argumentos de tipo objeto
        PasoArgumentosObjeto myTestObject = new PasoArgumentosObjeto(10,10);
        System.out.println("Antes del paso de parametros: a=" +myTestObject.a +" b=" +myTestObject.b);

        // Paso como argumento el mismo tipo de objeto PasoArgumentosObjeto
        myTestObject.launchInputParametersMethod(myTestObject);
        System.out.println("Despues del paso de parametros: a=" +myTestObject.a +" b=" +myTestObject.b);


    // Retorno de valores de tipo objeto
        OutputParameter myObjectWithReturn = new OutputParameter(11);
        OutputParameter myObjWR1;

        myObjWR1 = myObjectWithReturn.launchResultObject();
        System.out.println("myObjWR1.c = " +myObjWR1.c);

        myObjWR1 = myObjWR1.launchResultObject();
        System.out.println("myObjWR1.c = " +myObjWR1.c);
        System.out.println("myObjectWithReturn.c = " +myObjectWithReturn.c);    // El primer objeto no se ha alterado
    }
}
