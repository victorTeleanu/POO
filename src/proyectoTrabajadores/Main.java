package proyectoTrabajadores;

public class Main {
    public static void main(String[] args) {
        Directivo d = new Directivo("Juanjo");
        Tecnico t = new Tecnico("Bárbara");
        Oficial o = new Oficial("Marcos");

        System.out.println(d);
        System.out.println(t);
        System.out.println(o);
    }
}
