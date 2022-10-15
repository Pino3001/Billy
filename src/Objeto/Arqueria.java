package Objeto;

import Almacen.MesaArqueros;
import EntesConMovimiento.Billy;

public class Arqueria extends Crafteables {

    public void lo_crafteo_baul(MesaArqueros mesaA, Billy billy, char mundo[][]) {
        int lugar1 = billy.pos1;
        int lugar2 = billy.pos2;
        int x = lugar1 - 6;
        int y = lugar2 - 6;
        int cantTroncos = 0, cantArcilla = 0, cantMadPalmera = 0;
        for (int i = x; i < lugar1 + 6; i++) {
            for (int j = y; j < lugar2 + 6; j++) {
                if (mundo[i][j] == 'T' && cantTroncos < 2) {//si hay una tronco y no tengo las que necesito
                    cantTroncos++;
                    mundo[i][j] = '.';//quito el tronco del suelo
                }
                if (mundo[i][j] == 'a' && cantArcilla < 8) {//si hay una arcilla y no tengo las que necesito
                    cantArcilla++;
                    mundo[i][j] = '.';//quito el tronco del suelo
                }
                if (mundo[i][j] == 'y' && cantMadPalmera < 4) {//si hay un maderapalmera y no tengo las que necesito
                    cantMadPalmera++;
                    mundo[i][j] = '.';//quito el tronco del s
                }
            }
        }
        if (cantTroncos == 1 && cantArcilla == 8 && cantMadPalmera == 4) {
            mesaA.cantArquero.add(mesaA.numeroAr + 1);
            mundo[billy.pos1][billy.pos2] = 'A';//Arqueria en el lugar
            mesaA.numeroAr ++;
        }
    }




}
