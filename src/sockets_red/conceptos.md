En un mismo host un programa en ejecución es un proceso, dos procesos se comunican generalmente usando comunicación entre procesos (definida por el sistema operativo)

Procesos en diferentes hosts se comunican vía intercambio de mensajes.


# Puertos

[Internet Assigned Numbers Authority](http://www.iana.org/assignments/service-names-port-numbers/service-names-port-numbers.txt)

Un puerto en la capa de transporte esta representado por un numero de 16 bits, se utiliza para identificar los puntos finales de la conexión, en las cabeceras UDP o TCP. Son canales que utilizan el subsistema de red para redireccinar la información al programa apropiedo.

- Oscilan entre: 0 - 65535
  - Bien conocidos (0 - 1023)
  - Registrados ( 1024 - 49151)
  - Dinamicos o privados (49152 - 65535)


# Socket

- Un socket es un número de puerto y una dirección de red
- Un par de sockets, uno en cada host, forma una conexión unica
- Es un punto final de un enlace de comunicación de dos vías entre dos programas que se ejecutan a través de la red.
- El cliente y el servidor deben ponerse de acuerdo sobre el protocolo que utilizarán.


## Ciclo de vida de los sockets
El ciclo de vida de un canal de comunicación esta determinado por tres fases.
- Creación y apertura del socket.
- Lectura y/o escritura, recepción y/o envío de datos por el socket.
- Destrucción, cierre del socket.


## Clasificación de sockets

- Orientado a conexión
  - Establece un camino virtual entre servidor y cliente, fiable, sin pérdidas de información ni duplicados, la información llega en el mismo orden que se envía.
  - El cliente abre una sesión en el servidor y este guarda un estado del cliente.

- No orientado a conexión
  - Envío de datagramas de tamaño fijo. No es fiable, puede haber pérdidas de información y duplicados, y la información puede llegar en distinto orden del que se envía.
  - No se guarda ningún estado del cliente en el servidor, por ello, es más tolerante a fallos del sistema.


## Protocolos
- Nuevamente, en teoría, casi cualquier familia de protocolos puede usarse debajo de la capa de socket: IPX de Novell, AppleTalk de Apple, incluso los antiguos protocolos ChaosNet. Pero en la práctica, sólo hay una familia de protocolos que interesa a la gente en Internet, y sólo una familia de protocolos soporta Java: el Protocolo de Internet, IP. 
- La clase Socket habla TCP y la clase DatagramSocket habla UDP, ambos protocolos estándar de Internet. Estos protocolos generalmente están disponibles en cualquier sistema que esté conectado a Internet.


# Cliente/Servidor

- El usuario cliente obtiene servicios de la máquina remota proveedora de un servicio (servidor).
- El servidor proporciona un puerto de comunicación por el cuál se deben de conectar todos los clientes que deseen obtener dicho servicio.
- Se establece un socket en la máquina local (cliente) y otro en la máquina remota (servidor) , y se comunican entre sí por el puerto proporcionado, así se establece la vía de comunicación entre dos hosts interconectados por una red.
- La diferencia más importante entre un cliente y un servidor es que _un __cliente__ puede crear un socket para __iniciar una conversación__ con una aplicación de servidor en cualquier momento_, mientras que _un __servidor debe prepararse para escuchar__ las conversaciones entrantes con anticipación_.
- La clase ```java.net.Socket``` representa un lado de una conexión de socket individual tanto en el cliente como en el servidor. Además, el servidor utiliza la clase ```java.net.ServerSocket``` para escuchar las conexiones de los clientes. Una aplicación (o hilo) que actúa como servidor crea un objeto ```ServerSocket``` y espera, bloqueado en una llamada a su método ```accept()```, hasta que llega una conexión. Cuando lo hace, el método ```accept()``` crea un objeto ```Socket``` que el servidor utiliza para comunicarse con el cliente.
- Un servidor puede mantener conversaciones con varios clientes a la vez; en este caso seguirá habiendo un único ```ServerSocket``` pero el servidor tendrá múltiples objetos ```Socket```, uno asociado con cada cliente.
- Un cliente necesita dos datos para localizar y conectarse a un servidor: un nombre de host (utilizado para encontrar la dirección de red del host) y un número de puerto. El número de puerto es un identificador que diferencia entre varios clientes o servidores en el mismo host. Una aplicación de servidor escucha en un puerto preestablecido mientras espera conexiones. Los clientes seleccionan el número de puerto asignado al servicio al que desean acceder.


## Proceso cliente 
Inicia la comunicación
1. Abre el canal de comunicaciones para conectarse a la dirección de red atendida por el servidor
2. Enviar al servidor un mensaje de petición de servicio y esperar hasta recibir respuesta
3. Cerrar el canal de comunicación y terminar la ejecución del proceso.

## Proceso Servidor
Esta a la escucha de ser contactado
1. Abre el canal de comunicación e informa a la red de la dirección a la que responderá como de la disposición para aceptar peticiones de servicio.
2. Espera a que el Cliente realice una petición de servicio en la dirección que el tiene declarada.
3. Cuando recibe una petición de servicio, atiende al Cliente.
4. La conexión es cerrada.


# Referencias
- http://profesores.fi-b.unam.mx/yasmine/tema1_1.pdf
- Learning Java;  Pat Niemeyer - Jonathan Knudsen;  Publisher: O'Reilly
