package proyectoTrabajadores;

public abstract class Operario extends Empleado{
    public Operario(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return "Operario: " + super.getNombre();
    }
}
