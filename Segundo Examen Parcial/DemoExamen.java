import java.util.Scanner;

/**
 * Clase para demostración del examen que permite ejecutar las operaciones 
 * requeridas por el examen de manera secuencial
 */
public class DemoExamen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList lista = new LinkedList();
        int opcion;
        
        System.out.println("=== DEMOSTRACIÓN PARA EXAMEN DE LISTAS ENLAZADAS ===");
        System.out.println("Seleccione su grupo según el último dígito de su carnet:");
        System.out.println("1. Grupo 1 (carnet termina en 0, 2, 4, 6, 8)");
        System.out.println("2. Grupo 2 (carnet termina en 1, 3, 5, 7, 9)");
        System.out.print("Ingrese su opción (1 o 2): ");
        
        try {
            opcion = scanner.nextInt();
            if (opcion == 1) {
                demoGrupo1(lista, scanner);
            } else if (opcion == 2) {
                demoGrupo2(lista, scanner);
            } else {
                System.out.println("Opción no válida. Saliendo del programa.");
            }
        } catch (Exception e) {
            System.out.println("Error: Entrada inválida. Saliendo del programa.");
        }
        
        scanner.close();
    }
    
    /**
     * Realiza la demostración para el Grupo 1 (carnet termina en 0, 2, 4, 6, 8)
     */
    private static void demoGrupo1(LinkedList lista, Scanner scanner) {
        System.out.println("\n=== DEMOSTRACIÓN GRUPO 1 (carnet termina en 0, 2, 4, 6, 8) ===");
        
        // Solicitar los dígitos de DNI para usar en la demostración
        System.out.println("Para personalizar esta demo, ingrese los dígitos de su DNI que usará:");
        
        System.out.print("Ingrese el primer dígito para la demostración (debe terminar en 0, 2, 4, 6 u 8): ");
        int digito1 = scanner.nextInt();
        
        System.out.print("Ingrese el segundo dígito para la demostración: ");
        int digito2 = scanner.nextInt();
        
        System.out.print("Ingrese el tercer dígito para la demostración: ");
        int digito3 = scanner.nextInt();
        
        System.out.print("Ingrese el cuarto dígito para la demostración: ");
        int digito4 = scanner.nextInt();
        
        System.out.println("\nPresione ENTER para comenzar la demostración paso a paso...");
        scanner.nextLine(); // Limpiar el buffer
        scanner.nextLine(); // Esperar ENTER
        
        // 1. Agregar el primer dígito al inicio de la lista
        System.out.println("\n1. Agregando " + digito1 + " al inicio de la lista");
        lista.addFirst(digito1);
        lista.printList();
        waitForEnter(scanner);
        
        // 2. Agregar el segundo dígito al final de la lista
        System.out.println("\n2. Agregando " + digito2 + " al final de la lista");
        lista.add(digito2);
        lista.printList();
        waitForEnter(scanner);
        
        // 3. Agregar el tercer dígito al medio de la lista (en la posición 1)
        System.out.println("\n3. Agregando " + digito3 + " en la posición 1");
        lista.addMiddle(digito3, 1);
        lista.printList();
        waitForEnter(scanner);
        
        // 4. Mostrar la lista actual
        System.out.println("\n4. Mostrando la lista actual");
        lista.printList();
        waitForEnter(scanner);
        
        // 5. Remover el segundo dígito de la lista
        System.out.println("\n5. Removiendo el número " + digito2 + " de la lista");
        boolean removed = lista.remove(digito2);
        System.out.println("¿Se eliminó el número " + digito2 + "? " + removed);
        lista.printList();
        waitForEnter(scanner);
        
        // 6. Mostrar la lista después de la eliminación
        System.out.println("\n6. Mostrando la lista después de la eliminación");
        lista.printList();
        waitForEnter(scanner);
        
        // 7. Agregar el cuarto dígito al final de la lista
        System.out.println("\n7. Agregando " + digito4 + " al final de la lista");
        lista.add(digito4);
        lista.printList();
        waitForEnter(scanner);
        
        // 8. Verificar si el tercer dígito está en la lista
        System.out.println("\n8. Verificando si el número " + digito3 + " está en la lista");
        boolean contains3 = lista.contains(digito3);
        System.out.println("¿La lista contiene el número " + digito3 + "? " + contains3);
        waitForEnter(scanner);
        
        // 9. Verificar si un número adicional está en la lista
        int digitoAdicional = 8; // Por defecto, pero podría ser cualquier otro número
        System.out.println("\n9. Verificando si el número " + digitoAdicional + " está en la lista");
        boolean containsAdd = lista.contains(digitoAdicional);
        System.out.println("¿La lista contiene el número " + digitoAdicional + "? " + containsAdd);
        waitForEnter(scanner);
        
        // 10. Revertir la lista
        System.out.println("\n10. Revirtiendo la lista");
        lista.reverse();
        lista.printList();
        waitForEnter(scanner);
        
        // 11. Mostrar la lista después de revertir
        System.out.println("\n11. Mostrando la lista después de revertir");
        lista.printList();
        waitForEnter(scanner);
        
        // 12. Agregar un número adicional al inicio de la lista
        System.out.println("\n12. Agregando " + digitoAdicional + " al inicio de la lista");
        lista.addFirst(digitoAdicional);
        lista.printList();
        waitForEnter(scanner);
        
        // 13. Mostrar la lista final
        System.out.println("\n13. Mostrando la lista final");
        lista.printList();
        
        System.out.println("\n=== FIN DE LA DEMOSTRACIÓN ===");
    }
    
    /**
     * Realiza la demostración para el Grupo 2 (carnet termina en 1, 3, 5, 7, 9)
     */
    private static void demoGrupo2(LinkedList lista, Scanner scanner) {
        System.out.println("\n=== DEMOSTRACIÓN GRUPO 2 (carnet termina en 1, 3, 5, 7, 9) ===");
        
        // Solicitar los dígitos de DNI para usar en la demostración
        System.out.println("Para personalizar esta demo, ingrese los dígitos de su DNI que usará:");
        
        System.out.print("Ingrese el primer dígito para la demostración (debe terminar en 1, 3, 5, 7 o 9): ");
        int digito1 = scanner.nextInt();
        
        System.out.print("Ingrese el segundo dígito para la demostración: ");
        int digito2 = scanner.nextInt();
        
        System.out.print("Ingrese el tercer dígito para la demostración: ");
        int digito3 = scanner.nextInt();
        
        System.out.print("Ingrese el cuarto dígito para la demostración: ");
        int digito4 = scanner.nextInt();
        
        System.out.println("\nPresione ENTER para comenzar la demostración paso a paso...");
        scanner.nextLine(); // Limpiar el buffer
        scanner.nextLine(); // Esperar ENTER
        
        // 1. Agregar el primer dígito al inicio de la lista
        System.out.println("\n1. Agregando " + digito1 + " al inicio de la lista");
        lista.addFirst(digito1);
        lista.printList();
        waitForEnter(scanner);
        
        // 2. Agregar el segundo dígito al final de la lista
        System.out.println("\n2. Agregando " + digito2 + " al final de la lista");
        lista.add(digito2);
        lista.printList();
        waitForEnter(scanner);
        
        // 3. Agregar el tercer dígito al medio de la lista (en la posición 1)
        System.out.println("\n3. Agregando " + digito3 + " en la posición 1");
        lista.addMiddle(digito3, 1);
        lista.printList();
        waitForEnter(scanner);
        
        // 4. Mostrar la lista actual
        System.out.println("\n4. Mostrando la lista actual");
        lista.printList();
        waitForEnter(scanner);
        
        // 5. Remover el segundo dígito de la lista
        System.out.println("\n5. Removiendo el número " + digito2 + " de la lista");
        boolean removed = lista.remove(digito2);
        System.out.println("¿Se eliminó el número " + digito2 + "? " + removed);
        lista.printList();
        waitForEnter(scanner);
        
        // 6. Mostrar la lista después de la eliminación
        System.out.println("\n6. Mostrando la lista después de la eliminación");
        lista.printList();
        waitForEnter(scanner);
        
        // 7. Agregar el cuarto dígito al final de la lista
        System.out.println("\n7. Agregando " + digito4 + " al final de la lista");
        lista.add(digito4);
        lista.printList();
        waitForEnter(scanner);
        
        // 8. Verificar si el tercer dígito está en la lista
        System.out.println("\n8. Verificando si el número " + digito3 + " está en la lista");
        boolean contains3 = lista.contains(digito3);
        System.out.println("¿La lista contiene el número " + digito3 + "? " + contains3);
        waitForEnter(scanner);
        
        // 9. Verificar si un número adicional está en la lista
        int digitoAdicional = 9; // Por defecto, pero podría ser cualquier otro número
        System.out.println("\n9. Verificando si el número " + digitoAdicional + " está en la lista");
        boolean containsAdd = lista.contains(digitoAdicional);
        System.out.println("¿La lista contiene el número " + digitoAdicional + "? " + containsAdd);
        waitForEnter(scanner);
        
        // 10. Revertir la lista
        System.out.println("\n10. Revirtiendo la lista");
        lista.reverse();
        lista.printList();
        waitForEnter(scanner);
        
        // 11. Mostrar la lista después de revertir
        System.out.println("\n11. Mostrando la lista después de revertir");
        lista.printList();
        waitForEnter(scanner);
        
        // 12. Agregar un número adicional al inicio de la lista
        System.out.println("\n12. Agregando " + digitoAdicional + " al inicio de la lista");
        lista.addFirst(digitoAdicional);
        lista.printList();
        waitForEnter(scanner);
        
        // 13. Mostrar la lista final
        System.out.println("\n13. Mostrando la lista final");
        lista.printList();
        
        System.out.println("\n=== FIN DE LA DEMOSTRACIÓN ===");
    }
    
    /**
     * Espera a que el usuario presione ENTER para continuar
     */
    private static void waitForEnter(Scanner scanner) {
        System.out.println("\nPresione ENTER para continuar...");
        scanner.nextLine();
    }
}
