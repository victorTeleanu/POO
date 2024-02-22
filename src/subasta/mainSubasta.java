package subasta;

public class mainSubasta {
    public static void main(String[] args) {
        Subasta sub1 = new Subasta("Subasta1", "12/02/2024");
            Lote lote1 = new Lote("Lote1", sub1);
            sub1.addLote(lote1);
                Articulo art1 = new Articulo("Lapiz", 1.0, lote1);
                lote1.addArticulo(art1);
                Articulo art2 = new Articulo("Goma", 1.5, lote1);
                lote1.addArticulo(art2);
            Lote lote2 = new Lote("Lote2", sub1);
            sub1.addLote(lote2);
                Articulo art3 = new Articulo("Tablet", 499.99, lote2);
                lote2.addArticulo(art3);
                Articulo art4 = new Articulo("PC", 799.99, lote2);
                lote2.addArticulo(art4);
                Articulo art5 = new Articulo("Movil", 1099.99, lote2);
                lote2.addArticulo(art5);

        System.out.println(sub1);
        for (Lote lote : sub1.getLotes()) {
            System.out.println("\t" + lote);
            for (Articulo articulo : lote.getArticulos()) {
                System.out.println("\t\t" + articulo);
            }
        }

        Pujador pedro = new Pujador("Pedro");
        Pujador juan = new Pujador("Juan");
        Pujador marcos = new Pujador("Marcos");

        Puja puja1 = new Puja(pedro, lote1, 5);
        lote1.addPuja(puja1);
        Puja puja2 = new Puja(juan, lote1, 6);

        Puja puja3 = new Puja(pedro, lote2, 2500);
        lote2.addPuja(puja3);
        Puja puja4 = new Puja(marcos, lote2, 3000);
        lote2.addPuja(puja4);

        System.out.println(sub1);
        for (Lote lote : sub1.getLotes()) {
            System.out.println(lote);
            for (Articulo articulo : lote.getArticulos()) {
                System.out.println("\t" + articulo);
                for (Puja puja : lote.getPujas()) {
                    System.out.println("\t\t" + puja);
                }
            }
        }
    }
}
