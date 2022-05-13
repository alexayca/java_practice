package ClasesPropiasGenericas;

public class UsoPareja {
    public static void main(String[] args) {

        // Objeto de tipo String
        Pareja<String> unaInstancia=new Pareja<String>();   // primero=null
        unaInstancia.setPrimero("Alex");    // primero="Alex"
        System.out.println(unaInstancia.getPrimero());

        // Objeto de tipo persona
        Persona persona1 = new Persona("Ana");
        Pareja<Persona> persona2 =new Pareja<>();
        persona2.setPrimero(persona1);
        System.out.println(persona2.getPrimero() );


    }
}


class Persona{
    private String nombre;

    public Persona(String nombre){
        this.nombre=nombre;
    }

    // devuelve un objeto, se sobreescribe el metodo para ver un String
    @Override
    public String toString() {
        return "Persona{" + "nombre='"
                + nombre
                + '\'' + '}';
    }
}
