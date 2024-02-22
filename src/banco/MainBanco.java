package banco;

import java.util.HashSet;

public class MainBanco {
    public static void main(String[] args) {
        Banco bbva = new Banco("BBVA", 100, new HashSet<>());
            Sucursal sMayor = new Sucursal(11, "C/ Mayor", bbva);
                Cliente maria = new Cliente("María", "36583473H");
                Prestamo p1 = new Prestamo(99, 1000, sMayor, maria);
                    sMayor.addPrestamos(p1);
                Prestamo p2 = new Prestamo(100, 5000, sMayor, maria);
                    sMayor.addPrestamos(p2);
                    maria.addPrestamo(p1);
                    maria.addPrestamo(p2);
            Sucursal sEnmedio = new Sucursal(12, "C/ Enmedio", bbva);
                Cliente juan = new Cliente("Juan", "Z4922296W");
                Prestamo p3 = new Prestamo(99, 200, sEnmedio, juan);
                    sEnmedio.addPrestamos(p3);
                    juan.addPrestamo(p3);
        bbva.addSucursal(sMayor);
        bbva.addSucursal(sEnmedio);

        System.out.println(bbva);
        for (Sucursal s : bbva.getSucursales()) {
            System.out.println("\t" + s);
            for (Prestamo p : s.getPrestamos()) {
                System.out.println("\t\t" + p);
                System.out.println("\t\t" + p.getCliente());
            }
        }
        //Quiero saber el nombre del banco de la sucursal sMayor
        System.out.println(sMayor.getBanco().getNombre());
        System.out.println(p3.getSucursal().getBanco().getNombre());
    }
}
