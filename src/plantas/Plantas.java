package plantas;

public class Plantas {
    private String familia;
    private String nombre;

    public Plantas(String familia, String nombre) {
        this.familia = familia;
        this.nombre = nombre;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return this.nombre + " es de la familia " + this.familia;
    }
}
