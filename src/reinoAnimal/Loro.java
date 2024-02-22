package reinoAnimal;

public class Loro extends Pajaros {

    public Loro(String nombre) {
        super(nombre);
    }

    public void comunicarse() {
        System.out.println("Me comunico con el lenguaje corporal");
    }

    public void imitar() {
        System.out.println("Imito sonidos como tú");
    }
}
