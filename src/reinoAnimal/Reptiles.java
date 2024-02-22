package reinoAnimal;

public class Reptiles extends Animal{
    public Reptiles(String nombre) {
        super(nombre);
    }
    public void respirar() {
        System.out.println("Respiro aire por los pulmones y branquias");
    }
}
