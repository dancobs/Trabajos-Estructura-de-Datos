/**
 * Interfaz que define el TDA Deque (Cola de Doble Extremo)
 * @param <T> Tipo de datos que almacenará el deque
 */
interface Deque<T> {
    /**
     * Inserta un elemento al inicio del deque
     * @param elemento El elemento a insertar
     */
    void insertarInicio(T elemento);
    
    /**
     * Inserta un elemento al final del deque
     * @param elemento El elemento a insertar
     */
    void insertarFinal(T elemento);
    
    /**
     * Elimina y devuelve el elemento del inicio del deque
     * @return El elemento eliminado del inicio
     * @throws EmptyDequeException si el deque está vacío
     */
    T eliminarInicio() throws EmptyDequeException;
    
    /**
     * Elimina y devuelve el elemento del final del deque
     * @return El elemento eliminado del final
     * @throws EmptyDequeException si el deque está vacío
     */
    T eliminarFinal() throws EmptyDequeException;
    
    /**
     * Consulta el elemento del inicio del deque sin eliminarlo
     * @return El elemento del inicio
     * @throws EmptyDequeException si el deque está vacío
     */
    T primero() throws EmptyDequeException;
    
    /**
     * Consulta el elemento del final del deque sin eliminarlo
     * @return El elemento del final
     * @throws EmptyDequeException si el deque está vacío
     */
    T ultimo() throws EmptyDequeException;
    
    /**
     * Verifica si el deque está vacío
     * @return true si el deque está vacío, false en caso contrario
     */
    boolean estaVacio();
    
    /**
     * Retorna el número de elementos en el deque
     * @return Cantidad de elementos
     */
    int tamaño();
    
    /**
     * Limpia todos los elementos del deque
     */
    void vaciar();
}

/**
 * Excepción para manejar intentos de acceder a un deque vacío
 */
class EmptyDequeException extends RuntimeException {
    public EmptyDequeException(String mensaje) {
        super(mensaje);
    }
}

/**
 * Implementación del TDA Deque utilizando una lista doblemente enlazada
 * @param <T> Tipo de datos que almacenará el deque
 */
public class DequeImpl<T> implements Deque<T> {
    
    // Clase interna para los nodos de la lista doblemente enlazada
    private class Nodo {
        T dato;
        Nodo siguiente;
        Nodo anterior;
        
        public Nodo(T dato) {
            this.dato = dato;
            this.siguiente = null;
            this.anterior = null;
        }
    }
    
    private Nodo inicio;  // Referencia al primer nodo
    private Nodo fin;     // Referencia al último nodo
    private int cantidad; // Contador de elementos
    
    /**
     * Constructor que inicializa un deque vacío
     */
    public DequeImpl() {
        this.inicio = null;
        this.fin = null;
        this.cantidad = 0;
    }
    
    @Override
    public void insertarInicio(T elemento) {
        Nodo nuevoNodo = new Nodo(elemento);
        
        if (estaVacio()) {
            // Si está vacío, el nuevo nodo es tanto el inicio como el fin
            inicio = nuevoNodo;
            fin = nuevoNodo;
        } else {
            // Si no está vacío, el nuevo nodo se convierte en el inicio
            nuevoNodo.siguiente = inicio;
            inicio.anterior = nuevoNodo;
            inicio = nuevoNodo;
        }
        
        cantidad++;
    }
    
    @Override
    public void insertarFinal(T elemento) {
        Nodo nuevoNodo = new Nodo(elemento);
        
        if (estaVacio()) {
            // Si está vacío, el nuevo nodo es tanto el inicio como el fin
            inicio = nuevoNodo;
            fin = nuevoNodo;
        } else {
            // Si no está vacío, el nuevo nodo se convierte en el fin
            fin.siguiente = nuevoNodo;
            nuevoNodo.anterior = fin;
            fin = nuevoNodo;
        }
        
        cantidad++;
    }
    
