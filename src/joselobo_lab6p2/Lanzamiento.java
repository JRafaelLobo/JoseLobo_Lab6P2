package joselobo_lab6p2;

import java.util.Date;

public class Lanzamiento {

    int likes;
    String fecha;
    String titulo;

    public Lanzamiento() {
    }

    public Lanzamiento(int likes, String fecha, String titulo) {
        this.likes = likes;
        this.fecha = fecha;
        this.titulo = titulo;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Lanzamiento{" + "likes=" + likes + ", fecha=" + fecha + ", titulo=" + titulo + '}';
    }

}
