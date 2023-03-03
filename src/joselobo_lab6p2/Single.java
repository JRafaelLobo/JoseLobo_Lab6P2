package joselobo_lab6p2;

import java.util.Date;

public class Single extends Lanzamiento {

    Cancion cancion = new Cancion();

    public Single() {
    }

    public Single(int likes, Date fecha, String titulo) {
        super(likes, fecha, titulo);
    }

    public Cancion getCancion() {
        return cancion;
    }

    public void setCancion(Cancion cancion) {
        this.cancion = cancion;
    }

}
