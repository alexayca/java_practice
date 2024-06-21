# Java Web

Es una tecnología que permite crear páginas web dinamicas basadas en HTML y XML.
__Java Server Pages__ (JSP) requiere de un servidor web que sea compatible con contenedores servlet. (Apache Tomcat o Glassfish)

Cada JSP contendra etiquetas HTML y CSS, y etiquetas especiales para especificar porciones de código Java donde sea necesario.

```html
<%@page contentType="text/html" pageEncoding="UTF-8">
<html>
...
<body>
<h1>Hola mundo desde HTML</h1>
<%String hola = "Hola mundo desde Java";%>
<%= hola %>
</body>
</html>
```



## [Instalar Apache Tomcat](tomcat.apache.org)
Descargar la version 9 que permite trabajar con beans
[Netbeans IDE 12](https://netbeans.apache.org/front/main/download/nb122/nb122/) es compatible con Java 8

- File > New project > Java with Maven > Web Application 
- Server > Add.. > Apache Tomacat {archivo descargado(bin)}
- Asignamos credenciales y finalizamos
- Indicamos la versión de Java EE

Comenzara a descargar los archivos necesarios.



## Web Pages
- Aqui encontramos el index.
- Podemos agregar un archivo JSP con las etiquetas mencionadas.
- Para ejecutar el servidor pulsamos F6, y esperamos a que cargue, nos solicitara las credenciales indicadas anteriormente.



## Etiquetas de JSP
Etiquetas más comunes de JSP de apertura y cierre

__<%-- --%>__ Comentarios.

__<%@ %>__ Para directivas/ atributos de configuració de JSP.

__<% %>__ Inclusión de sentencias o codigo Java en general. No es visto ni percibido por el usuario. Se debe usar para declarar variables locales.

__<%= %>__ Mostrar el resultado de una expresion o contenido de una variable. Es visible para el usuario en el aprtado de HTML dentro del JSP que se indique.

__<%! %>__ Para hacer uso exclusivo de declaración de variables y metodos de instancia. Que se compartiran entre varios JSP asociados al mismo servlet.



## Servlet

Es una clase de java que se utiliza como punto intermedio entre una pagina JSP y el servidor web donde esta alojada la logica de una aplicación.

Se encarga de recibir peticiones o request desde un cliente, tratarlas y analizarlas si es necesario realzar alguna solicitud en particular o brindar una determinada respuesta o response. En muchas ocasiones por cada clase se tiene un servlet.

Para poder tratar cada una de las peticiones, utiliza una serie de metodos donde dependiendo del verbo por el cual se reciba la peticion (GET, POST, PUT, DELETE, etc)
- __doGet()__ metodo que recibe las solicitudes GET.
- __doPost()__ metodo que recibe las solicitudes POST.

- __getParameter()__ obtiene el valor de un parametro enviado (request) por el cliente vía los metodos GET o POST.

Se puede implementar la comunicacion jsp de dos maneras. 
* Con un JSP que se comunica a un SERVLET (como entidades independientes)
* Que el SERVLET funcione como un JSP, dentro del servlet se muestra el codigo HTML que visualizara el usuario con __processRequest()__ 