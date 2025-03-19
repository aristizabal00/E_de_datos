public class EjerciciosRecursivo {
     public static void main(String [] args) {
        fun_recursiva(0);
    
     }
     static void fun_recursiva(int i){
        System.out.println("llamado" +i);
        try{
            Thread.sleep(1000);

        }
        catch(InterruptedException exception){}
        fun_recursiva(i+1);
     }
}
