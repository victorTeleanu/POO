package proyectoNetwork;

public class Comentario {
    private Publicacion publicacion;
    private Usuario usuario;
    private String comentario;

    public Comentario(Publicacion publicacion, Usuario usuario, String comentario) {
        this.publicacion = publicacion;
        this.usuario = usuario;
        this.comentario = comentario;
    }

    public Publicacion getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    @Override
    public String toString() {
        return this.usuario + " " + this.comentario;
    }
}
