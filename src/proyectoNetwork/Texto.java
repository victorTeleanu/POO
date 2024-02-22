package proyectoNetwork;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Texto extends Publicacion {
    private String mensaje;

    public Texto(int ID, Usuario usuario, String mensaje) {
        super(ID, usuario);
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.mensaje;
    }
}