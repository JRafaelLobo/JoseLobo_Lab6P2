package joselobo_lab6p2;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class AdministrarUsuarios {

    ArrayList<Usuario> usuarios = new ArrayList();
    private File archivo = null;

    public AdministrarUsuarios(String path) {
        archivo = new File(path);
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Usuario t : usuarios) {
                bw.write(t.getUsername() + "|");
                bw.write(t.getContrasena() + "|");
                bw.write(t.getEdad() + "\n");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        usuarios = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                while (sc.hasNextLine()) {
                    String base = sc.nextLine();
                    String[] temp = base.split("\\|");
                    usuarios.add(new Usuario(temp[0], temp[1], Integer.parseInt(temp[2])));
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }
}
