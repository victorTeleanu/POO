package deportes;

import java.util.HashSet;
import java.util.Set;

public class MainDeportes {
    public static void main(String[] args) {
        Set<Deportes> deportes = new HashSet<>();

        Waterpolo w1 = new Waterpolo("Waterpolo","En mojado y equipo","gorro azul");
        deportes.add(w1);

        Futbol f1 = new Futbol("Futbol", "En seco y equipo", "Real Madrid");
        deportes.add(f1);

        Natacion n1 = new Natacion("Natación", "En agua e individual", "Speedo");
        deportes.add(n1);

        Golf g1 = new Golf("Golf", "En seco e individual", "Driver, putter y wedges");
        deportes.add(g1);

        for (Deportes d : deportes) {
            System.out.println(d);
        }

        System.out.println("---------------------");
        System.out.println("Waterpolo");
        System.out.println(w1.banyador());
        System.out.println(w1.personasPorEquipo());
        System.out.println("---------------------");
        System.out.println("Futbol");
        System.out.println(f1.ropa());
        System.out.println(f1.personasPorEquipo());
        System.out.println("---------------------");
        System.out.println("Natación");
        System.out.println(n1.banyador());
        System.out.println(n1.IQ());
        System.out.println("---------------------");
        System.out.println("Golf");
        System.out.println(g1.ropa());
        System.out.println(g1.IQ());
    }
}
