package Main;

import EntesConMovimiento.Billy;
import static Main.FormoMundo.imprimo_mundo_char;
import static Mundo.MundoAnimales.aparece_billy;
import Objeto.Objeto;
import Mundo.juego;
import Objeto.MesaTrabajo;
import EntesConMovimiento.PersonajeMovimiento;
import Objeto.Fogata;
import java.util.Scanner;

public class MainMundo {

    public static void main(String args[]) {

        char[][] mundoFinal = new char[500][500];
        char[][] matrizAux = new char[500][500];
        String[][] mundoObjetos = new String[500][500];
        int tam = 50;
        Scanner sc = new Scanner(System.in);

        PersonajeMovimiento perso;
        perso = new PersonajeMovimiento();

        juego juego;
        juego = new juego();

        Objeto obje;
        obje = new Objeto();

        MesaTrabajo mesa;
        mesa = new MesaTrabajo();
        
        Fogata fogata;
        fogata = new Fogata();

        FormoMundo.creacion_mundo(mundoFinal, matrizAux, mundoObjetos, tam, obje);

        Billy billy;
        billy = new Billy("", tam, tam, tam, tam, tam, tam, 0, 0, tam, tam, tam, tam);
        aparece_billy(mundoFinal, billy);

        System.out.print("\n");
        imprimo_mundo_char(obje,billy, mundoFinal,mundoObjetos);

        int mov = 1;
        do {
            boolean suelto = false;

            System.out.println("Para realizar cualquier interaccion precione la C, de lo contrario solo muevase por el mapa.");
            char interaccion = sc.next().charAt(0);
            if (interaccion == 'c' || interaccion == 'C') {
                System.out.println("""
                                   [y]Recoger objetos precione.
                                   [x]Craftear mesas.
                                   [q]Soltar objetos mano izquierda/ [e] mano derecha.
                                   [t]Si desea cortar un arbol enfrentece a el y precione.
                                   [i]Interactuar con la mesa.""");
                char opciones = sc.next().charAt(0);
                switch (opciones) {
                    case 't' -> {
                        if (mov == 1) {
                            juego.uso_hacha(billy, obje, mundoFinal, mundoObjetos, matrizAux, perso, opciones);
                            imprimo_mundo_char(obje,billy, mundoFinal,mundoObjetos);
                        }
                    }
                    case 'y' -> {
                        juego.recojo_suelo(obje, mundoObjetos, billy);
                        imprimo_mundo_char(obje,billy, mundoFinal,mundoObjetos);
                    }
                    case 'q', 'e' -> {
                        suelto = juego.suelto_objeto(obje, billy, mundoObjetos);
                        if (suelto) {
                            imprimo_mundo_char(obje,billy, mundoFinal,mundoObjetos);
                        }
                    }
                    case 'x' ->{
                        juego.que_crafteo(mesa, fogata, billy, mundoObjetos, mundoFinal, matrizAux);                        
                        imprimo_mundo_char(obje,billy, mundoFinal,mundoObjetos);
                    }
                    case 'i' -> {
                        if("mesaTrabajo".equals(mundoObjetos[billy.pos1][billy.pos2])){
                            juego.interactuo_mesaTra(mesa, obje, billy, mundoObjetos);
                        } else
                            System.out.println("NaNaNa, debe haber una mesa de trabajo para poder usarla.");
                    }
                    default -> {
                    }
                }
            } else {
                sc.nextLine();
                mov = billy.movimiento(mundoFinal, matrizAux, billy, tam, perso, interaccion);
                imprimo_mundo_char(obje,billy, mundoFinal,mundoObjetos);
            }
        } while (mov < 3);
    }
}
