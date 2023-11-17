## Crear hilos de ejecución

La creacion de hilos en java se puede efectuar de dos formas:

- Usando una instancia de una clase que implemnte la interfaz ```Runnable```, esta interfaz sólo tiene el metodo ```run()```. Esta es la mejor elección.

- Creando una subclase de la clase ```Thread``` para tener un objeto que herede de ella, el problema es que no se admite herencia multiple.

En ambos casos, es necesario crear el hilo, y llamar al metodo ```star()```


1. Crear clase que implemente la interfaz Runnable (metodo ```run()```).


2. Escribir el código de la tarea dentro del metodo ```run```.


3. Instanciar la clase creada y almacenar la instancia en variable de tipo ```Runnable```.


4. Crear instancia de la clase ```Thread``` pasando como parametro al constructor de ```Thread``` el objeto ```Runnable``` anterior.
   
   - Un constructor de la clase ```Thread(Runnable target)```
   - ```Runnable``` es el destino del hilo
   - ```public synchronized void start()``` comienza la ejecución del hilo asignando los recursos necesarios para ejecutar el hilo, planifica su ejecución y realiza una llamada a su metodo ```run()```
   - ```run()``` contiene el codigo con las acciones que debe realizar el hilo y habitualmente es un bucle


5. Poner en marcha el hilo de ejecución con el metodo ``` start()``` de la clase ```Thread```.



## Interrupcion de hilos
Algunos de los metodos más usados para interrumpir hilos de la clase ```Thread```

``` void Interrupt() ``` solicita la interrupción de un hilo de ejecución

``` Static boolean interrupted() ```

``` boolean isInterrupted() ```

``` boolean isAlive() ```

``` join() ```

Deprecated ``` stop() ```, ``` suspended() ```, ``` resume() ``` 


