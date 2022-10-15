package Objeto.Armas;

import Objeto.Arqueria;


public abstract class Arco extends Arqueria{
    protected String tipoDeArco;
    protected int rangoDisparo;
    protected int dañoDisparo;
    protected float duracion;
    protected int eficienciaAtaque;
    
    public abstract void se_rompe_si(Arco arcos);
        
    
    public boolean hace_daño_si(){
        
        return false;
        
    }
    
    
}
