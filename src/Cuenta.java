public class Cuenta {
    private String titular;
    private double cantidad;
    private double ingresar;
    private double retirar;

    public Cuenta(String titular) {
        this.titular = titular;
    }

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad() {
        this.cantidad = cantidad;
    }

    public double getIngresar() {
        return ingresar;
    }

    public void setIngresar(double ingresar) {
        this.ingresar = ingresar;
    }

    public double getRetirar() {
        return retirar;
    }

    public void setRetirar(double retirar) {
        this.retirar = retirar;
    }

    @Override
    public String toString() {
        return this.titular + " -> " + this.cantidad + "€";
    }

    public void ingresar(double ingresar) {
       if (ingresar > 0) {
           this.cantidad = getCantidad() + ingresar;
       }
    }

    public void retirar(double retirar) {
        if (retirar < getCantidad()) {
            this.cantidad = getCantidad() - retirar;
        } else {
            this.cantidad = 0;
        }
    }
}
