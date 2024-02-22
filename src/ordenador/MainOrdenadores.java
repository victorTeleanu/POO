package ordenador;

import java.util.ArrayList;

public class MainOrdenadores {
    public static void main(String[] args) {
        Ordenador pc1 = new Ordenador("11025", 1200);
        Ordenador pc2 = new Ordenador("11054", 800);
        ArrayList<Ordenador> lista = new ArrayList<>();
        lista.add(pc1);
        lista.add(pc2);
        lista.forEach(System.out::println);
    }
}
