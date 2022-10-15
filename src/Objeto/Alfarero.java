package Objeto;

import Almacen.Baul;
import EntesConMovimiento.Billy;
import java.util.ArrayList;
import java.util.List;

public class Alfarero extends Crafteables {

    public List<Integer> cantBaul = new ArrayList<>();
    public int numero = 0;

    public void lo_crafteo_baul(Alfarero alfare, Billy billy, char mundo[][]) {
        int lugar1 = billy.pos1;
        int lugar2 = billy.pos2;
        int x = lugar1 - 6;
        int y = lugar2 - 6;
        int cantTablones = 0, cantTronco = 0, cantPiedra = 0, cantLiana = 0;
        for (int i = x; i < lugar1 + 6; i++) {
            for (int j = y; j < lugar2 + 6; j++) {
                if (mundo[i][j] == 't' && cantTablones < 4) {//si hay una tabla y no tengo las que necesito
                    cantTablones++;
                    mundo[i][j] = '.';//quito el tronco del suelo
                }
                if (mundo[i][j] == 'T' && cantTronco < 2) {//si hay una tronco y no tengo las que necesito
                    cantTronco++;
                    mundo[i][j] = '.';//quito el tronco del suelo
                }
                if (mundo[i][j] == 'p' && cantPiedra < 4) {//si hay un piedra y no tengo las que necesito
                    cantPiedra++;
                    mundo[i][j] = '.';//quito el tronco del s
                }
                if (mundo[i][j] == 'l' && cantLiana < 4) {//si hay un liana y no tengo las que necesito
                    cantLiana++;
                    mundo[i][j] = '.';//quito el tronco del suelo
                }
            }
        }
        if (cantTablones == 12 && cantTronco == 2 && cantPiedra == 4 && cantLiana == 4) {
            alfare.cantBaul.add(alfare.numero + 1);
            mundo[billy.pos1][billy.pos2] = 'B';//baul en el lugar
            alfare.numero++;
        }
    }

    public void los_objetos_sirven_para() {

    }

    public void con_los_objetos_obtengo() {

    }



}
