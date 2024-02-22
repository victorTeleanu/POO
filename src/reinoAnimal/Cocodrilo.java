package reinoAnimal;

public class Cocodrilo extends Reptiles{

    public Cocodrilo(String nombre) {
        super(nombre);
    }
    public void comunicarse() {
        System.out.println("Yo me comunico mediando mordiscos");
    }

    public void estarBajoAgua() {
        System.out.println("Me gusta estar bajo el agua y sacar solo la cabeza");
    }
}
