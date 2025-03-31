/**
 * Clase principal que demuestra el funcionamiento de la lista enlazada
 * En este ejemplo, utilizamos números específicos para la demostración,
 * pero se deben reemplazar con los dígitos de tu DNI en la implementación final
 */
public class Main {
    public static void main(String[] args) {
        // Crear una nueva lista enlazada
        LinkedList lista = new LinkedList();
        
        System.out.println("=== DEMOSTRACIÓN DE LISTA ENLAZADA ===");
        
        // El siguiente código muestra un ejemplo para el Grupo 1 (carnet terminando en 0, 2, 4, 6, 8)
        // Si tu carnet termina en 1, 3, 5, 7, 9, debes seguir las instrucciones del Grupo 2
        
        // 1. Agregar el número 0 al inicio de la lista
        System.out.println("\n1. Agregando 0 al inicio de la lista");
        lista.addFirst(0);
        lista.printList();
        
        // 2. Agregar el número 2 al final de la lista
        System.out.println("\n2. Agregando 2 al final de la lista");
        lista.add(2);
        lista.printList();
        
        // 3. Agregar el número 4 al medio de la lista (en la posición 1)
        System.out.println("\n3. Agregando 4 en la posición 1");
        lista.addMiddle(4, 1);
        lista.printList();
        
        // 4. Mostrar la lista actual
        System.out.println("\n4. Mostrando la lista actual");
        lista.printList();
        
        // 5. Remover el número 2 de la lista
        System.out.println("\n5. Removiendo el número 2 de la lista");
        boolean removed = lista.remove(2);
        System.out.println("¿Se eliminó el número 2? " + removed);
        lista.printList();
        
        // 6. Mostrar la lista después de la eliminación
        System.out.println("\n6. Mostrando la lista después de la eliminación");
        lista.printList();
        
        // 7. Agregar el número 6 al final de la lista
        System.out.println("\n7. Agregando 6 al final de la lista");
        lista.add(6);
        lista.printList();
        
        // 8. Verificar si el número 4 está en la lista (Método contains)
        System.out.println("\n8. Verificando si el número 4 está en la lista");
        boolean contains4 = lista.contains(4);
        System.out.println("¿La lista contiene el número 4? " + contains4);
        
        // 9. Verificar si el número 8 está en la lista (Método contains)
        System.out.println("\n9. Verificando si el número 8 está en la lista");
        boolean contains8 = lista.contains(8);
        System.out.println("¿La lista contiene el número 8? " + contains8);
        
        // 10. Revertir la lista (Método reverse)
        System.out.println("\n10. Revirtiendo la lista");
        lista.reverse();
        lista.printList();
        
        // 11. Mostrar la lista después de revertir
        System.out.println("\n11. Mostrando la lista después de revertir");
        lista.printList();
        
        // 12. Agregar el número 8 al inicio de la lista
        System.out.println("\n12. Agregando 8 al inicio de la lista");
        lista.addFirst(8);
        lista.printList();
        
        // 13. Mostrar la lista final
        System.out.println("\n13. Mostrando la lista final");
        lista.printList();
        
        System.out.println("\n=== FIN DE LA DEMOSTRACIÓN ===");
    }
}