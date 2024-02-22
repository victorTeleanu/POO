package universidad;

import java.util.HashSet;
import java.util.Set;

public class Profesor {

    private String dni;
    private String nombre;
    private Departamento departamento;
    private Set<Catedra> catedras;


    public Profesor(String dni, String nombre, Departamento departamento) {
        this.dni = dni;
        this.nombre = nombre;
        this.departamento = departamento;
        this.catedras = new HashSet<>();
    }
    Profesor(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        this.catedras = new HashSet<>();
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

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Set<Catedra> getCatedras() {
        return catedras;
    }

    public void setCatedras(Set<Catedra> catedras) {
        this.catedras = catedras;
    }

    public void addCatedra(Catedra catedra) {
        this.catedras.add(catedra);
    }

    @Override
    public String toString() {
        return this.dni + " - " + this.nombre;
    }
}
