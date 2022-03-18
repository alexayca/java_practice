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

- Interface
  - ResultSet
  - Connection
  - Statement
  - DataSource


- Proceso de acceso a BBDD   
    - Establecer conexion con la BBDD
      - ```driver:protocolo:detalles de la conexion del driver host y direccion``` 
    - Crear un objeto Statement
      - ```createStatement() -> Obj statement```
    - Ejecutar sentencia SQL
      - ```ResultSet = executeQuery("sentencia SQL")``` retorna una especie de tabla
    - Leer el ResultSet
      - ```getString()```
      - ```next()```

```sql
SHOW VARIABLES WHERE VARIABLE_NAME IN('hostname','port')
```

Requerimientos
- Servidor de base de datos mysql
- Driver jdbc mysql
- Agregar driver a classpath


InteliJ IDE
```File->Project Structure->Libraries```
Despues en el signo ```+``` y se busca el archivo jar
Observaremos que se agrego a "External libraries"

