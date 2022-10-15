package EntesConMovimiento;

public abstract class Personaje {

    protected String nombre;
    protected float salud;
    protected float fuerza;
    protected float estres;
    protected float ira;
    protected float alegria;
    protected float perspicacia;
    public int pos1;
    public int pos2;
    public int posA1;
    public int posA2;
    public int posE1;
    public int posE2;

    public Personaje(String nombre, float salud, float fuerza, int estres, int ira, int alegria, int perspicacia, int pos1, int pos2, int posA1, int posA2, int posE1, int posE2) {
        this.nombre = nombre;
        this.salud = salud;
        this.fuerza = fuerza;
        this.estres = estres;
        this.ira = ira;
        this.alegria = alegria;
        this.perspicacia = perspicacia;
        this.pos1 = pos1;
        this.pos2 = pos2;
        this.posA1 = posA1;
        this.posA2 = posA2;
        this.posE1 = posE1;
        this.posE2 = posE2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setAtributos(float salud, float fuerza, float estres, float ira, float alegria, float perspicacia) {
        this.salud = 60;
        this.fuerza = 60;
        this.estres = 60;
        this.ira = 60;
        this.alegria = 60;
        this.perspicacia = 60;
    }
    
    
    public abstract int movimiento(char mundoFinal[][], char matrizAux[][], Billy billy, int tam, PersonajeMovimiento perso, char mov);

    public abstract int poder_ataque();

    public abstract int velocidad_movimiento();

    public abstract void probabilidad_de_enfermedad();

    public abstract float velocidad_de_talado();

    public abstract float velocidad_de_minado();

    public abstract float velocidad_de_recoleccion();

    public abstract float probabilidad_de_pesca();

    public abstract boolean muere_si();

    public abstract void capacidad_de_la_imaginacion();

    public abstract int velocidad_limpieza();

    public abstract int resistencia();

    public abstract void tolerancia_al_clima();

}
