package Mundo;

import java.util.HashMap;

public class MundoVegetal {

    static HashMap<Integer, String> mapPlantas;

    public static void creo_diccionario_plantas() {

        mapPlantas = new HashMap<>();
        mapPlantas.put(30, "roble");
        mapPlantas.put(31, "pino");
        mapPlantas.put(32, "taro");
        mapPlantas.put(33, "palmera");
        mapPlantas.put(34, "mandioca");
        mapPlantas.put(35, "cañaAzucar");
        mapPlantas.put(36, "ballas");
        mapPlantas.put(37, "kava");
        mapPlantas.put(38, "boniato");
        mapPlantas.put(39, "enebro");
        mapPlantas.put(40, "maracuya");
        mapPlantas.put(41, "helecho");
        mapPlantas.put(42, "ginko");
    }

    public static void formacion_roble(char mundoFinal[][]) {
        for (int i = 9; i < 40; i++) {
            for (int j = 9; j < 40; j++) {
                int prob = (int) (Math.random() * 100);
                if (prob < 20) {
                    mundoFinal[i][j] = 'R';

                }
            }
        }
    }

    public static void formacion_pino(char mundoFinal[][]) {
        for (int i = 8; i < 40; i++) {
            for (int j = 9; j < 40; j++) {
                int prob = (int) (Math.random() * 100);
                if (prob < 15) {
                    mundoFinal[i][j] = 'P';
                }
            }
        }
    }

    public static void formacion_taro(char mundoFinal[][]) {
        for (int i = 10; i < 40; i++) {
            for (int j = 15; j < 35; j++) {
                int prob = (int) (Math.random() * 100);
                if (prob < 10) {
                    mundoFinal[i][j] = 't';
                }
            }
        }
    }

    public static void formacion_palmera(char mundoFinal[][]) {
        for (int i = 10; i < 40; i++) {
            for (int j = 10; j < 10; j++) {
                int prob = (int) (Math.random() * 100);
                if (prob < 80 && i < 16) {
                    mundoFinal[i][j] = 'Y';
                } else if (prob < 50 && j < 16) {
                    mundoFinal[i][j] = 'Y';
                } else if (prob < 50 && j > 35) {
                    mundoFinal[i][j] = 'Y';
                } else if (prob < 50 && i > 35) {
                    mundoFinal[i][j] = 'Y';
                }
            }
        }
    }

    public static void formacion_mandioca(char mundoFinal[][]) {
        for (int i = 10; i < 40; i++) {
            for (int j = 10; j < 10; j++) {
                int prob = (int) (Math.random() * 100);
                int cont = 0, cont2 = 0;
                if (prob < 90) {
                    int x = i, y = j;
                    do {
                        mundoFinal[x][y] = 'm';
                        x++;
                        do {
                            mundoFinal[x][y] = 'm';
                            y++;
                            cont2++;
                        } while (cont2 == 1);
                        cont++;
                    } while (cont == 2);
                }
            }
        }
    }

    public static void formacion_azucar(char mundoFinal[][]) {
        for (int i = 10; i < 40; i++) {
            for (int j = 10; j < 40; j++) {
                int prob = (int) (Math.random() * 100);
                if (prob < 20) {
                    mundoFinal[i][j] = '|';
                }
            }
        }
    }

    public static void formacion_ballas(char mundoFinal[][]) {
        for (int i = 10; i < 40; i++) {
            for (int j = 10; j < 40; j++) {
                int prob = (int) (Math.random() * 100);
                if (prob < 20) {
                    mundoFinal[i][j] = 'x';
                }
            }
        }
    }

    public static void formacion_kava(char mundoFinal[][]) {
        for (int i = 10; i < 40; i++) {
            for (int j = 10; j < 40; j++) {
                int prob = (int) (Math.random() * 100);
                if (prob < 5) {
                    mundoFinal[i][j] = 'K';
                }
            }
        }
    }

    public static void formacion_boniato(char mundoFinal[][]) {
        for (int i = 10; i < 40; i++) {
            for (int j = 10; j < 40; j++) {
                int prob = (int) (Math.random() * 100);
                if (prob < 15) {
                    mundoFinal[i][j] = 'w';
                }
            }
        }
    }

    public static void formacion_enebro(char mundoFinal[][]) {
        for (int i = 10; i < 40; i++) {
            for (int j = 10; j < 40; j++) {
                int prob = (int) (Math.random() * 100);
                if (prob < 2) {
                    mundoFinal[i][j] = 'E';
                }
            }
        }
    }

    public static void formacion_maracuya(char mundoFinal[][]) {
        for (int i = 10; i < 40; i++) {
            for (int j = 10; j < 40; j++) {
                int prob = (int) (Math.random() * 100);
                if (prob < 5) {
                    mundoFinal[i][j] = 'z';
                }
            }
        }
    }

    public static void formacion_helecho(char mundoFinal[][]) {
        for (int i = 10; i < 40; i++) {
            for (int j = 10; j < 40; j++) {
                int prob = (int) (Math.random() * 100);
                if (prob < 5) {
                    mundoFinal[i][j] = 'h';
                }
            }
        }
    }

    public static void formacion_ginko(char mundoFinal[][]) {
        for (int i = 10; i < 40; i++) {
            for (int j = 10; j < 40; j++) {
                int prob = (int) (Math.random() * 100);
                if (prob < 3) {
                    mundoFinal[i][j] = 'G';
                }
            }
        }
    }

    public static void formacion_tronco(char mundoFinal[][], String mundoObjetos[][]) {
        for (int i = 10; i < 40; i++) {
            for (int j = 10; j < 40; j++) {
                int prob = (int) (Math.random() * 100);
                if (prob < 10) {
                    mundoFinal[i][j] = '=';
                    mundoObjetos[i][j] = "tronco";
                }
            }
        }
    }
}
