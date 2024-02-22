package biblioteca;

import java.util.Set;

public class Ejemplar {


    private int n_reg;
    private String nombre;
    private Libro libro;
    private Lector lector;
    private Prestamo prestamo;

    public Ejemplar(int n_reg, String nombre, Libro libro, Lector lector, Prestamo prestamo) {
        this.n_reg = n_reg;
        this.nombre = nombre;
        this.libro = libro;
        this.lector = lector;
        this.prestamo = prestamo;
    }
    public Ejemplar(int n_reg, String nombre) {
        this.n_reg = n_reg;
        this.nombre = nombre;
    }
    public int getN_reg() {
        return n_reg;
    }

    public void setN_reg(int n_reg) {
        this.n_reg = n_reg;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }
    public Lector getLector() {
        return lector;
    }

    public void setLector(Lector lector) {
        this.lector = lector;
    }

    public Prestamo getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

    @Override
    public String toString() {
        return this.n_reg + " " + this.nombre;
    }
}
