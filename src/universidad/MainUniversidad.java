package universidad;

public class MainUniversidad {
    public static void main(String[] args) {
        Facultad fac = new Facultad(1, "Facultad");
            Catedra cat = new Catedra(1, "Catedra");
                    fac.addCatedra(cat);
        AreaConocimiento a1 = new AreaConocimiento(1, "Area1");
            Departamento ciencias = new Departamento(1, "Ciencias");
                Profesor pepe = new Profesor("60896412W", "pepe");
                    ciencias.addProfesor(pepe);
                    cat.addProfesor(pepe);
                Profesor maria = new Profesor("10965321P" , "maria");
                    ciencias.addProfesor(maria);
                    a1.addDepartamento(ciencias);

        System.out.println(fac);
        for (Catedra catedra : fac.getCatedras()) {
            System.out.println("\t" + catedra);
        }
        System.out.println(a1);
        for (Departamento departamento : a1.getDepartamentos()) {
            System.out.println("\t" + departamento);
            for (Profesor profesor : departamento.getProfesores()) {
                System.out.println("\t\t" + profesor);
            }
        }
    }
}
