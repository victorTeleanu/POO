package banco;

import java.util.Set;

public class Banco {


    private String nombre;
    private int nEnt;
    private Set<Sucursal> sucursales;

    public Banco(String nombre, int n_ent, Set<Sucursal> sucursales) {
        this.nombre = nombre;
        this.nEnt = n_ent;
        this.sucursales = sucursales;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getnEnt() {
        return nEnt;
    }

    public void setnEnt(int nEnt) {
        this.nEnt = nEnt;
    }

    public Set<Sucursal> getSucursales() {
        return sucursales;
    }

    public void setSucursales(Set<Sucursal> sucursales) {
        this.sucursales = sucursales;
    }
    public void addSucursal(Sucursal sucursal) {
        this.sucursales.add(sucursal);
    }
    @Override
    public String toString() {
        return this.nombre;
    }
}
