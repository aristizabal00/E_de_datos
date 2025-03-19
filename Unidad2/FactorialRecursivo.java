public class FactorialRecursivo {
    public static void main(String[] args) {
        int numero = 5; 
        int resultado = calcularFactorial(numero);
        System.out.println("El factorial de " + numero + " es: " + resultado);
    }


    static int calcularFactorial(int n) {
     
        if (n == 0 || n == 1) {
            return 1;
        }
        
      
        return n * calcularFactorial(n - 1);
    }
}
