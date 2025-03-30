import java.util.Scanner;
import java.util.Stack;

public class EditorTexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> historial = new Stack<>();       // Pila para deshacer (historial de líneas)
        Stack<String> historialDeshecho = new Stack<>(); // Pila para rehacer (líneas deshechas)
        
        String entrada;
        boolean continuar = true;
        
        System.out.println("Editor de texto simple");
        System.out.println("Comandos disponibles: DESHACER, REHACER, MOSTRAR, SALIR");
        
        while (continuar) {
            entrada = scanner.nextLine();
            
            switch (entrada.toUpperCase()) {
                case "DESHACER":
                    if (!historial.isEmpty()) {
                        // Guarda la línea deshecha en la pila de rehacer
                        String lineaDeshecha = historial.pop();
                        historialDeshecho.push(lineaDeshecha);
                        System.out.println("Acción deshecha.");
                    } else {
                        System.out.println("No hay acciones para deshacer.");
                    }
                    break;
                    
                case "REHACER":
                    if (!historialDeshecho.isEmpty()) {
                        // Recupera la última línea deshecha
                        String lineaRecuperada = historialDeshecho.pop();
                        historial.push(lineaRecuperada);
                        System.out.println("Acción rehecha.");
                    } else {
                        System.out.println("No hay acciones para rehacer.");
                    }
                    break;
                    
                case "MOSTRAR":
                    if (historial.isEmpty()) {
                        System.out.println("El editor está vacío.");
                    } else {
                        // Convertimos la pila a un array para mostrar las líneas en orden original
                        String[] lineas = historial.toArray(new String[0]);
                        for (int i = 0; i < lineas.length; i++) {
                            System.out.println(lineas[i]);
                        }
                    }
                    break;
                    
                case "SALIR":
                    continuar = false;
                    System.out.println("¡Hasta pronto!");
                    break;
                    
                default:
                    // Si no es un comando, se agrega como texto
                    historial.push(entrada);
                    // Al agregar nuevo texto, se limpia la pila de deshechos
                    historialDeshecho.clear();
                    break;
            }
        }
        
        scanner.close();
    }
}