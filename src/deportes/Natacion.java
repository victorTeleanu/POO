package deportes;

public class Natacion extends Deportes implements Individual, EnAgua{

    private String marcaGafas;

    public Natacion(String nombre, String tipoDeporte, String marcaGafas) {
        super(nombre, tipoDeporte);
        this.marcaGafas = marcaGafas;
    }

    public String getMarcaGafas() {
        return marcaGafas;
    }

    public void setMarcaGafas(String marcaGafas) {
        this.marcaGafas = marcaGafas;
    }

    @Override
    public String banyador() {
        return "Marca bañador: Arena";
    }

    @Override
    public String IQ() {
        return "95 IQ";
    }

    @Override
    public String toString() {
        return super.toString() + " / Marca de gafas: " +  this.marcaGafas;
    }
}
