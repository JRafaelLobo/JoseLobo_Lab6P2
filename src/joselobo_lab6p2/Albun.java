package joselobo_lab6p2;

import java.util.ArrayList;
import java.util.Date;

public class Albun extends Lanzamiento {

    ArrayList<Cancion> canciones = new ArrayList();

    public Albun(int likes, int id, String fecha, String titulo) {
        super(likes, id, fecha, titulo);
    }

    

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public void AddCanciones(Cancion C) {
        canciones.add(C);
    }
}
