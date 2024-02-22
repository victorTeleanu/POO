package banco;

public class Prestamo {

    private int nPres;
    private int cantidad;
    private Sucursal sucursal;
    private Cliente cliente;

    public Prestamo(int nPres, int cantidad, Sucursal sucursal, Cliente cliente) {
        this.nPres = nPres;
        this.cantidad = cantidad;
        this.sucursal = sucursal;
        this.cliente = cliente;
    }

    public int getnPres() {
        return nPres;
    }

    public void setnPres(int nPres) {
        this.nPres = nPres;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return this.nPres + " - " + this.cantidad;
    }
}
