package Objeto;

import EntesConMovimiento.Billy;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MesaTrabajo extends Crafteables {

    static int tablas;
    static int rama;
    static int piedras;
    static int madera;
    private List<Integer> cantMesa = new ArrayList<>();
    static int numero = 0;
    public int cantPicoPiedra;
    public int cantPalaMadera;
    public int cantHachaPiedra;
    public int cantLanzaComun;

    public void setCantMesa(List<Integer> cantMesa) {
        this.cantMesa = cantMesa;
    }

    public void setTablas(int tablas) {
        this.tablas = 0;
    }

    public void setRama(int rama) {
        this.rama = 0;
    }

    public void setPiedras(int piedras) {
        this.piedras = 0;
    }

    public void setMadera(int madera) {
        this.madera = 0;
    }

    public void setCantPicoPiedra(int cantPicoPiedra) {
        this.cantPicoPiedra = 0;
    }

    public void setCantPalaMadera(int cantPalaMadera) {
        this.cantPalaMadera = 0;
    }

    public void setCantHachaPiedra(int cantHachaPiedra) {
        this.cantHachaPiedra = 0;
    }

    public void setCantLanzaComun(int cantLanzaComun) {
        this.cantLanzaComun = 0;
    }

    public void crafteo_mesa(Billy billy, char mundo[][], char matrizAux[][], String mundoObjetos[][]) {
        int lugar1 = billy.pos1;
        int lugar2 = billy.pos2;
        int x = lugar1 - 6;
        int y = lugar2 - 6;
        int cantTronco = 0, cantPiedri = 0;
        for (int i = x; i < lugar1 + 6; i++) {
            for (int j = y; j < lugar2 + 6; j++) {
                if (mundo[i][j] == '=' && cantTronco < 1) {//si hay una tabla y no tengo las que necesito
                    cantTronco++;
                    mundo[i][j] = 205;//quito el tronco del suelo
                }
                if (mundo[i][j] == '.' && cantPiedri < 3) {//si hay una piedrita y no tengo las que necesito
                    cantPiedri++;
                    mundo[i][j] = 205;//quito el tronco del suelo
                }

            }
        }
        if (cantTronco >= 1 && cantPiedri >= 3) {
            cantMesa.add(numero + 1);
            mundo[billy.pos1][billy.pos2] = '$';//mesa de trabajo en el lugar
            matrizAux[billy.pos1][billy.pos2] = '$';
            mundoObjetos[billy.pos1][billy.pos2] = "mesaTrabajo";

        } else {
            System.out.println("No tienes suficientes materiales.");
        }
    }

    public void genera_x_objetos() {
        int crafte = que_voy_craftear();
        switch (crafte) {
            case 1 ->
                cantPicoPiedra++;
            case 2 ->
                cantPalaMadera++;
            case 3 ->
                cantHachaPiedra++;
            case 4 ->
                cantLanzaComun++;
            case 5 ->
                tablas++;
        }
    }

    public void agrego_materiales(Billy bil, String mundoObjetos[][]) {
        String manoI = objeto_mano_izquierda(mundoObjetos, bil);
        String manoD = objeto_mano_derecha(mundoObjetos, bil);
        if (null != manoI) {
            switch (manoI) {
                case "tabla":
                    tablas++;
                    objeEnMano[1] = null;
                    break;
                case "ramas":
                    rama++;
                    objeEnMano[1] = null;
                    break;
                case "roca":
                    piedras++;
                    objeEnMano[1] = null;
                    break;
                case "maderaRoble":
                    madera++;
                    objeEnMano[1] = null;
                    break;
                case "maderaPino":
                    madera++;
                    objeEnMano[1] = null;
                default:
                    break;
            }
        } else if (null != manoD) {
            switch (manoD) {
                case "tabla":
                    tablas++;
                    objeEnMano[0] = null;
                    break;
                case "ramas":
                    rama++;
                    objeEnMano[0] = null;
                    break;
                case "roca":
                    piedras++;
                    objeEnMano[0] = null;
                    break;
                case "maderaRoble":
                    madera++;
                    objeEnMano[0] = null;
                    break;
                case "maderaPino":
                    madera++;
                    objeEnMano[0] = null;
                default:
                    break;
            }
        }
    }

    public void que_tengo_mesa() {
        if (madera > 0) {
            System.out.println("La madera que tengo en la mesa es" + madera);
        }
        if (piedras > 0) {
            System.out.println("La piedra que tengo en la mesa es" + piedras);
        }
        if (rama > 0) {
            System.out.println("La piedra que tengo en la mesa es de" + rama);
        }
        if (tablas > 0) {
            System.out.println("La piedra que tengo en la mesa es de" + cantLanzaComun);
        }
        if (cantLanzaComun > 0) {
            System.out.println("La piedra que tengo en la mesa es de" + tablas);
        }
        if (cantHachaPiedra > 0) {
            System.out.println("La piedra que tengo en la mesa es de" + cantHachaPiedra);
        }
        if (cantPalaMadera > 0) {
            System.out.println("La piedra que tengo en la mesa es de" + cantPalaMadera);
        }
        if (cantPicoPiedra > 0) {
            System.out.println("La piedra que tengo en la mesa es de" + cantPicoPiedra);
        } else {
            System.out.println("No hay nada!");
        }
    }

    public int que_voy_craftear() {
        Scanner sc = new Scanner(System.in);
        int craf = sc.nextInt();
        System.out.print("[1]-Pico de piedra. [2]-Pala de madera. [3]-Hacha de piedra. [4]-Lanza.[5]-Tablon.");
        switch (craf) {
            case 1 -> {
                if (genero_picopiedra()) {
                    return 1;
                }
            }
            case 2 -> {
                if (genero_pala_madera()) {
                    return 2;
                }
            }
            case 3 -> {
                if (genero_hachapiedra()) {
                    return 3;
                }
            }
            case 4 -> {
                if (genero_lanza()) {
                    return 4;
                }
            }
            case 5 -> {
                if (genero_tablones()) {
                    return 5;
                }
            }
        }
        return 0;
    }

    static boolean genero_lanza() {
        boolean nohay = false;
        if (rama >= 1) {
            return true;
        }
        return nohay;

    }

    static boolean genero_picopiedra() {
        boolean nohay = false;
        if (rama >= 1 && piedras > 2) {
            rama--;
            piedras--;
            return true;
        }
        return nohay;

    }

    static boolean genero_hachapiedra() {
        boolean nohay = false;
        if (rama >= 1 && piedras > 1) {
            rama--;
            piedras--;
            return true;
        }
        return nohay;

    }

    static boolean genero_tablones() {
        boolean nohay = false;
        if (madera >= 1) {
            madera--;
            return true;
        }
        return nohay;

    }

    static boolean genero_pala_madera() {
        boolean nohay = false;
        if (rama >= 1 && tablas > 1) {
            rama--;
            tablas--;
            return true;
        }
        return nohay;

    }
}
