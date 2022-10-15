package EntesConMovimiento;

import java.util.Scanner;

public class PersonajeMovimiento {
    public boolean miroAdelante;
    public boolean miroIzquierda;
    public boolean miroDerecha;
    public boolean miroAtras;

 
    
    
    
    
    public static void mueve_ese_cuerpo(char mundoFinal[][], char matrisAux[][], Billy billy, int tam, PersonajeMovimiento perso, char mov) {
        perso.miroAdelante = false;
        perso.miroIzquierda = false;
        perso.miroDerecha = false;
        perso.miroAtras = false;

        //comandos de movimiento
        switch (mov) {
            case 'w', 'W' -> {
                billy.pos1--;
                perso.miroAdelante = true;
            }
            case 's', 'S' -> {
                billy.pos1++;
                perso.miroAtras = true;
            }
            case 'a', 'A' -> {
                billy.pos2--;
                perso.miroIzquierda = true;
            }
            case 'd', 'D' -> {
                billy.pos2++;
                perso.miroDerecha = true;
            }
            default -> {
            }
        }
        //compruebo si no me salgo de los limites del mundo
        if ((billy.pos1 < 0 || billy.pos2 < 0) || (billy.pos1 > tam || billy.pos2 > tam)) {
            billy.pos1 = billy.posA1;
            billy.pos2 = billy.posA2;
        }
    }

    public static boolean si_hay_arbol(char mundoFinal[][], Billy billy) {
        boolean hayArbol = false;
        switch (mundoFinal[billy.pos1][billy.pos2]) {
            case 'R' -> { //roble
                return hayArbol;
            }
            case 'P' -> { //pino
                return hayArbol;
            }
            case 'Y' -> { // palmera
                return hayArbol;
            }
            case '|' -> { // caña de azucar
                return hayArbol;
            }
            case 'E' -> { // enebro
                return hayArbol;
            }
            case 'G' -> { // ginco
                return hayArbol;
            }
            default -> {
                return true;
            }
        }
    }

    public static boolean por_ahi_nopaso(char mundoFinal[][], Billy billy) {
        boolean noPaso = false;
        switch (mundoFinal[billy.pos1][billy.pos2]) {
            case 'M' -> {//montania
                return noPaso;
            }
            case 'O' -> {//Caberna
                return noPaso;
            }
            case 'S' -> {//oceano
                return noPaso;
            }
            case ',' -> {//rio
                return noPaso;
            }
            default -> {
                return true;
            }
        }
    }

    public static boolean si_hay_animal(char mundoFinal[][], Billy billy) {
        boolean noPaso = false;
        switch (mundoFinal[billy.pos1][billy.pos2]) {
            case 'b' -> {//Ballena
                return noPaso;
            }
            case 'C' -> {//Cocodrilo
                return noPaso;
            }
            case 'J' -> {//jabali
                return noPaso;
            }
            case 'T' -> {//Tigre
                return noPaso;
            }
            case 'V' -> {//Venado
                return noPaso;
            }
            case 'S' -> {//Simio
                return noPaso;
            }
            default -> {
                return true;
            }
        }
    }

    public static boolean se_mueve_si(char mundoFinal[][], char matrisAux[][], Billy billy, int tam, PersonajeMovimiento perso, char mov) {
        boolean seMueve = false;
        mueve_ese_cuerpo(mundoFinal, matrisAux, billy, tam, perso, mov);
        if (si_hay_arbol(mundoFinal, billy)) {
            if (por_ahi_nopaso(mundoFinal, billy)) {
                if (si_hay_animal(mundoFinal, billy)) {
                    seMueve = true;
                } else {
                    billy.pos1 = billy.posA1;
                    billy.pos2 = billy.posA2;
                }
            } else {
                billy.pos1 = billy.posA1;
                billy.pos2 = billy.posA2;
            }
        } else {
            billy.pos1 = billy.posA1;
            billy.pos2 = billy.posA2;
        }

        return seMueve;
    }

}