    @Override
    public T eliminarInicio() throws EmptyDequeException {
        if (estaVacio()) {
            throw new EmptyDequeException("No se puede eliminar de un deque vacío");
        }
        
        T dato = inicio.dato; // Guardamos el dato a retornar
        
        if (inicio == fin) {
            // Si solo hay un elemento, el deque queda vacío
            inicio = null;
            fin = null;
        } else {
            // Si hay más elementos, el segundo se convierte en el primero
            inicio = inicio.siguiente;
            inicio.anterior = null;
        }
        
        cantidad--;
        return dato;
    }
    
    @Override
    public T eliminarFinal() throws EmptyDequeException {
        if (estaVacio()) {
            throw new EmptyDequeException("No se puede eliminar de un deque vacío");
        }
        
        T dato = fin.dato; // Guardamos el dato a retornar
        
        if (inicio == fin) {
            // Si solo hay un elemento, el deque queda vacío
            inicio = null;
            fin = null;
        } else {
            // Si hay más elementos, el penúltimo se convierte en el último
            fin = fin.anterior;
            fin.siguiente = null;
        }
        
        cantidad--;
        return dato;
    }
    
    @Override
    public T primero() throws EmptyDequeException {
        if (estaVacio()) {
            throw new EmptyDequeException("El deque está vacío");
        }
        return inicio.dato;
    }
    
    @Override
    public T ultimo() throws EmptyDequeException {
        if (estaVacio()) {
            throw new EmptyDequeException("El deque está vacío");
        }
        return fin.dato;
    }
    
    @Override
    public boolean estaVacio() {
        return inicio == null;
    }
    
    @Override
    public int tamaño() {
        return cantidad;
    }
    
    @Override
    public void vaciar() {
        inicio = null;
        fin = null;
        cantidad = 0;
    }
    
    @Override
    public String toString() {
        if (estaVacio()) {
            return "Deque vacío";
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append("Deque: [");
        
        Nodo actual = inicio;
        while (actual != null) {
            sb.append(actual.dato);
            if (actual.siguiente != null) {
                sb.append(", ");
            }
            actual = actual.siguiente;
        }
        
        sb.append("]");
        return sb.toString();
    }
    
    /**
     * Método main para probar la implementación con el ejemplo del restaurante
     */
    public static void main(String[] args) {
        // Creamos un deque para manejar la lista de espera del restaurante
        Deque<String> listaEspera = new DequeImpl<>();
        
        System.out.println("=== Sistema de Lista de Espera de Restaurante ===");
        
        // Llegada de clientes (insertamos al final)
        System.out.println("\nLlegada de clientes:");
        listaEspera.insertarFinal("Carlos");
        listaEspera.insertarFinal("Ana");
        listaEspera.insertarFinal("Pedro");
        listaEspera.insertarFinal("Lucía");
        System.out.println(listaEspera);
        
        // Atendemos al primer cliente pero no hay mesa disponible
        System.out.println("\nAtendiendo al primer cliente (Carlos) pero no hay mesa disponible:");
        String primerCliente = listaEspera.eliminarInicio();
        System.out.println("Cliente retirado de la lista: " + primerCliente);
        System.out.println("Reinsertando a " + primerCliente + " al inicio de la lista");
        listaEspera.insertarInicio(primerCliente);
        System.out.println(listaEspera);
        
        // Un cliente impaciente (Lucía) se va
        System.out.println("\nUn cliente impaciente (Lucía) abandona la lista de espera:");
        String clienteImpaciente = listaEspera.eliminarFinal();
        System.out.println("Cliente que abandonó la lista: " + clienteImpaciente);
        System.out.println(listaEspera);
        
        // Atendemos a los clientes restantes
        System.out.println("\nAtendiendo a los clientes restantes:");
        while (!listaEspera.estaVacio()) {
            System.out.println("Atendiendo a: " + listaEspera.eliminarInicio());
            System.out.println("Lista actual: " + listaEspera);
        }
    }
}