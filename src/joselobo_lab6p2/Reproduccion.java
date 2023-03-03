package joselobo_lab6p2;

import java.util.ArrayList;

public class Reproduccion {
    
    String Usuario;
    int likes;
    ArrayList<Cancion> canciones = new ArrayList();
    
    public Reproduccion(String Usuario, int likes) {
        this.Usuario = Usuario;
        this.likes = likes;
    }
    
    public String getUsuario() {
        return Usuario;
    }
    
    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }
    
    public int getLikes() {
        return likes;
    }
    
    public void setLikes(int likes) {
        this.likes = likes;
    }
    
    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }
    
    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public void addCancion(Cancion C) {
        this.canciones.add(C);
    }

    public void QuitarCancion(int index) {
        this.canciones.remove(index);
    }
    
}
