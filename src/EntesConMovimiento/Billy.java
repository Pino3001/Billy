package EntesConMovimiento;

import static EntesConMovimiento.PersonajeMovimiento.se_mueve_si;

public class Billy extends Personaje {



    @Override
    public int movimiento( char mundoFinal[][], char matrisAux[][], Billy billy, int tam, PersonajeMovimiento perso, char mov) {
        boolean movi = false;        
        billy.posA1 = billy.pos1;
        billy.posA2 = billy.pos2;
        
        movi = se_mueve_si(mundoFinal,matrisAux, billy, tam, perso, mov);
        if (movi) {
            mundoFinal[billy.posA1][billy.posA2] = matrisAux[posA1][posA2];
            mundoFinal[billy.pos1][billy.pos2] = 'B';
            return 0;
        } else if (mundoFinal[billy.pos1][billy.pos2] == mundoFinal[billy.posA1][billy.posA2]){
            return 1;
        } else
            return 2;
    }
    
    
    
    
    public Billy(String nombre, float salud, float fuerza, int estres, int ira, int alegria, int perspicacia, int pos1, int pos2, int posA1, int posA2, int posE1, int posE2) {
        super(nombre, salud, fuerza, estres, ira, alegria, perspicacia, pos1, pos2, posA1, posA2, posE1, posE2);
    }

    @Override
    public int poder_ataque() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int velocidad_movimiento() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void probabilidad_de_enfermedad() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public float velocidad_de_talado() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public float velocidad_de_minado() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public float velocidad_de_recoleccion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public float probabilidad_de_pesca() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean muere_si() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void capacidad_de_la_imaginacion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int velocidad_limpieza() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int resistencia() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void tolerancia_al_clima() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
