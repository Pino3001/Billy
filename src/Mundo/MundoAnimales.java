package Mundo;

import EntesConMovimiento.Abeja;
import EntesConMovimiento.Ave;
import EntesConMovimiento.Ballena;
import EntesConMovimiento.Billy;
import EntesConMovimiento.Cocodrilo;
import EntesConMovimiento.Insecto;
import EntesConMovimiento.Jabalí;
import EntesConMovimiento.Pes;
import EntesConMovimiento.Simio;
import EntesConMovimiento.Tigre;
import EntesConMovimiento.Venado;
import java.util.ArrayList;
import java.util.List;

public class MundoAnimales {

    public List<Character> animalesChar = new ArrayList<>();

    public void los_animales() {
        animalesChar.add('v');
        animalesChar.add('S');
        animalesChar.add('T');
        animalesChar.add('b');
        animalesChar.add('C');
        animalesChar.add('J');
    }

    public static void crear_mundoAnimal_vacio(char mundoFinal[][]) {
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                mundoFinal[i][j] = ' ';
            }
        }
    }

    public static void aparece_abeja(char mundoFinal[][], Abeja abeja) {
        int prob;
        for (int i = 8; i < 40; i++) {
            for (int j = 9; j < 40; j++) {
                prob = abeja.probabilidad_animal();
                if (prob < 30 && mundoFinal[i + 1][j + 1] == 30) {
                    mundoFinal[i][j] = '@';
                }
            }
        }
    }

    public static void aparece_ave(char mundoFinal[][], Ave pajaro) {
        int prob;
        for (int i = 6; i < 45; i++) {
            for (int j = 5; j < 47; j++) {
                prob = pajaro.probabilidad_animal();
                if (prob < 10) {
                    mundoFinal[i][j] = '*';
                }
            }
        }
    }

    public static void aparece_Ballena(char mundoFinal[][], Ballena ballena) {
        int prob;
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 50; j++) {
                prob = ballena.probabilidad_animal();
                if (prob < 1) {
                    if (i < 7 || i > 43) {
                        mundoFinal[i][j] = 'b';
                    } else if (j < 7 || j > 43) {
                        mundoFinal[i][j] = 'b';
                    }
                }
            }
        }
    }

    public static void aparece_pes(char mundoFinal[][], Pes peses) {
        int prob;
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 50; j++) {
                prob = peses.probabilidad_animal();
                if (prob < 20) {
                    if (i < 7 || i > 43) {
                        mundoFinal[i][j] = '8';
                    } else if (j < 7 || j > 43) {
                        mundoFinal[i][j] = '8';
                    }
                }
            }
        }
    }

    public static void aparece_coco(char mundoFinal[][], Cocodrilo cocodrail) {
        int prob;
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 50; j++) {
                prob = cocodrail.probabilidad_animal();
                if (prob < 5) {
                    if (i < 7 || i > 43) {
                        mundoFinal[i][j] = 'C';
                    } else if (j < 7 || j > 43) {
                        mundoFinal[i][j] = 'C';
                    }
                }
            }
        }
    }

    public static void aparece_insecto(char mundoFinal[][], Insecto bicho) {
        int prob;
        for (int i = 8; i < 40; i++) {
            for (int j = 9; j < 40; j++) {
                prob = bicho.probabilidad_animal();
                if (prob < 10) {
                    mundoFinal[i][j] = 'i';
                }
                if (prob < 30 && mundoFinal[i + 1][j + 1] == 's') {
                    mundoFinal[i][j] = 'i';
                }
            }
        }
    }

    public static void aparece_jabali(char mundoFinal[][], Jabalí jabalí) {
        int prob;
        for (int i = 8; i < 40; i++) {
            for (int j = 9; j < 40; j++) {
                prob = jabalí.probabilidad_animal();
                if (prob < 3) {
                    mundoFinal[i][j] = 'J';
                }
            }
        }
    }

    public static void aparece_tigre(char mundoFinal[][], Tigre tigre) {
        int prob;
        for (int i = 15; i < 35; i++) {
            for (int j = 15; j < 35; j++) {
                prob = tigre.probabilidad_animal();
                if (prob < 1) {
                    mundoFinal[i][j] = 'T';
                }
            }
        }
    }

    public static void aparece_venado(char mundoFinal[][], Venado venado) {
        int prob;
        for (int i = 8; i < 40; i++) {
            for (int j = 9; j < 40; j++) {
                prob = venado.probabilidad_animal();
                if (prob < 3) {
                    mundoFinal[i][j] = 'V';
                }
                if (prob < 5 && mundoFinal[i + 1][j + 1] == '.') {
                    mundoFinal[i][j] = 'V';
                }
            }
        }
    }

    public static void aparece_simio(char mundoFinal[][], Simio mono) {
        int prob;
        for (int i = 8; i < 40; i++) {
            for (int j = 9; j < 40; j++) {
                prob = mono.probabilidad_animal();
                if (prob < 1) {
                    mundoFinal[i][j] = 'S';
                }
                if (prob < 5 && (mundoFinal[i + 1][j + 1] == 'R' || mundoFinal[i + 1][j + 1] == 'Y')) {
                    mundoFinal[i][j] = 'S';
                }
            }
        }
    }

    public static void aparece_billy(char mundoFinal[][], Billy billy) {
        billy.pos1 = 25;
        billy.pos2 = 10;

        mundoFinal[billy.pos1][billy.pos2] = 'B';
    }

    public char el_animal_es(Billy bil, char mundoFinal[][]) {
        los_animales();

        for (int i = 0; i < animalesChar.size(); i++) {
            if (mundoFinal[bil.posE1][bil.posE2] == animalesChar.get(i)) {
                if (null != animalesChar.get(i)) {
                    switch (animalesChar.get(i)) {
                        case 'V' -> {
                            return animalesChar.get(i);
                        }
                        case 'S' -> {
                            return animalesChar.get(i);
                        }
                        case 'T' -> {
                            return animalesChar.get(i);
                        }
                        case 'b' -> {
                            return animalesChar.get(i);
                        }
                        case 'C' -> {
                            return animalesChar.get(i);
                        }
                        case 'J' -> {
                            return animalesChar.get(i);
                        }
                        default -> {
                        }
                    }
                }
            }
        }
        return 0;
    }

    public boolean puedo_atacar(char mundoFinal[][], Billy bil) {
        boolean puedoAtacar = false;
        if (el_animal_es(bil, mundoFinal) != 0) {
            return puedoAtacar = true;
        }
        return puedoAtacar;
    }

    public void que_animal_es(char mundoFinal[][], Billy bil) {

        if (puedo_atacar(mundoFinal, bil)) {
            switch (el_animal_es(bil, mundoFinal)) {
                case 'V' -> {

                }
                case 'S' -> {

                }
                case 'T' -> {

                }
                case 'b' -> {

                }
                case 'C' -> {

                }
                case 'J' -> {

                }
            }
        }
    }
}
