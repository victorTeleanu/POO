package deportes;

public class Waterpolo extends Deportes implements Equipo, EnAgua{
    private String colorGorro;

    public Waterpolo(String nombre, String tipoDeporte, String colorGorro) {
        super(nombre, tipoDeporte);
        this.colorGorro = colorGorro;
    }

    public String getColorGorro() {
        return colorGorro;
    }

    public void setColorGorro(String colorGorro) {
        this.colorGorro = colorGorro;
    }

    @Override
    public String banyador() {
        return "Marca bañador: Turbo";
    }

    @Override
    public String personasPorEquipo() {
        return "7 jugadores por equipo";
    }

    @Override
    public String toString() {
        return super.toString() + " / Color gorro: " + this.colorGorro;
    }
}
