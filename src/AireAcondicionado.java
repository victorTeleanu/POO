public class AireAcondicionado {
    private String nombre;
    private int tempMax;
    private int tempMin;
    private int tempActual;

    public AireAcondicionado(String nombre, int tempMax, int tempMin, int tempActual) {
        this.nombre = nombre;
        this.tempMax = tempMax;
        this.tempMin = tempMin;
        this.tempActual = tempActual;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getTempMax() {
        return tempMax;
    }

    public void setTempMax(int tempMax) {
        this.tempMax = tempMax;
    }

    public double getTempMin() {
        return tempMin;
    }
    public void setTempMin(int tempMin) {
        this.tempMin = tempMin;
    }
    public double getTempActual() {
        return tempActual;
    }
    public void setTempActual(int tempActual) {
        this.tempActual = tempActual;
    }

    @Override
    public String toString() {
        return this.nombre + "\n\t" + "Temperatura máxima: " + this.tempMax + "\n\t" + "Temperatura mínima: " + this.tempMin + "\n\t" + "Temperatura actual: " + this.tempActual;
    }

    public void increment() {
        if (!(tempActual + 1 > tempMax)) {
            tempActual++;
        }
    }

    public void decrement() {
        if (!(tempActual -1 < tempMin))
            tempActual--;
    }
}
