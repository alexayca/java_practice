# Base de datos

## JPA  (Java Persistence API)

JPA es un ORM (Object Relational Mapping) que tiene como objetivo lograr la persistencia de datos entre una aplicación desarrollada en Java y una Base de datos.

JPA busca traducir el modelado de las clases Java a un modelado relacional en una base de datos, posibilitando al programador elegir que clases u objetos quiere persistir.

JPA se vale de una serie de mapeos que se deben realizar sobre cada uno de los elementos de una clase, los mismos, se representan mediante ```annotations (@)```

JPA cuenta con proveedores de JPA, entre ellos: __Eclipselink__, __Hibernate__, __Toplink__, entre otros.
        Aplicación Java -> {JPA + Proveedor de JPA} -> BD



### MySql Connection + Persistence Unit

Agregar driver con _Maven_ en Netbeans
Projects > Dependencies > Add Dependency ...
Buscar: mysql connector 8.0.17  > add > build (para descargar dependencias)
En _Dependencies_ debemos agregar el driver _jar_ para evitar el error _java.lang.NoClassDefFoundError: javax/persistence/EntityNotFoundException_

Crear nueva conexión en _Netbeans_
Services > Databases > New connection ... > new driver ... >
<C:\Users\{%UserName}\.m2\repository\mysql\mysql-connector-java\8.0.17>
Colocar los datos de conexión
_JDBC URL:_ jdbc:mysql://localhost:3306/{DB_NAME}?serverTimezone=UTC

En source packages agregamos la unidad de persistencia
new __Persistence Unit__, indicamos nombrePU, libreria y conexión.

Ahora se hace el mapeo en las clases agregando _@annotations_ en cada clase
Se agregan las clases a la unidad de persistencia _JPA Controller Classes from Entity Classes_ al cual se le agrega un _Entity Manager Factory_


