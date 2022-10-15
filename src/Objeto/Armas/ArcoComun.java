package Objeto.Armas;

public class ArcoComun extends Arco {

    public void setTipoDeArco(String tipoDeArco) {
        this.tipoDeArco = "Arco";
    }

    public void setRangoDisparo(int rangoDisparo) {
        this.rangoDisparo = 6;
    }

    public void setDañoDisparo(int dañoDisparo) {
        this.dañoDisparo = 7;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public void setEficienciaAtaque(int eficienciaAtaque) {
        this.eficienciaAtaque = 10;
    }

    
    
    
    @Override
    public void se_rompe_si(Arco arcoComun) {
        //arcoComun.duracion = duracion - Ataque();
        if (duracion < 1) {
            //borrar arco de la mano;
        }

    }

}
