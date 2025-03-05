import java.util.Stack;
import java.util.Queue;
import java.util.Scanner;

public class PilasYColas
 {

    public static void main (String[] args)
    {
        Scanner lector = new Scanner(System.in);
        Stack<String> pilaTexto = new Stack<String> ();
        String textoActual = " ", nuevoTexto;
        int opcion;

        //ciclo infinito del mani-editor:
        while(true)
        {
            System.out.println("Seleccione una opcion: (1) Ingresa (2) Deshacer (3) Salir");
            System.out.println("(4) Imprimir texto completo");
            System.out.println("(5) Imprimir desde la pila");
            opcion = lector.nextInt();

            //leer texto desde el editor:
            lector.nextInt();
            switch(opcion)
            {
                //agregar texto:
                case 1:
                     System.out.println("Ecribe tu texto:");
                     nuevoTexto = lector.nextLine();
                     /*AGREGAR ELEMENTO A LA PILA */
                     pilaTexto.push(nuevoTexto);
                     textoActual += nuevoTexto;
                     break;
                /*eliminar twxto de la pila */
                case 2:
                    if(!pilaTexto.isEmpty())
                    {
                        /*sacar texto de la pila */
                        textoActual = pilaTexto.pop();
                    }
                    else
                    {
                        System.out.println("No hay texto para eliminar");
                        break;
                    }
                case 3:
                    System.out.println("Cerrado...");
                    lector.close();
                    return;
                
                case 4: 
                    System.out.println("Texto actual en el editor:"+textoActual);
                    break;
                    
                case 5:
                     /*sacar elemtos de la pila con pop e irlos imprimiendo en panatalla: */
                     /*¿como hacer para que imprima el texto en orden? */
                     System.out.println("Texto desde la pila (de abajo hacia arriba):");

                     Stack<String> pilaTemporal = new Stack<String>();

                     while (!pilaTexto.isEmpty()) {
                        pilaTemporal.push(pilaTexto.pop());
                    }
                    while (!pilaTemporal.isEmpty()) {
                        System.out.println(pilaTemporal.pop());
                    }
                    break;

                
                default:
                    System.out.println("Opcion no valida...");
                    }
            }
        }
    }
    
