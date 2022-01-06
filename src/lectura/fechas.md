# Manejo de fechas

Algunas veces necesitamos trabajar las fechas como tipo de dato ```Date``` y otras veces como ```String```. Para resolver esto podemos usar ```SimpleDateFormat```.


```java
            SimpleDateFormat format = new SimpleDateFormat(pattern: "dd/MM/yyyy");

            // Transformar fechas de formato String a Date:
            this.date = format.parse(dateAsString);

            // Transformar fechas de formato Date a String:
            this.date = format.format(dateAsDate);
```
