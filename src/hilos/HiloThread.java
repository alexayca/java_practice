package hilos;

public class HiloThread {
    public static void main(String[] args) {
        Encuentra2 bc1 = new Encuentra2("0012R");
        bc1.start();
    }
}


class Encuentra2 extends Thread{
    String claveb;

    public Encuentra2(String clave){
        claveb = clave;
    }


    /* Codigo a ejecutar por el hilo
    * Al heredar de Thread redefine su metodo run */
    @Override
    public void run(){
        System.out.println("Esta es la tarea a realizar por el hilo");
        // lanza una excepción si algun otro hilo intenta interrumpirlo mientras esta dormido
        try {
            // sleep es un metodo propio del objeto
            sleep(2000); // retrasa la ejecución del hilo
        }catch (InterruptedException e){
        }
        System.out.println("fin");
        // cuando el hilo completa el metodo run se convierte en muerto y finaliza
    }

}
