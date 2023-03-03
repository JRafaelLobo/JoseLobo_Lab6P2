package joselobo_lab6p2;

import java.util.ArrayList;

public class Artista extends Usuario{

    String nombre;
    ArrayList<Cancion> canciones = new ArrayList();
    ArrayList<Albun> albunes = new ArrayList();

    public Artista(String nombre) {
        this.nombre = nombre;
    }

    public Artista(String nombre, String username, String contrasena, int edad) {
        super(username, contrasena, edad);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public ArrayList<Albun> getAlbunes() {
        return albunes;
    }

    public void setAlbunes(ArrayList<Albun> albunes) {
        this.albunes = albunes;
    }
    
    
}
