package deportes;

public class Futbol extends Deportes implements Equipo, EnSeco{
    private String equipo;

    public Futbol(String nombre, String tipoDeporte, String equipo) {
        super(nombre, tipoDeporte);
        this.equipo = equipo;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    @Override
    public String ropa() {
        return "Equipación: Camiseta, pantalón y zapatillas";
    }

    @Override
    public String personasPorEquipo() {
        return "11 jugadores por equipo";
    }
    @Override
    public String toString() {
        return super.toString() + " / Equipo: " + this.equipo;
    }
}
