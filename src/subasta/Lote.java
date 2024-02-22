package subasta;

import java.util.HashSet;
import java.util.Set;

public class Lote {

    private String nombre;
    private Subasta subasta;
    private Set<Articulo> articulos;
    private Set<Puja> pujas;
    public Lote(String nombre, Subasta subasta) {
        this.nombre = nombre;
        this.subasta = subasta;
        this.articulos = new HashSet<>();
        this.pujas = new HashSet<>();
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Subasta getSubasta() {
        return subasta;
    }

    public void setSubasta(Subasta precio) {
        this.subasta = precio;
    }

    public Set<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(Set<Articulo> articulos) {
        this.articulos = articulos;
    }

    public Set<Puja> getPujas() {
        return pujas;
    }

    public void setOujas(Set<Puja> pujas) {
        this.pujas = pujas;
    }

    public void addArticulo(Articulo articulo) {
        this.articulos.add(articulo);
    }

    public void addPuja(Puja puja) {
        this.pujas.add(puja);
    }

    public double precioLote() {
        return articulos.stream().map(Articulo::getPrecio).mapToDouble(Double::valueOf).sum();
    }

    @Override
    public String toString() {
        return this.nombre + " " + this.precioLote();
    }

}
