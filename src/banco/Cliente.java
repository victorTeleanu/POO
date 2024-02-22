package banco;

import java.util.HashSet;
import java.util.Set;

public class Cliente {

    private String nombre;
    private String dni;
    private Set<Prestamo> prestamos;
    private Set<CuentaCorriente> cuentaCorriente;

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.prestamos = new HashSet<>();
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    public Set<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(Set<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public void addPrestamo(Prestamo prestamos) {
        this.prestamos.add(prestamos);
    }

    @Override
    public String toString() {
        return this.dni + " - " + this.nombre;
    }


}
