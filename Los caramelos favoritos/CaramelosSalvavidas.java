import java.util.Stack;

public class CaramelosSalvavidas {
    public static void main(String[] args) {
        // Paquete original de caramelos (el último en agregarse es el primero en sacarse)
        Stack<String> paqueteOriginal = new Stack<>();
        
        // Llenamos el paquete con caramelos de diferentes colores (en orden inverso)
        paqueteOriginal.push("rojo");
        paqueteOriginal.push("verde");
        paqueteOriginal.push("amarillo");  // Este será comido
        paqueteOriginal.push("rojo");
        paqueteOriginal.push("azul");
        paqueteOriginal.push("amarillo");  // Este será comido
        paqueteOriginal.push("verde");
        paqueteOriginal.push("amarillo");  // Este será comido
        paqueteOriginal.push("rojo");
        
        System.out.println("Paquete original de caramelos (de arriba hacia abajo): " + paqueteOriginal);
        
        // Pila temporal para guardar los caramelos que no son amarillos
        Stack<String> pilaTemp = new Stack<>();
        
        // Contador de caramelos amarillos comidos
        int caramelosAmarillosComidos = 0;
        
        System.out.println("\nProceso de sacar caramelos, comer los amarillos y guardar el resto:");
        
        // Mientras el paquete no esté vacío, vamos sacando caramelos
        while (!paqueteOriginal.isEmpty()) {
            // Sacamos un caramelo
            String caramelo = paqueteOriginal.pop();
            System.out.println("Sacando caramelo: " + caramelo);
            
            // Si es amarillo, el niño se lo come
            if (caramelo.equals("amarillo")) {
                System.out.println("¡Es amarillo! El niño se lo come.");
                caramelosAmarillosComidos++;
            } else {
                // Si no es amarillo, lo guardamos en la pila temporal
                System.out.println("No es amarillo. Se guarda para después.");
                pilaTemp.push(caramelo);
            }
        }
        
        System.out.println("\nTotal de caramelos amarillos comidos: " + caramelosAmarillosComidos);
        System.out.println("Caramelos restantes guardados temporalmente: " + pilaTemp);
        
        // Ahora devolvemos los caramelos al paquete original en el orden correcto
        System.out.println("\nDevolviendo los caramelos no amarillos al paquete:");
        
        while (!pilaTemp.isEmpty()) {
            String caramelo = pilaTemp.pop();
            paqueteOriginal.push(caramelo);
            System.out.println("Devolviendo caramelo: " + caramelo);
        }
        
        System.out.println("\nPaquete final (sin los caramelos amarillos): " + paqueteOriginal);
        
        // Mostramos el estado final del paquete de manera más visual
        System.out.println("\nOrden final del paquete (de arriba hacia abajo):");
        Stack<String> paqueteTempVisual = new Stack<>();
        
        while (!paqueteOriginal.isEmpty()) {
            paqueteTempVisual.push(paqueteOriginal.pop());
        }
        
        while (!paqueteTempVisual.isEmpty()) {
            String caramelo = paqueteTempVisual.pop();
            System.out.println("- " + caramelo);
            paqueteOriginal.push(caramelo);
        }
    }
}