package universidad;

import java.util.HashSet;
import java.util.Set;

public class Departamento {
    private int nDep;
    private String nombre;
    private AreaConocimiento areaConocimiento;
    private Set<Profesor> profesores;
    private Set<Catedra> catedras;

    public Departamento(int nDep, String nombre, AreaConocimiento areaConocimiento) {
        this.nDep = nDep;
        this.nombre = nombre;
        this.areaConocimiento = areaConocimiento;
        this.profesores = new HashSet<>();
        this.catedras = new HashSet<>();
    }

    Departamento(int nDep, String nombre) {
        this.nDep = nDep;
        this.nombre = nombre;
        this.profesores = new HashSet<>();
        this.catedras = new HashSet<>();
    }
    public int getnDep() {
        return nDep;
    }

    public void setnDep(int nDep) {
        this.nDep = nDep;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public AreaConocimiento getAreaConocimiento() {
        return areaConocimiento;
    }

    public void setAreaConocimiento(AreaConocimiento areaConocimiento) {
        this.areaConocimiento = areaConocimiento;
    }
    public Set<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(Set<Profesor> profesores) {
        this.profesores = profesores;
    }

    public Set<Catedra> getCatedras() {
        return catedras;
    }

    public void setCatedras(Set<Catedra> catedras) {
        this.catedras = catedras;
    }

    public void addProfesor(Profesor profesor) {
        this.profesores.add(profesor);
    }

    public void addCatedra(Catedra catedra) {
        this.catedras.add(catedra);
    }

    @Override
    public String toString() {
        return this.nDep + " - " + this.nombre;
    }
}
