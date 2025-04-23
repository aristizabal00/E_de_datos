// Clase que representa un nodo en el árbol binario de búsqueda
class Nodo {
    String palabra;
    Nodo izquierda, derecha;

    public Nodo(String palabra) {
        this.palabra = palabra;
        izquierda = derecha = null;
    }
}

// Clase que representa el árbol binario de búsqueda
class Diccionario {
    Nodo raiz;

    public Diccionario() {
        raiz = null;
    }

    // Función para agregar una nueva palabra al árbol
    public void agregar(String palabra) {
        raiz = agregarRecursivo(raiz, palabra);
    }

    // Función recursiva para agregar una palabra
    private Nodo agregarRecursivo(Nodo raiz, String palabra) {
        // Si el árbol está vacío, crear un nuevo nodo
        if (raiz == null) {
            raiz = new Nodo(palabra);
            return raiz;
        }

        // Si la palabra es menor que la palabra en el nodo actual, se va a la izquierda
        if (palabra.compareTo(raiz.palabra) < 0) {
            raiz.izquierda = agregarRecursivo(raiz.izquierda, palabra);
        }
        // Si la palabra es mayor que la palabra en el nodo actual, se va a la derecha
        else if (palabra.compareTo(raiz.palabra) > 0) {
            raiz.derecha = agregarRecursivo(raiz.derecha, palabra);
        }

        // Si la palabra ya está en el árbol, no hacemos nada (no aceptamos duplicados)
        return raiz;
    }

    // Función para buscar una palabra en el árbol
    public boolean buscar(String palabra) {
        return buscarRecursivo(raiz, palabra);
    }

    // Función recursiva para buscar una palabra
    private boolean buscarRecursivo(Nodo raiz, String palabra) {
        // Si el árbol está vacío, la palabra no se encuentra
        if (raiz == null) {
            return false;
        }

        // Si la palabra es igual a la palabra del nodo actual, hemos encontrado la palabra
        if (palabra.equals(raiz.palabra)) {
            return true;
        }

        // Si la palabra es menor que la palabra del nodo actual, buscar en la subárbol izquierdo
        if (palabra.compareTo(raiz.palabra) < 0) {
            return buscarRecursivo(raiz.izquierda, palabra);
        }

        // Si la palabra es mayor que la palabra del nodo actual, buscar en la subárbol derecho
        return buscarRecursivo(raiz.derecha, palabra);
    }

    // Función para imprimir el árbol en orden ascendente (inorder traversal)
    public void imprimirOrdenado() {
        imprimirOrdenadoRecursivo(raiz);
    }

    // Función recursiva para imprimir las palabras en orden ascendente
    private void imprimirOrdenadoRecursivo(Nodo raiz) {
        if (raiz != null) {
            imprimirOrdenadoRecursivo(raiz.izquierda);
            System.out.println(raiz.palabra);
            imprimirOrdenadoRecursivo(raiz.derecha);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Diccionario diccionario = new Diccionario();

        // Agregar palabras al diccionario
        diccionario.agregar("Hola");
        diccionario.agregar("Clases");
        diccionario.agregar("Arbol");
        diccionario.agregar("Ventaja");
        diccionario.agregar("Carro");
        diccionario.agregar("Nudo");
        diccionario.agregar("Orden");
        diccionario.agregar("Blusa");
        diccionario.agregar("Sociedad");
        diccionario.agregar("Modelo");
        diccionario.agregar("Atributos");
        diccionario.agregar("Datos");
        diccionario.agregar("Terreno");
        diccionario.agregar("Leal");
        diccionario.agregar("Palneador");
        diccionario.agregar("Lanza");
        

        // Imprimir las palabras en orden ascendente
        System.out.println("Palabras:");
        diccionario.imprimirOrdenado();

        // Buscar palabras en el diccionario
        System.out.println("\nBuscar 'Datos': " + diccionario.buscar("Datos"));
        System.out.println("Buscar 'Hoja': " + diccionario.buscar("Hoja"));
    }
}
