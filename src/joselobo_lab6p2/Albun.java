package joselobo_lab6p2;

import java.util.ArrayList;
import java.util.Date;

public class Albun extends Lanzamiento {

    ArrayList<Cancion> canciones = new ArrayList();
    int id;

    public Albun(int id, int likes, Date fecha, String titulo) {
        super(likes, fecha, titulo);
        this.id = id;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void AddCanciones(Cancion C) {
        canciones.add(C);
    }
}
