import java.util.Scanner;

/**
 * Clase principal con un menú interactivo para manipular la lista enlazada
 */
public class MainInteractive {
    public static void main(String[] args) {
        // Crear una nueva lista enlazada
        LinkedList lista = new LinkedList();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        System.out.println("=== LISTA ENLAZADA INTERACTIVA ===");
        
        do {
            // Mostrar menú
            System.out.println("\nOPCIONES:");
            System.out.println("1. Agregar número al final de la lista");
            System.out.println("2. Agregar número al inicio de la lista");
            System.out.println("3. Agregar número en una posición específica");
            System.out.println("4. Eliminar un número de la lista");
            System.out.println("5. Verificar si un número está en la lista");
            System.out.println("6. Invertir la lista");
            System.out.println("7. Mostrar la lista");
            System.out.println("0. Salir");
            System.out.print("Ingrese su opción: ");
            
            try {
                opcion = scanner.nextInt();
                
                switch (opcion) {
                    case 1: // Agregar al final
                        System.out.print("Ingrese el número a agregar al final: ");
                        int numeroFinal = scanner.nextInt();
                        lista.add(numeroFinal);
                        System.out.println("Número " + numeroFinal + " agregado al final.");
                        lista.printList(); // Mostrar la lista actualizada
                        break;
                        
                    case 2: // Agregar al inicio
                        System.out.print("Ingrese el número a agregar al inicio: ");
                        int numeroInicio = scanner.nextInt();
                        lista.addFirst(numeroInicio);
                        System.out.println("Número " + numeroInicio + " agregado al inicio.");
                        lista.printList(); // Mostrar la lista actualizada
                        break;
                        
                    case 3: // Agregar en posición específica
                        System.out.print("Ingrese el número a agregar: ");
                        int numeroMedio = scanner.nextInt();
                        System.out.print("Ingrese la posición (0 es el inicio): ");
                        int posicion = scanner.nextInt();
                        try {
                            lista.addMiddle(numeroMedio, posicion);
                            System.out.println("Número " + numeroMedio + " agregado en la posición " + posicion + ".");
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        lista.printList(); // Mostrar la lista actualizada
                        break;
                        
                    case 4: // Eliminar número
                        System.out.print("Ingrese el número a eliminar: ");
                        int numeroEliminar = scanner.nextInt();
                        boolean eliminado = lista.remove(numeroEliminar);
                        if (eliminado) {
                            System.out.println("Número " + numeroEliminar + " eliminado con éxito.");
                        } else {
                            System.out.println("El número " + numeroEliminar + " no se encontró en la lista.");
                        }
                        lista.printList(); // Mostrar la lista actualizada
                        break;
                        
                    case 5: // Verificar si contiene
                        System.out.print("Ingrese el número a buscar: ");
                        int numeroBuscar = scanner.nextInt();
                        boolean contiene = lista.contains(numeroBuscar);
                        if (contiene) {
                            System.out.println("El número " + numeroBuscar + " SÍ está en la lista.");
                        } else {
                            System.out.println("El número " + numeroBuscar + " NO está en la lista.");
                        }
                        break;
                        
                    case 6: // Invertir lista
                        lista.reverse();
                        System.out.println("Lista invertida:");
                        lista.printList(); // Mostrar la lista actualizada
                        break;
                        
                    case 7: // Mostrar lista
                        System.out.println("Estado actual de la lista:");
                        lista.printList();
                        break;
                        
                    case 0: // Salir
                        System.out.println("Saliendo del programa...");
                        break;
                        
                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error: Entrada inválida. Por favor, ingrese un número.");
                scanner.nextLine(); // Limpiar el buffer del scanner
                opcion = -1; // Para continuar el bucle
            }
            
        } while (opcion != 0);
        
        scanner.close();
        System.out.println("\n=== FIN DEL PROGRAMA ===");
    }
}
