import java.util.Arrays;
import java.util.Comparator;

public class ListaProductos {

    public static class Producto {
        private String codigo;
        private String nombre;
        private double precio;
        private int cantidad;


        public Producto(String codigo, String nombre, double precio, int cantidad) {
            this.codigo = codigo;
            this.nombre = nombre;
            this.precio = precio;
            this.cantidad = cantidad;
        }


        public String getCodigo() {
            return codigo;
        }

        public void setCodigo(String codigo) {
            this.codigo = codigo;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public double getPrecio() {
            return precio;
        }

        public void setPrecio(double precio) {
            this.precio = precio;
        }

        public int getCantidad() {
            return cantidad;
        }

        public void setCantidad(int cantidad) {
            this.cantidad = cantidad;
        }

        @Override
        public String toString() {
            return "Producto{" +
                    "codigo='" + codigo + '\'' +
                    ", nombre='" + nombre + '\'' +
                    ", precio=" + precio +
                    ", cantidad=" + cantidad +
                    '}';
        }
    }

    private static Producto[] productos = new Producto[10];  
    private static int contador = 0; 

    public static void main(String[] args) {

        Producto p1 = new Producto("P001", "Cafetera", 250000.00, 50);
        Producto p2 = new Producto("P002", "Silla de oficina", 150000.00, 30);
        Producto p3 = new Producto("P003", "Auriculares", 90000.00, 75);
        Producto p4 = new Producto("P004", "Televisor 4K", 3900000.00, 20);
        Producto p5 = new Producto("P005", "Reloj inteligente", 500000.00, 40);


        agregarProducto(p1);
        agregarProducto(p2);
        agregarProducto(p3);
        agregarProducto(p4);
        agregarProducto(p5);


        System.out.println("Productos antes de ordenar:");
        imprimirProductos();


        ordenarPorPrecio();
        System.out.println("\nProductos ordenados por precio:");
        imprimirProductos();


        ordenarPorCantidad();
        System.out.println("\nProductos ordenados por cantidad:");
        imprimirProductos();


        Producto productoBuscado = buscarPorCodigo("P003");
        if (productoBuscado != null) {
            System.out.println("\nProducto encontrado: " + productoBuscado);
        } else {
            System.out.println("\nProducto no encontrado.");
        }
    }


    public static void agregarProducto(Producto producto) {
        if (contador < productos.length) {
            productos[contador++] = producto;
        } else {
            System.out.println("Arreglo lleno, no se puede agregar más productos.");
        }
    }


    public static Producto buscarPorCodigo(String codigo) {
        for (int i = 0; i < contador; i++) {
            if (productos[i].getCodigo().equals(codigo)) {
                return productos[i];
            }
        }
        return null;
    }


    public static void ordenarPorPrecio() {

        Arrays.sort(productos, 0, contador, Comparator.comparingDouble(Producto::getPrecio));
    }


    public static void ordenarPorCantidad() {

        Arrays.sort(productos, 0, contador, Comparator.comparingInt(Producto::getCantidad));
    }


    public static void imprimirProductos() {
        for (int i = 0; i < contador; i++) {
            System.out.println(productos[i]);
        }
    }
}
