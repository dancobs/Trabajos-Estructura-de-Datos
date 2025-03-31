# Implementación de Lista Enlazada Simple en Java

Este proyecto implementa una lista enlazada simple en Java como parte del examen parcial de la clase de Estructura de Datos.

## Descripción

La implementación incluye las siguientes clases:

1. **Node.java**: Representa un nodo individual en la lista enlazada. Cada nodo contiene un valor entero (`data`) y una referencia al siguiente nodo (`next`).

2. **LinkedList.java**: Implementa la estructura de datos de lista enlazada con los siguientes métodos:
   - `add(int data)`: Agrega un nuevo nodo al final de la lista.
   - `addFirst(int data)`: Agrega un nuevo nodo al inicio de la lista.
   - `addMiddle(int data, int position)`: Agrega un nuevo nodo en una posición específica.
   - `remove(int data)`: Elimina el nodo que contiene el valor especificado.
   - `printList()`: Imprime todos los valores de la lista.
   - `reverse()`: Invierte el orden de la lista.
   - `contains(int value)`: Verifica si la lista contiene el valor especificado.

3. **MainInteractive.java**: Proporciona un menú interactivo para manipular la lista enlazada.

4. **DemoExamen.java**: Clase para demostrar el funcionamiento específico requerido en el examen.

## Cómo Ejecutar

### Requisitos Previos
- Java JDK 8 o superior instalado
- Compilador de Java (javac)

### Pasos para Compilar y Ejecutar

1. **Clonar el repositorio**:
   ```
   git clone [URL del repositorio]
   cd [nombre-del-repositorio]
   ```

2. **Compilar los archivos**:
   ```
   javac Node.java LinkedList.java MainInteractive.java DemoExamen.java
   ```

3. **Ejecutar el programa interactivo**:
   ```
   java MainInteractive
   ```

4. **Ejecutar la demostración examen**:
   ```
   java DemoExamen
   ```

## Programas Principales

### MainInteractive.java
Proporciona un menú interactivo que permite:
- Agregar números al inicio, final o en posiciones específicas
- Eliminar números
- Verificar si la lista contiene ciertos valores
- Invertir la lista
- Mostrar la lista en cualquier momento

### DemoExamen.java
Está diseñado específicamente para el examen, permitiendo:
- Seleccionar el grupo según el último dígito del carnet (0,2,4,6,8 o 1,3,5,7,9)
- Ingresar los dígitos de tu DNI para personalizar la demostración
- Ejecutar paso a paso todas las operaciones requeridas en el examen
- Ver los resultados de cada operación en tiempo real


### Consideraciones Importantes

1. **Memoria Dinámica**: La implementación utiliza memoria dinámica a través de referencias entre nodos.
   
2. **Gestión de Referencias**: Cada nodo contiene una referencia al siguiente, formando una cadena de nodos.
   
3. **Operaciones Eficientes**: Los métodos están implementados para ser eficientes en términos de tiempo y espacio.

## Explicación de los Métodos

### Clase Node
- **Constructor**: Inicializa un nodo con un valor específico y sin referencia al siguiente nodo.

### Clase LinkedList
- **add()**: Recorre la lista hasta el final y agrega un nuevo nodo.
- **addFirst()**: Agrega un nodo al inicio cambiando la referencia de la cabeza.
- **addMiddle()**: Inserta un nodo en una posición específica ajustando las referencias.
- **remove()**: Elimina un nodo buscando primero su posición y luego ajustando las referencias.
- **printList()**: Recorre la lista e imprime cada valor.
- **reverse()**: Invierte las referencias de cada nodo para cambiar el orden de la lista.
- **contains()**: Busca un valor específico en la lista.

## Video Explicativo

El video explicativo de esta implementación está disponible en:
https://universidaddavincid-my.sharepoint.com/:v:/g/personal/202203060_estudiante_udv_edu_gt/EXF9KOuWUIREuqWAI8cZXDcBp_KydKcdvgOwPthqD0cdGA?nav=eyJyZWZlcnJhbEluZm8iOnsicmVmZXJyYWxBcHAiOiJTdHJlYW1XZWJBcHAiLCJyZWZlcnJhbFZpZXciOiJTaGFyZURpYWxvZy1MaW5rIiwicmVmZXJyYWxBcHBQbGF0Zm9ybSI6IldlYiIsInJlZmVycmFsTW9kZSI6InZpZXcifX0%3D&e=c5ccVR
