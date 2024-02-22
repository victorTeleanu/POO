package cuentaBanco;

public class MainCuenta {
    public static void main(String[] args) {
        Cuenta Pedro = new Cuenta("Pedro");
        Cuenta Marta = new Cuenta("Marta", 100);
        System.out.println(Pedro);
        System.out.println(Marta);
        Pedro.ingresar(200);
        Marta.retirar(300);
        System.out.println(Pedro);
        System.out.println(Marta);
    }
}
