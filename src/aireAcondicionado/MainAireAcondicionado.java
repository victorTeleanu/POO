package aireAcondicionado;

import aireAcondicionado.AireAcondicionado;

public class MainAireAcondicionado {
    public static void main(String[] args) {
        AireAcondicionado ac1 = new AireAcondicionado("Fujistsu", 30, 15, 23);
        AireAcondicionado ac2 = new AireAcondicionado("Hisense", 35, 10, 21);
        System.out.println(ac1);
        System.out.println(ac2);
        ac1.decrement();
        ac1.decrement();
        ac2.increment();
        ac2.increment();
        ac2.increment();
        System.out.println(ac1);
        System.out.println(ac2);
    }
}
