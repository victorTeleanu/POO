import java.util.ArrayList;
import java.util.List;

public class MainLibro {
    public static void main(String[] args) {
        Autor a = new Autor("Kerstin Gier", "08/10/66");
        Tema t = new Tema("Juvenil");
        Tema f = new Tema("Fantasía");
        List<Tema> l = new ArrayList<>();
        l.add(t);
        l.add(f);
        Libro libro = new Libro("Lo que esconde la noche", a, 200, l);

        System.out.println(libro);
    }
}
