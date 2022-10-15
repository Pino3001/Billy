package Objeto;


public class Alimentos extends Recolectable{
    protected String nomAlim;
    protected int daAlRecolectar;
    protected boolean sePuedeCocinar;
    
    public int baja_hambre(){
                
        return 0;
                
    }
    
    public int sube_fuerza(){
        
        return 0;
        
    }
    
    public int sube_alegria(){
        
        return 0;
        
    }

    @Override
    public void se_recolecta_con() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }



    
}
