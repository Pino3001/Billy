package Objeto;

public class Fuego extends Objeto {

    public int intencidad;
    protected int calorGenerado;
    protected int dañoAlContacto;
    protected int ilumina;
    protected String cocinaEstosAli;

    public Fuego(int intencidad, int calorGenerado, int dañoAlContacto, int ilumina, String cocinaEstosAli) {
        this.intencidad = intencidad;
        this.calorGenerado = calorGenerado;
        this.dañoAlContacto = dañoAlContacto;
        this.ilumina = ilumina;
        this.cocinaEstosAli = cocinaEstosAli;
    }

    public void setIntencidad(int intencidad, int calorGenerado, int dañoAlContacto, int ilumina) {
        switch (this.intencidad) {
            case 0 -> {
                this.calorGenerado = 0;
                this.dañoAlContacto = 0;
                this.ilumina = 0;
            }
            case 1 -> {
                this.calorGenerado = 1;
                this.dañoAlContacto = 1;
                this.ilumina = 1;
            }
            case 2 -> {
                this.calorGenerado = 1;
                this.dañoAlContacto = 1;
                this.ilumina = 1;
            }
            case 3 -> {
                this.calorGenerado = 3;
                this.dañoAlContacto = 3;
                this.ilumina = 3;
            }
            case 4 -> {
                this.calorGenerado = 4;
                this.dañoAlContacto = 4;
                this.ilumina = 4;
            }
            case 5 -> {
                this.calorGenerado = 5;
                this.dañoAlContacto = 5;
                this.ilumina = 5;
            }
            default -> {
            }
        }

    }

    public void setCalorGenerado(int calorGenerado) {
        this.calorGenerado = calorGenerado;
    }

    public void setDañoAlContacto(int dañoAlContacto) {

    }

    public void setIlumina(int ilumina) {

    }

    public void setCocinaEstosAli(String cocinaEstosAli) {
        this.cocinaEstosAli = cocinaEstosAli;
    }

    public void se_genera_con() {

    }

    public void hace_daño_si() {

    }

    public void ilumina_con() {

    }
}
