import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SistemaAtencion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> fila = new LinkedList<>(); // Usamos LinkedList como implementación de Queue
        
        String entrada;
        boolean continuar = true;
        
        System.out.println("Sistema de Atención en Tienda");
        System.out.println("Comandos disponibles: LLEGAR [nombre], ATENDER, MOSTRAR, SALIR");
        
        while (continuar) {
            entrada = scanner.nextLine();
            
            if (entrada.startsWith("LLEGAR ")) {
                // Extraer el nombre del cliente (todo después de "LLEGAR ")
                String nombre = entrada.substring(7);
                fila.add(nombre);
                System.out.println(nombre + " ha sido agregado a la fila.");
            } 
            else if (entrada.equals("ATENDER")) {
                if (!fila.isEmpty()) {
                    String clienteAtendido = fila.poll(); // Remueve y retorna el primer elemento
                    System.out.println("Atendiendo a: " + clienteAtendido);
                } else {
                    System.out.println("No hay clientes en la fila.");
                }
            } 
            else if (entrada.equals("MOSTRAR")) {
                if (fila.isEmpty()) {
                    System.out.println("La fila está vacía.");
                } else {
                    System.out.print("Fila actual: ");
                    // Convertimos la cola a un array para no modificarla al mostrarla
                    Object[] clientes = fila.toArray();
                    for (int i = 0; i < clientes.length; i++) {
                        System.out.print(clientes[i]);
                        if (i < clientes.length - 1) {
                            System.out.print(", ");
                        }
                    }
                    System.out.println();
                }
            } 
            else if (entrada.equals("SALIR")) {
                continuar = false;
                System.out.println("Cerrando el sistema de atención.");
            } 
            else {
                System.out.println("Comando no reconocido. Intente nuevamente.");
            }
        }
        
        scanner.close();
    }
}