import java.util.*;

public class DiccionarioOrdenado {
    public static void main(String[] args) {
 
        Set<String> diccionario = new TreeSet<>();

    
        diccionario.add("Hola");
        diccionario.add("Clases");
        diccionario.add("Arbol");
        diccionario.add("Ventaja");
        diccionario.add("Carro");
        diccionario.add("Nudo");
        diccionario.add("Orden");
        diccionario.add("Blusa");
        diccionario.add("Sociedad");
        diccionario.add("Modelo");
        diccionario.add("Atributos");
        diccionario.add("Datos");
        diccionario.add("Terreno");
        diccionario.add("Leal");
        diccionario.add("Palneador");
        diccionario.add("Lanza");
        

        System.out.println("Palabras del diccionario en orden ascendente:");
        for (String palabra : diccionario) {
            System.out.println(palabra);
        }
    }
}
