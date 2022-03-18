package ProgramacionGenerica;

public class ArrayList2 {
    
    public ArrayList2(int z){
        // el constructor define el tamanio del array
        datosElemento = new Object[z];
    }

    public Object get(int i){
        // Devuelve un elemento concreto del array
        return datosElemento[i];
    }

    public void add(Object o){
        // Recibe por parametros un tipo Objeto
        // Almacenandoce en una posicion i
        datosElemento[i]=o;
        i++;
    }

    private Object[] datosElemento;
    private int i=0;

}
