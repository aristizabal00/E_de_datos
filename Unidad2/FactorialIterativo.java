public class FactorialIterativo {
    public static void main(String[] args) {
        int numero = 9; 
        int resultado = calcularFactorial(numero); 
        System.out.println("El factorial de " + numero + " es: " + resultado);
    }

    
    static int calcularFactorial(int n) {
        int factorial = 1; 

       
        for (int i = 1; i <= n; i++) {
            factorial *= i; 
        }

        return factorial; 
    }
}

