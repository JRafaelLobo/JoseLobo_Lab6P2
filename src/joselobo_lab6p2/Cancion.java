package joselobo_lab6p2;

public class Cancion {

    String titulo, duracion;
    int albunRef;

    public Cancion() {
    }

    public Cancion(String titulo, String duracion, int albunRef) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.albunRef = albunRef;
    }
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public int getAlbunRef() {
        return albunRef;
    }

    public void setAlbunRef(int albunRef) {
        this.albunRef = albunRef;
    }

    @Override
    public String toString() {
        return titulo;
    }

}
