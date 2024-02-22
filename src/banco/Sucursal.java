package banco;

import java.util.HashSet;
import java.util.Set;

public class Sucursal {
    private int nSucursal;
    private String direccion;
    private Banco banco;
    private Set<Prestamo> prestamos;

    private Set<CuentaCorriente> cuentaCorrientes;

    public Sucursal(int nSucursal, String direccion, Banco banco) {
        this.nSucursal = nSucursal;
        this.direccion = direccion;
        this.banco = banco;
        this.prestamos = new HashSet<>();
        this.cuentaCorrientes = new HashSet<>();
    }

    public int getnSucursal() {
        return nSucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Banco getBanco() {
        return banco;
    }
    public Set<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(Set<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public void addPrestamos(Prestamo prestamo) {
        this.prestamos.add(prestamo);
    }
    public Set<CuentaCorriente> getCuentaCorrientes() {
        return cuentaCorrientes;
    }

    public void setCuentaCorrientes(Set<CuentaCorriente> cuentaCorrientes) {
        this.cuentaCorrientes = cuentaCorrientes;
    }

    public void addCuentaCorriente(CuentaCorriente cuentaCorriente) {
        this.cuentaCorrientes.add(cuentaCorriente);
    }

    @Override
    public String toString() {
        return this.nSucursal + " - " + this.direccion;
    }
}
