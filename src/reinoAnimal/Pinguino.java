package reinoAnimal;

public class Pinguino extends Pajaros {

    public Pinguino(String nombre) {
        super(nombre);
    }

    public void comunicarse() {
        System.out.println("Yo me comunico con graznidos");
    }

    public void cazar() {
        System.out.println("Cazo mi propia comida");
    }
}
