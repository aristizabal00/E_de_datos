public class RecursionVocales {
    public static void main(String[] args) {
        
        String texto = "Este es un ejemplo de texto con algunas vocales.";
        fun_recursiva(0, texto, 0);  
    }

    static void fun_recursiva(int i, String texto, int contadorVocales) {

        if (i == texto.length()) {
            System.out.println("Total de vocales: " + contadorVocales);
            return;
        }

        
        char caracter = texto.charAt(i);

        
        if (esVocal(caracter)) {
            contadorVocales++; 
        }

        
        System.out.println("Llamado: " + i + " - Carácter: " + caracter + " - Contador de vocales: " + contadorVocales);

        fun_recursiva(i + 1, texto, contadorVocales);
    }

    static boolean esVocal(char c) {
        c = Character.toLowerCase(c); 
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
