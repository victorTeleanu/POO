package deportes;

public class Deportes {
    private String nombre;
    private String tipoDeporte;

    public Deportes(String nombre, String tipoDeporte) {
        this.nombre = nombre;
        this.tipoDeporte = tipoDeporte;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoDeporte() {
        return tipoDeporte;
    }

    public void setTipoDeporte(String tipoDeporte) {
        this.tipoDeporte = tipoDeporte;
    }

    @Override
    public String toString() {
        return this.nombre + ": " + this.tipoDeporte;
    }
}
