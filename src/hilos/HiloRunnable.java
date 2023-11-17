package hilos;

public class HiloRunnable {
    public static void main(String[] args) {
        Encuentra bc1 = new Encuentra("0012R");
    }
}


class Encuentra implements Runnable{
    Thread t;
    String claveb;

    public Encuentra(String clave){
        claveb=clave;
        // se construye un hilo con el constructor public Thread(java.lang.Runnable p1);
        // su parametro es una instancia de la clase que implementa la interfaz Runnable
        t = new Thread(this);
        // se llama al metodo start() para que comience la ejecución dle hilo.
        t.start();
    }

    /* Codigo a ejecutar por el hilo */
    public void run(){
        System.out.println("Esta es la tarea a realizar por el hilo");
        // lanza una excepción si algun otro hilo intenta interrumpirlo mientras esta dormido
        try {
            // el hilo actual se obtiene mediante currentThread()
            Thread.currentThread().sleep(2000); // retrasa la ejecución del hilo
        }catch (InterruptedException e){
        }
        System.out.println("fin");
        // cuando el hilo completa el metodo run se convierte en muerto y finaliza
    }
}
