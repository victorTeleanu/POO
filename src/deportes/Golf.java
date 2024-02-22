package deportes;

public class Golf extends Deportes implements Individual, EnSeco{
    private String tiposPalos;

    public Golf(String nombre, String tipoDeporte, String tiposPalos) {
        super(nombre, tipoDeporte);
        this.tiposPalos = tiposPalos;
    }

    public String getTiposPalos() {
        return tiposPalos;
    }

    public void setTiposPalos(String tiposPalos) {
        this.tiposPalos = tiposPalos;
    }

    @Override
    public String ropa() {
        return "Equipación: Camiseta, pantalón, zapatillas y gorra";
    }

    @Override
    public String IQ() {
        return "100 IQ";
    }

    @Override
    public String toString() {
        return super.toString() + " / Palos: " +  this.tiposPalos;
    }
}
