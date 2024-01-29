import java.util.List;

public class Libro {
    private String titulo;
    private Autor autor;
    private int paginas;
    private List<Tema> temas;

    public Libro(String titulo, Autor autor, int paginas, List<Tema> temas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.temas = temas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public List<Tema> getTemas() {
        return temas;
    }

    public void setTemas(List<Tema> temas) {
        this.temas = temas;
    }

    @Override
    public String toString() {
        return this.titulo + "\n\t" + this.autor + "\n\t" + this.paginas  + " páginas" + "\n\t" + this.temas;
    }
}
