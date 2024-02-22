package reinoAnimal;

import universidad.Catedra;

public class mainReinoAnimal {
    public static void main(String[] args) {
        Pinguino pinguino = new Pinguino("Pinguino");
        System.out.println(pinguino);
        pinguino.cazar();
        pinguino.comunicarse();
        pinguino.respirar();
        System.out.println("-------------");
        Iguana iguana = new Iguana("Iguana");
        System.out.println(iguana);
        iguana.comunicarse();
        iguana.respirar();
        System.out.println("-------------");
        Cocodrilo cocodrilo = new Cocodrilo("Cocodrilo");
        System.out.println(cocodrilo);
        cocodrilo.estarBajoAgua();
        cocodrilo.respirar();
    }
}
