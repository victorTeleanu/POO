package biblioteca;

import java.util.HashSet;
import java.util.Set;

public class Lector {

    private String dni;
    private String nombre;
    private Set<Prestamo> prestamos;

    public Lector(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        this.prestamos = new HashSet<>();
    }
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(Set<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public void addPrestamo(Prestamo prestamo) {
        this.prestamos.add(prestamo);
    }
    @Override
    public String toString() {
        return this.dni + " " + this.nombre;
    }
}
