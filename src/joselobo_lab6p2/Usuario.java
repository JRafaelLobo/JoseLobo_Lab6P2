package joselobo_lab6p2;
public class Usuario {
    String username,contrasena;
    int edad;

    public Usuario() {
    }

    public Usuario(String username, String contrasena, int edad) {
        this.username = username;
        this.contrasena = contrasena;
        this.edad = edad;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
