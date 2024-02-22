package proyectoTrabajadores;

public class Tecnico extends Operario {
    public Tecnico(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return "Técnico: " + this.getNombre();
    }
}
