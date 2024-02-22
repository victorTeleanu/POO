package maquinaExpendedora;

import java.lang.reflect.Array;

public class MaquinaExpendedora {
    private int importeTiquet;
    private int cajon;
    private int introducido;

    public MaquinaExpendedora(int importeTiquet, int introducido, int cajon) {
        this.importeTiquet = importeTiquet;
        this.introducido = introducido;
        this.cajon = cajon;
    }

    public int getImporteTiquet() {
        return importeTiquet;
    }

    public void setImporteTiquet(int importeTiquet) {
        this.importeTiquet = importeTiquet;
    }

    public int getIntroducido() {
        return introducido;
    }

    public void setIntroducido(int introducido) {
        this.introducido = introducido;
    }

    public int getCajon() {
        return cajon;
    }

    public void setCajon(int cajon) {
        this.cajon = cajon;
    }

    @Override
    public String toString() {
        return this.cajon + " ";
    }

    public void calculo(int introducido, int importeTiquet, int cajon) {
        int[] dinero = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        int devolver = 0;

        if (introducido >= importeTiquet) {
            devolver = introducido - importeTiquet;
        }
        int resto;
        String cantidad = "";
        for (int i = 0; i < dinero.length; i++) {
            cantidad += devolver/dinero[i];
        }
    }
}
