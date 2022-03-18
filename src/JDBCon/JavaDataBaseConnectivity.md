# Java Data Base Connectivity

Proporciona acceso a varios SGBD
    Establece una conexion
    Permite manipulacion a BBDD 
        Utilizando SQL
Proporcionado por el fabricante del SGBD

Paquetes
Java.sql 
Javax.sql

class DriverManager

Interface
    ResultSet
    Connection
    Statement
    DataSource

Proceso de acceso a BBDD   
    Establecer conexion con la BBDD
        driver:protocolo:detalles de la conexion del driver host y direccion
    Crear un objeto Statement
        createStatement() -> Obj statement
    Ejecutar sentencia SQL
        executeQuery("sentencia SQL")
    Leer el ResultSet
        getString()
        next()

