package banco;

import java.util.HashSet;
import java.util.Set;

public class CuentaCorriente {
    private String n_cc;
    private Set<Domiciliacion> domiciliaciones;
    private Set<Cliente> cliente;


    private Sucursal sucursal;

    public CuentaCorriente(String n_cc, Set<Domiciliacion> domiciliaciones, Sucursal sucursal) {
        this.n_cc = n_cc;
        this.domiciliaciones = new HashSet<>();
        this.sucursal = sucursal;
        this.cliente = new HashSet<>();
    }

    public void addDomiciliacion(Domiciliacion domiciliacion) {
        this.domiciliaciones.add(domiciliacion);
    }

    public String getN_cc() {
        return n_cc;
    }

    public void setN_cc(String n_cc) {
        this.n_cc = n_cc;
    }

    public Set<Domiciliacion> getDomiciliaciones() {
        return domiciliaciones;
    }

    public void setDomiciliaciones(Set<Domiciliacion> domiciliaciones) {
        this.domiciliaciones = domiciliaciones;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }
}
