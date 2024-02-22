package proyectoNetwork;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Publicacion {
    private Usuario usuario;
    private Date fecha;
    private int likes;
    private Set<Comentario> comentarios;

    public Publicacion(int ID, Usuario usuario) {
        this.usuario = usuario;
        this.fecha = new Date();
        this.likes = 0;
        this.comentarios = new HashSet<>();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public Set<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(Set<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

    public void addComentarios(Comentario comentario) {
        this.comentarios.add(comentario);
    }

    @Override
    public String toString() {
        return "Likes:" + this.likes + " Fecha:" + this.fecha + " Usuario:" + this.usuario;
    }
}
