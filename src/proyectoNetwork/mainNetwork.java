package proyectoNetwork;

import java.util.ArrayList;

public class mainNetwork {
    public static void main(String[] args) {
    Usuario maria = new Usuario("Maria");
    Usuario pepe = new Usuario("Pepe");
    Usuario juan = new Usuario("Juan");

    Texto t = new Texto(1, maria, "Esto es un mensaje");
    maria.addPublicaciones(t);
    Fotografia f = new Fotografia(2, pepe, "Flor.png", "Flor.png");
    pepe.addPublicaciones(f);

    Comentario c = new Comentario(t, pepe, "Muy bueno");
    t.addComentarios(c);

    for (Publicacion p : maria.getPublicaciones()) {
        System.out.println(p);
        }
    }
}
