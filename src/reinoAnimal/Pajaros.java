package reinoAnimal;

public abstract class Pajaros extends Animal {
    public Pajaros(String nombre) {
        super(nombre);
    }
    public void nacer() {
        System.out.println("Cuando soy pequeño nazco de un huevo");
    }
    public void respirar() {
        System.out.println("Respiro aire por los pulmones");
    }
}
