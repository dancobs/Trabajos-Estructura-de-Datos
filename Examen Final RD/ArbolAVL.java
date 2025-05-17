// Proyecto Final - Árbol AVL en Java
//Daniel Estuardo Cobos
// carnet: 202203060


import java.util.Scanner;

class NodoAVL {
    int valor, altura;
    NodoAVL izquierda, derecha;

    public NodoAVL(int valor) {
        this.valor = valor;
        this.altura = 1;
    }
}

public class ArbolAVL {
    private NodoAVL raiz;

    // Obtener altura
    private int altura(NodoAVL n) {
        return (n == null) ? 0 : n.altura;
    }

    // Calcular factor de balance
    private int balance(NodoAVL n) {
        return (n == null) ? 0 : altura(n.izquierda) - altura(n.derecha);
    }

    // Rotación derecha
    private NodoAVL rotarDerecha(NodoAVL y) {
        NodoAVL x = y.izquierda;
        NodoAVL T2 = x.derecha;

        x.derecha = y;
        y.izquierda = T2;

        y.altura = Math.max(altura(y.izquierda), altura(y.derecha)) + 1;
        x.altura = Math.max(altura(x.izquierda), altura(x.derecha)) + 1;

        return x;
    }

    // Rotación izquierda
    private NodoAVL rotarIzquierda(NodoAVL x) {
        NodoAVL y = x.derecha;
        NodoAVL T2 = y.izquierda;

        y.izquierda = x;
        x.derecha = T2;

        x.altura = Math.max(altura(x.izquierda), altura(x.derecha)) + 1;
        y.altura = Math.max(altura(y.izquierda), altura(y.derecha)) + 1;

        return y;
    }

    // Insertar
    public NodoAVL insertar(NodoAVL nodo, int valor) {
        if (nodo == null) return new NodoAVL(valor);

        if (valor < nodo.valor)
            nodo.izquierda = insertar(nodo.izquierda, valor);
        else if (valor > nodo.valor)
            nodo.derecha = insertar(nodo.derecha, valor);
        else
            return nodo; // no se permiten duplicados

        nodo.altura = 1 + Math.max(altura(nodo.izquierda), altura(nodo.derecha));
        int balance = balance(nodo);

        // Casos de rotación
        if (balance > 1 && valor < nodo.izquierda.valor)
            return rotarDerecha(nodo);
        if (balance < -1 && valor > nodo.derecha.valor)
            return rotarIzquierda(nodo);
        if (balance > 1 && valor > nodo.izquierda.valor) {
            nodo.izquierda = rotarIzquierda(nodo.izquierda);
            return rotarDerecha(nodo);
        }
        if (balance < -1 && valor < nodo.derecha.valor) {
            nodo.derecha = rotarDerecha(nodo.derecha);
            return rotarIzquierda(nodo);
        }

        return nodo;
    }

    // Insertar desde consola
    public void insertarValor(int valor) {
        raiz = insertar(raiz, valor);
        System.out.println("Número " + valor + " insertado.");
    }

    // Mostrar árbol en orden
    public void imprimirEnOrden(NodoAVL nodo) {
        if (nodo != null) {
            imprimirEnOrden(nodo.izquierda);
            System.out.print(nodo.valor + " ");
            imprimirEnOrden(nodo.derecha);
        }
    }

    public void mostrar() {
        System.out.print("\nÁrbol en orden: ");
        imprimirEnOrden(raiz);
        System.out.println();
    }

    // Método principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArbolAVL arbol = new ArbolAVL();

        int opcion;
        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Insertar número");
            System.out.println("2. Ver árbol en orden");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa un número: ");
                    int valor = scanner.nextInt();
                    arbol.insertarValor(valor);
                    break;
                case 2:
                    arbol.mostrar();
                    break;
                case 3:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
            }
        } while (opcion != 3);

        scanner.close();
    }
}
