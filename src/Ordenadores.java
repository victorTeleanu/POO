public class Ordenadores {
    private String modelo;
    private int precio;

    public Ordenadores(String modelo, int precio) {
        this.modelo = modelo;
        this.precio = precio;
    }


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return this.modelo + " -> " + this.precio + "€";
    }
}
