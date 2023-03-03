package joselobo_lab6p2;

import java.util.ArrayList;

public class Cliente extends Usuario {

    ArrayList<Cancion> favoritas = new ArrayList();
    ArrayList<Reproduccion> reproducciones = new ArrayList();

    public Cliente(String username, String contrasena, int edad) {
        super(username, contrasena, edad);
    }

    public ArrayList<Cancion> getFavoritas() {
        return favoritas;
    }

    public void setFavoritas(ArrayList<Cancion> favoritas) {
        this.favoritas = favoritas;
    }

    public ArrayList<Reproduccion> getReproducciones() {
        return reproducciones;
    }

    public void setReproducciones(ArrayList<Reproduccion> reproducciones) {
        this.reproducciones = reproducciones;
    }

    public void addFavorita(Cancion C) {
        favoritas.add(C);
    }

    public void delFavorita(int index) {
        favoritas.remove(index);
    }

    public void addReproduccion(Reproduccion R) {
        reproducciones.add(R);
    }

    public void delReproduccion(int index) {
        reproducciones.remove(index);
    }
}
