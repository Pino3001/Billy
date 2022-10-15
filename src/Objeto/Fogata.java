package Objeto;

import EntesConMovimiento.Billy;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fogata extends Crafteables {

    public List<Integer> cantFogatas = new ArrayList<>();
    static int numero;
    public Fuego llama;
    private int cantMadera;
    private int cantpiedras;

    Scanner sc = new Scanner(System.in);

    public void setCantMadera(int cantMadera) {
        this.cantMadera = 0;
    }

    public void setCantpiedras(int cantpiedras) {
        this.cantpiedras = 0;
    }

    public void crafteo_fogata(Fogata fogata, Billy billy, char mundo[][], String matrizObjetos[][]) {
        int lugar1 = billy.pos1;
        int lugar2 = billy.pos2;
        int x = lugar1 - 6;
        int y = lugar2 - 6;
        int cantPiedri = 0;
        for (int i = x; i < lugar1 + 6; i++) {
            for (int j = y; j < lugar2 + 6; j++) {
                if (mundo[i][j] == 'p' && cantPiedri <= 5) {//si hay una piedrita y no tengo las que necesito
                    cantPiedri++;
                    mundo[i][j] = '.';//quito el tronco del suelo
                }

            }
        }
        if (cantPiedri >= 5) {
            fogata.cantFogatas.add(numero + 1);
            mundo[billy.pos1][billy.pos2] = 'H';//mesa de trabajo en el lugar
            mundo[billy.posA1][billy.posA2] = 'B';// billy se hecha pa atras
            matrizObjetos[billy.pos1][billy.pos2] = "fogata";
                    

        }
    }

    private void interactuo_fogata(Billy bil, int mundoFinal[][], String mundoObjetos[][], Fuego fuego, Fogata fogata) {
        if (mundoFinal[bil.pos1][bil.pos2] == 'H') {
            System.out.print("[Q] dejar materiales mano derecha/ [E] dejar materiales mano izquierda."
                    + "[R] encender la fogata.");
            System.out.print("");
            char accion = sc.next().charAt(0);
            switch (accion) {
                case 'q', 'Q' ->{
                    almaceno_en_fogata(bil, mundoObjetos);
                }
                case 'e', 'E'-> {
                    almaceno_en_fogata(bil, mundoObjetos);
                }
                case 'R', 'r'-> {
                    prendo_fogata(fogata, fuego);
                }
            }
        }
    }

    private void almaceno_en_fogata(Billy bil, String mundoObjetos[][]) {
        String manoI = objeto_mano_izquierda(mundoObjetos, bil);
        String manoD = objeto_mano_derecha(mundoObjetos, bil);
        for (int i = 0; i < TipoMadera.size(); i++) {
            if (manoD.equals(TipoMadera.get(i))) {
                cantMadera++;
                objeEnMano[1] = null;
            } else if (manoI.equals(TipoMineral.get(i))) {
                cantpiedras++;
                objeEnMano[0] = null;
            }
        }
    }

    public void prendo_fogata(Fogata fogata, Fuego fuego) {
        char prend = sc.next().charAt(0);
        if (prend == 'r' || prend == 'R') {
            if (cantMadera > 3 && cantpiedras > 2) {
                fuego.intencidad = 1;
                cantMadera -= 3;
                cantpiedras -= 3;
            }
        }
    }

}
