/**
 * Clase Node que representa un nodo en una lista enlazada
 * Cada nodo contiene un valor entero y una referencia al siguiente nodo
 */
public class Node {
    // Datos que almacena el nodo
    int data;
    
    // Referencia al siguiente nodo en la lista
    Node next;
    
    /**
     * Constructor que inicializa un nodo con un valor específico
     * @param data Valor entero que se almacenará en el nodo
     */
    public Node(int data) {
        this.data = data;
        this.next = null; // Al crear un nodo, no tiene siguiente nodo
    }
}