# Colecciones

Almacen de objetos dinámicos
Pueden proveer ordenamiento
Permiten insertar y eliminar elementos
NO puede almacenar tipos primitivos



## Interfaces de _Colecciones_

---
- __Collection__
    - __Set__   (almacena una coleccion de elementos no repetidos sin ordenar, es más eficiente)
        - __SortedSet__ ()
    - __List__ (pueden estar repetidos e indexados con valores numericos, con acceso aleatorio)
    - __Queue__ (No permite acceso aleatorio)


    - __Map__ (elementos repetibles por clave unica arbitraria [array asosciativo en PHP o diccionario en python])
        - __SortedMap__ ()



### Clases utilizadas en interfaz __List__

---
- ArrayList 
    - Muy rapida accediendo a elementos. 
    - Se adapta a un gran numero de escenarios
- LinkedList
    - Listas enlazadas
    - gran eficiencia agregando y eliminando elementos
- Vector
    - Obsoleta
    - Utilizada únicamente en operaciones de concurrencia
- CopyOnWriteArrayList
    - Utilizada en programas concurrentes
    - Eficiente en operaciones de lectura pero muy poco eficiente en operaciones de escritura.
---


* _Ventajas_
    - Acceso aleatorio
    - Ordenadas (```collection.sort()```)
    - Añadir / Eliminar sin restricción
    - ListIterator modifica cualquier dirección
    - Sintaxis similar a Arrays

* _Inconvenientes_
    - Bajo rendimiento en operaciones concretas que se resolverian mejor con otras interfaces



### Clases utilizadas en interfaz __Set__

---
- HashSet (Rapida; No duplicados; NO ordenación; NO acceso aleatorio)
- LinkedHashSet (Ordenacion por entrada; Eficiente al acceder; NO eficiente al agregar)
- TreeSet (Es Ordenado; Poco eficiente)
- EnumSet (La mejor para tipos enumerados)
- CopyOnWriteArraySet (Especifico concurrencia; Eficiente lectura; Poco eficiente escritura; Poco eficiente al eliminar)
- ConcurrentSkipListSet (Especifico concurrencia; Admite ordenación; Con muchos elementos no es eficiente.)
---


* _Ventajas_
    - No permiten elementos duplicados
    - Uso sencillo del metodo ```add``` que ademas asegura no elementos duplicados

* _Inconvenientes_
    - No tiene acceso aleatorio
    - Poca eficiencia a la hora de ordenar elementos




### Clases utilizadas en interfaz __Map__

---
- HashMap (No ordenacion; Eficiente)
- LinkedHashMap (Ordenamiento por insercion; Permite ordenacion por uso; Eficiente lectura; Poca eficiencia escritura)
- TreeMap (ordenado por clave; Poco eficiente en todas sus operaciones)
- EnumMap (Permite enum como claves; Muy eficiente)
- WeakHashMap (Utilizado para crear elementos que vaya borrando el sistema si no se utilizan; Muy poco eficiente)
- Hashtable (Considerado obsoleto; Utilizado en operaciones de concurrencia)
- ConcurrentHashMap (utilizado en concurrencia; No permite nulos)
---

* _Ventajas_
    - Asociación Clave -> Valor
    - No claves iguales

* _Inconvenientes_
    - Poca eficiencia comparado con las demas colecciones




### Clases utilizadas en interfaz __Queues__

---
- ArrayDeque
- LinkedBlockingDeque
- LinkedList
- PriorityQueue
- PriorityBlockingQueue
---

* _Ventajas_
    - Muy rapido al acceder al primer y ultimo elemento
    - Permite crear colas de elementos muy eficientes (LIFO/FIFO)

* _Inconvenientes_
    - Acceso lento a los elementos intermedios

