package universidad;

import java.util.HashSet;
import java.util.Set;

public class AreaConocimiento {

    private int nAreaCon;
    private String nombre;
    private Set<Departamento> departamentos;

    public AreaConocimiento(int nAreaCon, String nombre) {
        this.nAreaCon = nAreaCon;
        this.nombre = nombre;
        this.departamentos = new HashSet<>();
    }
    public int getnAreaCon() {
        return nAreaCon;
    }

    public void setnAreaCon(int nAreaCon) {
        this.nAreaCon = nAreaCon;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Set<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

    public void addDepartamento(Departamento departamentos){
        this.departamentos.add(departamentos);
    }

    @Override
    public String toString() {
        return this.nAreaCon + " - " + this.nombre ;
    }
}
