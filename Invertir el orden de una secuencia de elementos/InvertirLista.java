import java.util.Stack;
import java.util.Arrays;

public class InvertirLista {
    
    /**
     * Método para invertir un arreglo utilizando una pila
     * @param arreglo El arreglo a invertir
     */
    public static void invertirArreglo(int[] arreglo) {
        // Crear una pila vacía para almacenamiento auxiliar
        Stack<Integer> pila = new Stack<>();
        
        System.out.println("Arreglo original: " + Arrays.toString(arreglo));
        
        // Paso 1: Insertar todos los elementos del arreglo en la pila
        System.out.println("\nInsertando elementos en la pila:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Insertando: " + arreglo[i]);
            pila.push(arreglo[i]);
        }
        
        System.out.println("\nEstado de la pila después de insertar todos los elementos: " + pila);
        
        // Paso 2: Extraer los elementos de la pila y sobrescribir el arreglo original
        System.out.println("\nExtrayendo elementos de la pila y sobrescribiendo el arreglo:");
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = pila.pop();
            System.out.println("Posición " + i + " del arreglo ahora contiene: " + arreglo[i]);
        }
        
        System.out.println("\nArreglo invertido: " + Arrays.toString(arreglo));
    }
    
    /**
     * Método genérico para invertir cualquier tipo de arreglo utilizando una pila
     * @param <T> Tipo de datos del arreglo
     * @param arreglo El arreglo a invertir
     */
    public static <T> void invertirArregloGenerico(T[] arreglo) {
        // Crear una pila vacía para almacenamiento auxiliar
        Stack<T> pila = new Stack<>();
        
        System.out.println("Arreglo original: " + Arrays.toString(arreglo));
        
        // Paso 1: Insertar todos los elementos del arreglo en la pila
        System.out.println("\nInsertando elementos en la pila:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Insertando: " + arreglo[i]);
            pila.push(arreglo[i]);
        }
        
        System.out.println("\nEstado de la pila después de insertar todos los elementos: " + pila);
        
        // Paso 2: Extraer los elementos de la pila y sobrescribir el arreglo original
        System.out.println("\nExtrayendo elementos de la pila y sobrescribiendo el arreglo:");
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = pila.pop();
            System.out.println("Posición " + i + " del arreglo ahora contiene: " + arreglo[i]);
        }
        
        System.out.println("\nArreglo invertido: " + Arrays.toString(arreglo));
    }
    
    public static void main(String[] args) {
        // Ejemplo con un arreglo de enteros
        int[] numeros = {1, 2, 3, 4, 5};
        System.out.println("===== INVERTIR ARREGLO DE ENTEROS =====");
        invertirArreglo(numeros);
        
        // Ejemplo con un arreglo de cadenas
        String[] nombres = {"Ana", "Carlos", "Elena", "David", "Beatriz"};
        System.out.println("\n\n===== INVERTIR ARREGLO DE CADENAS =====");
        invertirArregloGenerico(nombres);
        
        // Ejemplo con otros tipos de datos
        Double[] decimales = {1.1, 2.2, 3.3, 4.4, 5.5};
        System.out.println("\n\n===== INVERTIR ARREGLO DE DECIMALES =====");
        invertirArregloGenerico(decimales);
    }
}