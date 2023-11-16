## Crear hilos de ejcución

1. Crear clase que implemente la interfaz Runnable (metodo ```run()```).


2. Escribir el código de la tarea dentro del metodo ```run```.


3. Instanciar la clase creada y almacenar la instancia en variable de tipo ```Runnable```.


4. Crear instancia de la clase ```Thread``` pasando como parametro al constructor de ```Thread``` el objeto ```Runnable``` anterior.
   
   - Un constructor de la clase ```Thread(Runnable target)```
   - ```Runnable``` es el destino del hilo
   - ```start()``` comienza la ejecución del hilo


5. Poner en marcha el hilo de ejecución con el metodo ```start()``` de la clase ```Thread```.


## Interrupcion de hilos
Algunos de los metodos más usados para interrumpir hilos de la clase ```Thread```

``` void Interrupt() ``` solicita la interrupción de un hilo de ejecución

``` Static boolean interrupted() ```

``` boolean isInterrupted() ```

``` stop() ``` deprecated


