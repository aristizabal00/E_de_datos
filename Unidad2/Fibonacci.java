public class Fibonacci {
    public static void main(String[] args) {
        int n = 50;  
        System.out.println("Secuencia de Fibonacci con enfoque recursivo:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    static int fibonacci(int n) {
       
        if (n == 0) return 0;
        if (n == 1) return 1;

      
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
