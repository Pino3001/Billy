package Objeto.Armas;

import EntesConMovimiento.Billy;
import Mundo.MundoAnimales;
import Objeto.MesaTrabajo;

public abstract class Lanza extends MesaTrabajo {

    protected int daño;
    protected int alcance;
    protected int eficiencia;
    protected float duracion;

    public void setEficiencia(int eficiencia) {
        this.eficiencia = 30;
    }

    public void setDaño(int daño) {
        this.daño = 30;
    }   
    
    public int ataco_con_lanza(MundoAnimales animales, char mundoFinal[][], Billy bil) {
        int efi = (int) (Math.random() * 100);

        if (animales.puedo_atacar(mundoFinal, bil)) {
            if (eficiencia < efi) {
                duracion -= 20.5;
                return daño;
            }
        }
        return 0;
    }

    public abstract void se_rompe_cuando(Lanza lanzas);

}
