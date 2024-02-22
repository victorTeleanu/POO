package libro;

public class Autor {
    private String nombre;
    private String fechaNacimiento;

    public Autor(String nombre, String fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    @Override
    public String toString() {
        return this.nombre + " - " + this.fechaNacimiento;
    }
}
