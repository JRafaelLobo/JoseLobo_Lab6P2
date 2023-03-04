package joselobo_lab6p2;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class AdministrarLanzamiento {

    ArrayList<Lanzamiento> lanzamientos = new ArrayList();
    private File archivo = null;

    public AdministrarLanzamiento(String path) {
        archivo = new File(path);
    }

    public ArrayList<Lanzamiento> getUsuarios() {
        return lanzamientos;
    }

    public void setUsuarios(ArrayList<Lanzamiento> lanzamientos) {
        this.lanzamientos = lanzamientos;
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
            for (Lanzamiento t : lanzamientos) {
                if (t instanceof Albun) {
                    Albun A = (Albun) t;
                    bw.write(A.getId() + "|");
                    bw.write(A.getTitulo() + "|");
                    bw.write(A.getFecha() + "|");
                    ArrayList<Cancion> C = new ArrayList();
                    C.addAll(A.getCanciones());
                    for (Cancion cancion : C) {
                        bw.write(cancion + ";");
                    }
                    bw.write(" |");
                    bw.write(A.getLikes() + "\n");
                } else {
                    Single S = (Single) t;
                    bw.write(S.getId() + "|");
                    bw.write(S.getTitulo() + "|");
                    bw.write(S.getFecha() + "|");
                    bw.write(S.getLikes() + "\n");
                    bw.write(S.getCancion() + "\n");

                }

            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        lanzamientos = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                while (sc.hasNextLine()) {
                    String base = sc.nextLine();
                    String[] temp = base.split("\\|");
                    if (base.contains(",")) {
                        Albun A = new Albun(Integer.parseInt(temp[4]), Integer.parseInt(temp[0]), temp[2], temp[1]);
                        String[] temp2 = temp[3].split(":");
                        for (String n : temp2) {
                            A.AddCanciones(new Cancion(n, n, 0));//aqui falta pero tiempo
                        }
                        lanzamientos.add(A);
                    }
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }
}
