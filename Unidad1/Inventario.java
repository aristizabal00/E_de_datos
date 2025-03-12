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


class Nodo {
    Producto producto;
    Nodo siguiente;

    public Nodo(Producto producto) {
        this.producto = producto;
        this.siguiente = null;
    }
}


class ListaEnlazada {
    private Nodo cabeza;

    public ListaEnlazada() {
        this.cabeza = null;
    }


    public void agregarProducto(Producto producto) {
        Nodo nuevoNodo = new Nodo(producto);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
        }
    }

 
    public void eliminarProducto(String nombreProducto) {
        if (cabeza == null) {
            System.out.println("Lista vacía, no se puede eliminar.");
            return;
        }

        if (cabeza.producto.getNombre().equals(nombreProducto)) {
            cabeza = cabeza.siguiente;  
            System.out.println("Producto eliminado: " + nombreProducto);
            return;
        }

        Nodo actual = cabeza;
        while (actual.siguiente != null && !actual.siguiente.producto.getNombre().equals(nombreProducto)) {
            actual = actual.siguiente;
        }

        if (actual.siguiente != null) {
            actual.siguiente = actual.siguiente.siguiente;
            System.out.println("Producto eliminado: " + nombreProducto);
        } else {
            System.out.println("Producto no encontrado: " + nombreProducto);
        }
    }

 
    public void mostrarInventario() {
        if (cabeza == null) {
            System.out.println("El inventario está vacío.");
            return;
        }

        Nodo actual = cabeza;
        while (actual != null) {
            System.out.println(actual.producto);
            actual = actual.siguiente;
        }
    }
}


public class Inventario {
    public static void main(String[] args) {

        ListaEnlazada inventario = new ListaEnlazada();


        inventario.agregarProducto(new Producto("Nuevo producto 1", 5));
        inventario.agregarProducto(new Producto("Nuevo producto 2", 0));
        inventario.agregarProducto(new Producto("Nuevo producto 3", 3));

 
        System.out.println("Inventario actual:");
        inventario.mostrarInventario();


        inventario.eliminarProducto("Nuevo producto 2"); 
        inventario.eliminarProducto("Nuevo producto 1"); 

 
        System.out.println("\nInventario después de eliminar productos:");
        inventario.mostrarInventario();

        inventario.agregarProducto(new Producto("Nuevo producto 4", 2));

        System.out.println("\nInventario final:");
        inventario.mostrarInventario();
    }
}
