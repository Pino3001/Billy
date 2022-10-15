
package Objeto;

import Almacen.Baul;
import EntesConMovimiento.Billy;

public class CrafBaul extends Crafteables{
    

    public void lo_crafteo_baul(Baul baul, Billy billy, char mundo[][]) {
        int lugar1 = billy.pos1;
        int lugar2 = billy.pos2;
        int x = lugar1 - 6;
        int y = lugar2 - 6;
        int cantTablones = 0, cantArcilla = 0, cantClavos = 0;
        for (int i = x; i < lugar1 + 6; i++) {
            for (int j = y; j < lugar2 + 6; j++) {
                if (mundo[i][j] == 't' && cantTablones < 12) {//si hay una tabla y no tengo las que necesito
                    cantTablones++;
                    mundo[i][j] = '.';//quito el tronco del suelo
                }
                if (mundo[i][j] == 'a' && cantArcilla < 8) {//si hay una arcilla y no tengo las que necesito
                    cantArcilla++;
                    mundo[i][j] = '.';//quito el tronco del suelo
                }
                if (mundo[i][j] == 'c' && cantClavos < 4) {//si hay un clavo y no tengo las que necesito
                    cantClavos++;
                    mundo[i][j] = '.';//quito el tronco del s
                }
            }
        }
        if (cantTablones == 12 && cantArcilla == 3 && cantClavos == 4) {
            baul.cantBaul.add(baul.numero + 1);
            mundo[billy.pos1][billy.pos2] = 'B';//baul en el lugar
            baul.numero ++;
        }
    }

 

}
