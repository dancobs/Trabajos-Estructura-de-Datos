# Proyecto Final - Implementación de Árbol AVL en Java

**Curso:** Estructuras de Datos
**Catedrático:** Ing. Brandon Chitay
**Universidad:** Universidad Da Vinci de Guatemala
**Estudiante:** Daniel Cobos
**Fecha de entrega final:** 17 de mayo

--------------------------------------------------


Este proyecto implementa desde cero un **árbol AVL** en el lenguaje de programación **Java**.

El objetivo es permitir al usuario ingresar números a la consola y que el árbol se auto-balancee (automáticamente). Además, se puede visualizar el recorrido en orden para comprobar que los elementos están correctamente organizados.

---------------------------------------

## Características del programa

* Inserción de números **en tiempo real** desde consola.
* El árbol **se balancea automáticamente** usando rotaciones LL, RR, LR y RL.
* Impresión del árbol usando el recorrido **inorden**.
* Presenta un menú fácil de usar, pensado para personas con conocimientos básicos de programación.

---------------------------

## Cómo compilar y ejecutar

### Requisitos:

* Tener instalado Java (JDK 8 o superior).

### Pasos:

1. Descarga o clona el repositorio.
2. Abre una terminal en la carpeta del proyecto.
3. Ejecuta:

```bash
javac ArbolAVL.java
java ArbolAVL
```

-----------------

## Menú del programa

Cuando ejecutas el programa, verás lo siguiente:

```
--- MENÚ ---
1. Insertar número
2. Ver árbol en orden
3. Salir
```

### Explicación:

* **Opcion 1**: Pide un número, lo inserta y balancea el árbol.
* **Opcion 2**: Muestra los valores del árbol en orden creciente.
* **Opcion 3**: Finaliza el programa.

------------

## Estructura interna del programa

### Archivos:

* `ArbolAVL.java`: contiene todo el código del programa.

  * Clase interna `NodoAVL`: representa cada nodo del árbol.
  * Métodos de inserción y rotación.
  * Lógica de balanceo del árbol.
  * Menú principal y funciones de interacción por consola.

### Funciones principales:

* `insertarValor(int valor)`: Inserta un nodo desde la terminal.
* `insertar(...)`: Inserta recursivamente y evalúa balance.
* `rotarIzquierda(...)` y `rotarDerecha(...)`: Corrigen desbalanceos.
* `balance(...)`: Devuelve el balance de un nodo.
* `mostrar()`: Imprime los elementos del árbol en orden.

--------

### Video del proyecto

Puedes ver la explicación del código, las rotaciones y la demostración del programa funcionando en el siguiente enlace:

[🔗 Ver video en YouTube](https://youtu.be/F0_Us9v_Nfk)
