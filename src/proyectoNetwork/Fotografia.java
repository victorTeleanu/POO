package proyectoNetwork;

import java.util.Date;

public class Fotografia extends Publicacion{

    private String nombreImg;
    private String titulo;

    public Fotografia(int ID, Usuario usuario, String nombreImg, String titulo) {
        super(ID, usuario);
        this.nombreImg = nombreImg;
        this.titulo = titulo;
    }

    public String getNombreImg() {
        return nombreImg;
    }

    public void setNombreImg(String nombreImg) {
        this.nombreImg = nombreImg;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Publicación de imagen: " + this.titulo;
    }
}
