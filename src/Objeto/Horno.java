package Objeto;

import EntesConMovimiento.Billy;
import java.util.ArrayList;
import java.util.List;


public class Horno {
    protected String alimentoGenerado;
    protected int cantidadDeLeña;
    public List<Integer> cantHorno = new ArrayList<>();
    public int numero = 0;
    
    public void lo_crafteo_baul(Horno horno, Billy billy, char mundo[][]) {
        int lugar1 = billy.pos1;
        int lugar2 = billy.pos2;
        int x = lugar1 - 6;
        int y = lugar2 - 6;
        int cantBarro = 0, cantArcilla = 0, cantPiedra = 0;
        for (int i = x; i < lugar1 + 6; i++) {
            for (int j = y; j < lugar2 + 6; j++) {
                if (mundo[i][j] == 't' && cantBarro < 10) {//si hay una barro y no tengo las que necesito
                    cantBarro++;
                    mundo[i][j] = '.';//quito el tronco del suelo
                }
                if (mundo[i][j] == 'T' && cantArcilla < 6) {//si hay una arcilla y no tengo las que necesito
                    cantArcilla++;
                    mundo[i][j] = '.';//quito el tronco del suelo
                }
                if (mundo[i][j] == 'p' && cantPiedra < 10) {//si hay un piedra y no tengo las que necesito
                    cantPiedra++;
                    mundo[i][j] = '.';//quito el tronco del s
                }
            }
        }
        if (cantBarro == 10 && cantArcilla == 6 && cantPiedra == 10) {
            horno.cantHorno.add(horno.numero + 1);
            mundo[billy.pos1][billy.pos2] = 'B';//baul en el lugar
            horno.numero++;
        }
    }
    
    public void genera_estos_alimentos(){
        
    }
    
    public void se_enciende_con(){
        
    }
    
    public void se_apaga_cuando(){
        
    }
}
