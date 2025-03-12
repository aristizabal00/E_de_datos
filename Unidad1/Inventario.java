import java.util.ArrayList;


class Producto {
    private String nombre;
    private int cantidad;

    public Producto(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void vender() {
        if (cantidad > 0) {
            cantidad--;
        }
    }

    @Override
    public String toString() {
        return nombre + " (Cantidad: " + cantidad + ")";
    }
}


public class Inventario {
    public static void main(String[] args) {
        
        ArrayList<Producto> inventario = new ArrayList<>();


        inventario.add(new Producto("Nuevo producto 1", 5));
        inventario.add(new Producto("Nuevo producto 2", 0));  
        inventario.add(new Producto("Nuevo producto 3", 3));

 
        System.out.println("Inventario actual:");
        mostrarInventario(inventario);


        eliminarProducto(inventario, "Nuevo producto 2"); 
        eliminarProducto(inventario, "Nuevo producto 1"); 


        System.out.println("\nInventario después de eliminar productos:");
        mostrarInventario(inventario);


        inventario.add(new Producto("Nuevo producto 4", 2));

        System.out.println("\nInventario final:");
        mostrarInventario(inventario);
    }


    public static void mostrarInventario(ArrayList<Producto> inventario) {
        if (inventario.isEmpty()) {
            System.out.println("El inventario está vacío.");
            return;
        }

        for (Producto producto : inventario) {
            System.out.println(producto);
        }
    }


    public static void eliminarProducto(ArrayList<Producto> inventario, String nombreProducto) {
        boolean encontrado = false;
        for (int i = 0; i < inventario.size(); i++) {
            if (inventario.get(i).getNombre().equals(nombreProducto)) {
                inventario.remove(i); 
                System.out.println("Producto eliminado: " + nombreProducto);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Producto no encontrado: " + nombreProducto);
        }
    }
}
