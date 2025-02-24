class Producto implements Comparable<Producto> {
    double precio;
    String nombre;

    // Constructor
    public Producto(double precio, String nombre) {
        this.precio = precio;
        this.nombre = nombre;
    }

    // Implementación del método compareTo para ordenar por precio
    @Override
    public int compareTo(Producto otroProducto) {
        return Double.compare(this.precio, otroProducto.precio);
    }

    @Override
    public String toString() {
        return "Producto{" + "precio=" + precio + ", nombre='" + nombre + '\'' + '}';
    }
}

public class OrdenamientosProductos {

    public static void main(String[] args) {
        OrdenamientosProductos pruebaOrdenamiento = new OrdenamientosProductos();
        pruebaOrdenamiento.probarOrdenamientos();
    }

    public OrdenamientosProductos() {}

    public void probarOrdenamientos() {

        Producto producto1 = new Producto(129.99, "Cámara digital");
        Producto producto2 = new Producto(75.50, "Teclado mecánico");
        Producto producto3 = new Producto(299.99, "Monitor LED");
        Producto producto4 = new Producto(89.99, "Disco duro externo");
        Producto producto5 = new Producto(150.00, "Impresora");

        // Imprimir el resultado de la comparación usando compareTo
        if (producto1.compareTo(producto2) > 0)
            System.out.println("El producto 1 es más caro que el producto 2 (por precio)");
        else if (producto1.compareTo(producto2) < 0)
            System.out.println("El producto 1 es más barato que el producto 2 (por precio)");
        else
            System.out.println("El producto 1 tiene el mismo precio que el producto 2");


        Producto[] productos = {producto1, producto2, producto3, producto4, producto5};

        // Ordenar usando el método burbuja
        System.out.println("\nOrdenando usando el método de burbuja...");
        burbuja(productos);
        imprimirProductos(productos);

        // Ordenar usando el método de insertion sort
        System.out.println("\nOrdenando usando el método de insertion sort...");
        insertionSort(productos);
        imprimirProductos(productos);
    }

    // Método de ordenamiento por burbuja
    public void burbuja(Producto[] productos) {
        for (int i = 0; i < productos.length - 1; i++) {
            for (int j = 0; j < productos.length - 1 - i; j++) {
                if (productos[j].compareTo(productos[j + 1]) > 0) {

                    Producto temp = productos[j];
                    productos[j] = productos[j + 1];
                    productos[j + 1] = temp;
                }
            }
        }
    }

    // Método de ordenamiento por insertion sort
    public void insertionSort(Producto[] productos) {
        for (int i = 1; i < productos.length; i++) {
            Producto key = productos[i];
            int j = i - 1;


            while (j >= 0 && productos[j].compareTo(key) > 0) {
                productos[j + 1] = productos[j];
                j = j - 1;
            }
            productos[j + 1] = key;
        }
    }


    public void imprimirProductos(Producto[] productos) {
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
}
