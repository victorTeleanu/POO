package universidad;

import java.util.HashSet;
import java.util.Set;

public class Catedra {

    private int nCat;
    private String nombre;
    private Facultad facultat;
    private Departamento departamento;
    private Set<Profesor> profesores;

    public Catedra(int nCat, String nombre, Facultad facultat, Departamento departamento) {
        this.nCat = nCat;
        this.nombre = nombre;
        this.facultat = facultat;
        this.departamento = departamento;
        this.profesores = new HashSet<>();
    }

    public Catedra(int nCat, String nombre) {
        this.nCat = nCat;
        this.nombre = nombre;
        this.profesores = new HashSet<>();
    }

    public int getnCat() {
        return nCat;
    }

    public void setnCat(int nCat) {
        this.nCat = nCat;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Facultad getFacultat() {
        return facultat;
    }

    public void setFacultat(Facultad facultat) {
        this.facultat = facultat;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Set<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(Set<Profesor> profesores) {
        this.profesores = profesores;
    }

    public void addProfesor(Profesor profesor) {
        this.profesores.add(profesor);
    }

    @Override
    public String toString() {
        return this.nCat + " - " + this.nombre;
    }
}
