package Mundo;

import EntesConMovimiento.Billy;
import EntesConMovimiento.PersonajeMovimiento;
import Objeto.Fogata;
import Objeto.MesaTrabajo;
import Objeto.Objeto;
import java.util.Scanner;

public class juego {

    Scanner sc = new Scanner(System.in);

    public static void crear_mundo_string(String mundoObjetos[][], Objeto objeto) {
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 50; j++) {
                mundoObjetos[i][j] = " ";
            }
        }
    }

    public void uso_hacha(Billy bil, Objeto obje, char mundoFinal[][], String mundoObjetos[][], char matrizAux[][], PersonajeMovimiento perso, char mov) {

        if (bil.movimiento(mundoFinal, matrizAux, bil, 0, perso, mov) == 1) {
            if (perso.miroAdelante) {
                if (mundoFinal[bil.pos1 - 1][bil.pos2] == 'R') {
                    if ("hacha".equals(obje.objeEnMano[0])) {
                        mundoFinal[bil.pos1 - 1][bil.pos2] = '-';
                        mundoObjetos[bil.pos1 - 1][bil.pos2] = "maderaRoble";
                        matrizAux[bil.pos1 - 1][bil.pos2] = '.';
                    }
                }
            } else if (perso.miroAtras) {
                if (mundoFinal[bil.pos1 + 1][bil.pos2] == 'R') {
                    if ("hacha".equals(obje.objeEnMano[1])) {
                        mundoFinal[bil.pos1 + 1][bil.pos2] = '-';
                        mundoObjetos[bil.pos1 + 1][bil.pos2] = "maderaRoble";
                        matrizAux[bil.pos1 + 1][bil.pos1] = '.';
                    }
                }
            } else if (perso.miroDerecha) {
                if (mundoFinal[bil.pos1][bil.pos2 + 1] == 'R') {
                    if ("hacha".equals(obje.objeEnMano[1])) {
                        mundoFinal[bil.pos1][bil.pos2 + 1] = '-';
                        mundoObjetos[bil.pos1][bil.pos2 + 1] = "maderaRoble";
                        matrizAux[bil.pos1][bil.pos1 + 1] = '.';
                    }
                }
            } else if (perso.miroIzquierda) {
                if (mundoFinal[bil.pos1][bil.pos2 - 1] == 'R') {
                    if ("hacha".equals(obje.objeEnMano[1])) {
                        mundoFinal[bil.pos1][bil.pos2 - 1] = '-';
                        mundoObjetos[bil.pos1][bil.pos2 - 1] = "maderaRoble";
                        matrizAux[bil.pos1][bil.pos1 - 1] = '.';
                    }
                }
            }
        }
    }

    public void recojo_suelo(Objeto obje, String mundoObjetos[][], Billy bil) {
        boolean tengo = obje.hay_objeto(mundoObjetos, bil, obje);
        System.out.println("Mundo.juego.tengo_en_mano()" + tengo);
        if (tengo) {
            if (obje.objeEnMano[0] == null) {
                obje.objeEnMano[0] = mundoObjetos[bil.pos1][bil.pos2];
                mundoObjetos[bil.pos1][bil.pos2] = " ";
            } else {
                obje.objeEnMano[1] = mundoObjetos[bil.pos1][bil.pos2];
                mundoObjetos[bil.pos1][bil.pos2] = " ";
            }
        }
    }

    public boolean suelto_objeto(Objeto obje, Billy bil, String mundoObjetos[][]) {
        if (obje.objeEnMano[0] != null || obje.objeEnMano[1] != null) {
            char suelto = sc.next().charAt(0);
            if (suelto == 'q') {
                mundoObjetos[bil.pos1][bil.pos2 + 1] = obje.objeEnMano[1];
                obje.objeEnMano[1] = null;
                return true;
            } else if (suelto == 'e') {
                mundoObjetos[bil.pos1][bil.pos2 + 1] = obje.objeEnMano[0];
                obje.objeEnMano[0] = null;
                return true;
            }
        }
        return false;
    }

    public void interactuo_mesaTra(MesaTrabajo mesa, Objeto obje, Billy bil, String mundoObjetos[][]) {
        System.out.println("""
                           [Q] Craftear objetos de la mesa de trabajo.
                           [C] Si decea colocar materiales en la mesa de trabajo.
                           [O] Que tengo en la mesa de trabajo.""");
        char opc = sc.next().charAt(0);
        switch (opc) {
            case 'q' -> {
                int craft = mesa.que_voy_craftear();
                if (craft > 0) {
                    switch (craft) {
                        case 1 -> {
                            if (obje.objeEnMano[0] != null) {
                                obje.objeEnMano[0] = "picoPiedra";
                            } else {
                                obje.objeEnMano[1] = "picoPiedra";
                            }
                        }
                        case 2 -> {
                            if (obje.objeEnMano[0] != null) {
                                obje.objeEnMano[0] = "palaMadera";
                            } else {
                                obje.objeEnMano[1] = "palaMadera";
                            }
                        }
                        case 3 -> {
                            if (obje.objeEnMano[0] != null) {
                                obje.objeEnMano[0] = "hachaPiedra";
                            } else {
                                obje.objeEnMano[1] = "hachaPiedra";
                            }
                        }
                        case 4 -> {
                            if (obje.objeEnMano[0] != null) {
                                obje.objeEnMano[0] = "lanzaComun";
                            } else {
                                obje.objeEnMano[1] = "lanzaComun";
                            }
                        }
                        case 5 -> {
                            if (obje.objeEnMano[0] != null) {
                                obje.objeEnMano[0] = "tablones";
                            } else {
                                obje.objeEnMano[1] = "tablones";
                            }
                        }
                        default ->
                            throw new AssertionError();
                    }
                }
            }
            case 'c' -> mesa.agrego_materiales(bil, mundoObjetos);
            case 'o' -> mesa.que_tengo_mesa();
            default -> {
            }
        }
    }
    
    public void que_crafteo(MesaTrabajo mesa, Fogata fogata, Billy bil, String mundoObjetos[][], char mundoFinal[][], char matrizAux[][]){
        
        System.out.println("[1] Craftear mesa de trabajo.\n[2] Craftear fogata.");
        int queCraf = sc.nextInt();
        
        if(queCraf == 1){
            mesa.crafteo_mesa(bil, mundoFinal, matrizAux, mundoObjetos);
        } else if(queCraf == 2){
            fogata.crafteo_fogata(fogata, bil, mundoFinal, mundoObjetos);
        }
        
        
        
    }
    
    
    
}
