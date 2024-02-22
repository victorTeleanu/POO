package reinoAnimal;

public class Iguana extends Reptiles{
    public Iguana(String nombre) {
        super(nombre);
    }
    public void comunicarse() {
        System.out.println("Yo me comunico inclinando la cabeza");
    }

    public void camuflarse() {
        System.out.println("Puedo camuflarme cambiando de color");
    }

}
