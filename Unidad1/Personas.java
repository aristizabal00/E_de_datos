import java.util.Arrays;

public class Persona implements Comparable<Persona> {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public int compareTo(Persona otraPersona) {

        int nombreComparison = this.nombre.compareToIgnoreCase(otraPersona.getNombre());
        

        if (nombreComparison == 0) {
            return Integer.compare(this.edad, otraPersona.getEdad());
        }
        return nombreComparison;
    }

    @Override
    public String toString() {
        return "Persona(nombre=" + nombre + ", edad=" + edad + ")";
    }

    public static void main(String[] args) {
        Persona[] personas = {
            new Persona("Carlos", 25),
            new Persona("Luia", 30),
            new Persona("ANA", 22),
            new Persona("Julia", 28),
            new Persona("Pedro", 35),
            new Persona("Marta", 27),
            new Persona("Sofia", 24),
            new Persona("David", 40),
            new Persona("Lucía", 29),
            new Persona("David", 26)
        };

        Arrays.sort(personas);


        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }
}
