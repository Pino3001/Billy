package EntesConMovimiento;


public abstract class Animales {
    protected String tipo;
    protected  String bioma;
    protected String tipoDaño;
    protected int poderAtaque;
    protected int defensa;
    protected float salud;
    protected int movimiento;
    

    public Animales(String tipo, String bioma, String tipoDaño, int poderAtaque, int defensa, float salud, int movimiento) {
        this.tipo = tipo;
        this.bioma = bioma;
        this.tipoDaño = tipoDaño;
        this.poderAtaque = poderAtaque;
        this.defensa = defensa;
        this.salud = salud;
        this.movimiento = movimiento;
    }

    public String getTipo() {
        return tipo;
    }

    public String getBioma() {
        return bioma;
    }

    public String getTipoDaño() {
        return tipoDaño;
    }

    public int getPoderAtaque() {
        return poderAtaque;
    }

    public int getDefensa() {
        return defensa;
    }

    public float getSalud() {
        return salud;
    }

    public int getMovimiento() {
        return movimiento;
    }
    
    public abstract int daño_verdadero();
    
    public abstract int movimiento();
    
    public abstract void como_cazarlo();
    
    public abstract void como_alimentarlo();
    
    public abstract void recurzos_obtenidos();
        
    public int probabilidad_animal(){            
        int proba = (int) (Math.random() * 100);
        return proba;
    }
          
          
}
