package Objeto;


import Almacen.Herrero;
import EntesConMovimiento.Billy;


public class Herreria extends Crafteables{

    
    public void lo_crafteo_baul(Herrero herra, Billy billy, char mundo[][]) {
        int lugar1 = billy.pos1;
        int lugar2 = billy.pos2;
        int x = lugar1 - 6;
        int y = lugar2 - 6;
        int cantTroncos = 0, cantPiedra = 0, cantMadPalmera = 0, cantTablas = 0;
        for (int i = x; i < lugar1 + 6; i++) {
            for (int j = y; j < lugar2 + 6; j++) {
                if (mundo[i][j] == 'T' && cantTroncos < 3) {//si hay una tronco y no tengo las que necesito
                    cantTroncos++;
                    mundo[i][j] = '.';//quito el tronco del suelo
                }
                if (mundo[i][j] == 'P' && cantPiedra < 8) {//si hay una piedra y no tengo las que necesito
                    cantPiedra++;
                    mundo[i][j] = '.';//quito el tronco del suelo
                }
                if (mundo[i][j] == 'y' && cantMadPalmera < 4) {//si hay un maderapalmera y no tengo las que necesito
                    cantMadPalmera++;
                    mundo[i][j] = '.';//quito el tronco del s
                }
                if (mundo[i][j] == 't' && cantTablas < 6) {//si hay un tabla y no tengo las que necesito
                    cantMadPalmera++;
                    mundo[i][j] = '.';//quito el tronco del suelo
                }
            }
        }
        if (cantTroncos == 3 && cantPiedra == 8 && cantMadPalmera == 4 && cantTablas == 6) {
            herra.cantHerre.add(herra.numeroHer + 1);
            mundo[billy.pos1][billy.pos2] = 'A';//Arqueria en el lugar
            herra.numeroHer++;
        }
    }
    


}
