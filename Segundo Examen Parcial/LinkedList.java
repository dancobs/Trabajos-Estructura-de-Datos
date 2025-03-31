/**
 * Clase LinkedList que implementa una lista enlazada simple
 * Esta implementación permite agregar elementos al inicio, final o en una posición específica,
 * eliminar elementos, mostrar la lista, invertir su orden y verificar si contiene un valor
 */
public class LinkedList {
    // Referencia al primer nodo de la lista
    private Node head;
    
    /**
     * Constructor que inicializa una lista vacía
     */
    public LinkedList() {
        this.head = null;
    }
    
    /**
     * Agrega un nuevo nodo con el valor especificado al final de la lista
     * @param data Valor a agregar
     */
    public void add(int data) {
        // Crear un nuevo nodo con el valor proporcionado
        Node newNode = new Node(data);
        
        // Si la lista está vacía, el nuevo nodo será la cabeza
        if (head == null) {
            head = newNode;
            return;
        }
        
        // Si no está vacía, recorremos hasta el último nodo
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        
        // Enlazamos el último nodo con el nuevo
        current.next = newNode;
    }
    
    /**
     * Agrega un nuevo nodo con el valor especificado al inicio de la lista
     * @param data Valor a agregar
     */
    public void addFirst(int data) {
        // Crear un nuevo nodo con el valor proporcionado
        Node newNode = new Node(data);
        
        // El siguiente del nuevo nodo será la cabeza actual
        newNode.next = head;
        
        // El nuevo nodo se convierte en la cabeza
        head = newNode;
    }
    
    /**
     * Agrega un nuevo nodo con el valor especificado en una posición específica
     * @param data Valor a agregar
     * @param position Posición donde agregar (0 es el inicio)
     * @throws IndexOutOfBoundsException si la posición no es válida
     */
    public void addMiddle(int data, int position) {
        // Si la posición es 0, usamos addFirst
        if (position == 0) {
            addFirst(data);
            return;
        }
        
        // Crear un nuevo nodo con el valor proporcionado
        Node newNode = new Node(data);
        
        // Recorremos hasta la posición anterior a donde queremos insertar
        Node current = head;
        int currentPos = 0;
        
        while (current != null && currentPos < position - 1) {
            current = current.next;
            currentPos++;
        }
        
        // Verificar si la posición es válida
        if (current == null) {
            throw new IndexOutOfBoundsException("Posición inválida: " + position);
        }
        
        // Insertar el nuevo nodo en la posición deseada
        newNode.next = current.next;
        current.next = newNode;
    }
    
    /**
     * Elimina el primer nodo que contiene el valor especificado
     * @param data Valor a eliminar
     * @return true si se eliminó el valor, false si no se encontró
     */
    public boolean remove(int data) {
        // Si la lista está vacía, no hay nada que eliminar
        if (head == null) {
            return false;
        }
        
        // Si el valor está en la cabeza, actualizamos la cabeza
        if (head.data == data) {
            head = head.next;
            return true;
        }
        
        // Buscamos el nodo que contiene el valor
        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }
        
        // Si llegamos al final sin encontrar el valor
        if (current.next == null) {
            return false;
        }
        
        // Eliminamos el nodo que contiene el valor
        current.next = current.next.next;
        return true;
    }
    
    /**
     * Imprime todos los valores de la lista
     */
    public void printList() {
        // Si la lista está vacía
        if (head == null) {
            System.out.println("Lista vacía");
            return;
        }
        
        // Recorrer la lista e imprimir cada valor
        Node current = head;
        System.out.print("Lista: ");
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }
    
    /**
     * Invierte el orden de la lista enlazada
     */
    public void reverse() {
        // Si la lista está vacía o solo tiene un elemento, no hay nada que invertir
        if (head == null || head.next == null) {
            return;
        }
        
        Node prev = null;
        Node current = head;
        Node next = null;
        
        // Recorremos la lista, cambiando las referencias
        while (current != null) {
            // Guardamos el siguiente nodo
            next = current.next;
            
            // Invertimos la referencia del nodo actual
            current.next = prev;
            
            // Avanzamos prev y current
            prev = current;
            current = next;
        }
        
        // La nueva cabeza es el último nodo
        head = prev;
    }
    
    /**
     * Verifica si la lista contiene el valor especificado
     * @param value Valor a buscar
     * @return true si el valor está en la lista, false en caso contrario
     */
    public boolean contains(int value) {
        // Recorremos la lista buscando el valor
        Node current = head;
        while (current != null) {
            if (current.data == value) {
                return true;
            }
            current = current.next;
        }
        
        // Si llegamos al final sin encontrar el valor
        return false;
    }
}