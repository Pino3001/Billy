package Mundo;

import java.util.HashMap;

public class Mundo {

    public HashMap<Integer, String> diccMundo;

    public void creo_diccionario_mundo() {
        diccMundo = new HashMap<>();
        diccMundo.put(1, "oceano");
        diccMundo.put(2, "tierra");
        diccMundo.put(3, "montania");
        diccMundo.put(4, "arena");
        diccMundo.put(5, "caberna");
        diccMundo.put(6, "rio");

    }

    public static void crear_mundo_vacio(char mundoFinal[][]) {
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 50; j++) {
                mundoFinal[i][j] = ' ';
            }
        }
    }

    public static void imprimir_oceano(char mundoFinal[][]) {
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 50; j++) {
                if (i < 8) {
                    mundoFinal[i][j] = 'S';
                } else if (j > 43) {
                    mundoFinal[i][j] = 'S';
                } else if (i > 43) {
                    mundoFinal[i][j] = 'S';
                } else if (j < 8) {
                    mundoFinal[i][j] = 'S';
                }
            }
        }
    }

    public static void formacion_tierra(char mundoFinal[][]) {
        for (int i = 7; i < 45; i++) {
            for (int j = 9; j < 43; j++) {
                mundoFinal[i][j] = 205;
            }
        }
    }

    public static void formacion_montaña(char mundoFinal[][]) {
        for (int i = 10; i < 40; i++) {
            for (int j = 10; j < 40; j++) {
                int probI = 10 + (int) (Math.random() * 25);
                int probD = 10 + (int) (Math.random() * 25);
                if (probI == i || probD == j) {
                    mundoFinal[i][j] = 'M';
                }
            }
        }
    }

    public static void formacion_arena(char mundoFinal[][]) {
        for (int i = 5; i < 45; i++) {
            for (int j = 5; j < 45; j++) {
                int prob1 = 5 + (int) (Math.random() * 5);
                int prob2 = 38 + (int) (Math.random() * 4);
                if (i > prob1 && 9 > i) {
                    mundoFinal[i][j] = '#';
                } else if (j > prob2 && j < 43) {
                    mundoFinal[i][j] = '#';
                } else if (prob2 + 4 > i && i > 40) {
                    mundoFinal[i][j] = '#';
                } else if (prob1 > j && j > 2) {
                    mundoFinal[i][j] = '#';
                }
            }
        }
    }

    public static void formacion_caberna(char mundoFinal[][]) {
        for (int i = 10; i < 30; i++) {
            for (int j = 10; j < 30; j++) {
                int prob1 = (int) (Math.random() * 100);
                if (prob1 < 3 && j < 40 && j > 10 && i < 40 && i > 10) {
                    mundoFinal[i][j] = 'O';
                }
            }
        }
    }

    public static void formacion_rio(char mundoFinal[][]) {
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 50; j++) {
                int proba = (int) (Math.random() * 100);
                if (proba < 30 && mundoFinal[i][j] == 'M') {
                    if (i < 25 && i > 15) {
                        int x = i - 1;
                        int y = j - 1;
                        int r = 0;
                        while (r < 10 || mundoFinal[x][y] != 'S') {
                            mundoFinal[x][y] = ',';
                            x--;
                            y--;
                            r++;
                        }
                    } else {
                        int x = i - 1;
                        int y = j - 1;
                        int r = 0;
                        while (r < 10 || mundoFinal[x][y] != 'S') {
                            mundoFinal[x][y] = ',';
                            x++;
                            y++;
                            r++;
                        }
                    }
                }
            }
        }
    }

    public static void formacion_piedrita(char mundoFinal[][], String mundoObjetos[][]) {
        for (int i = 10; i < 30; i++) {
            for (int j = 10; j < 30; j++) {
                int prob1 = (int) (Math.random() * 100);
                if (prob1 < 50 && j < 40 && j > 10 && i < 40 && i > 10) {
                    mundoFinal[i][j] = '.';
                    mundoObjetos[i][j] = "piedritas";
                }
            }
        }
    }

}
