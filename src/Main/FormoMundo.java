package Main;

import Mundo.juego;
import EntesConMovimiento.Abeja;
import EntesConMovimiento.Ave;
import EntesConMovimiento.Ballena;
import EntesConMovimiento.Billy;
import EntesConMovimiento.Cocodrilo;
import EntesConMovimiento.Insecto;
import EntesConMovimiento.Jabalí;
import EntesConMovimiento.Pes;
import EntesConMovimiento.Simio;
import EntesConMovimiento.Tigre;
import EntesConMovimiento.Venado;
import Mundo.Mundo;
import static Mundo.Mundo.formacion_arena;
import static Mundo.Mundo.formacion_caberna;
import static Mundo.Mundo.formacion_montaña;
import static Mundo.Mundo.formacion_piedrita;
import static Mundo.Mundo.formacion_rio;
import static Mundo.Mundo.formacion_tierra;
import static Mundo.Mundo.imprimir_oceano;
import Mundo.MundoAnimales;
import static Mundo.MundoVegetal.formacion_azucar;
import static Mundo.MundoVegetal.formacion_ballas;
import static Mundo.MundoVegetal.formacion_boniato;
import static Mundo.MundoVegetal.formacion_enebro;
import static Mundo.MundoVegetal.formacion_ginko;
import static Mundo.MundoVegetal.formacion_helecho;
import static Mundo.MundoVegetal.formacion_kava;
import static Mundo.MundoVegetal.formacion_mandioca;
import static Mundo.MundoVegetal.formacion_maracuya;
import static Mundo.MundoVegetal.formacion_palmera;
import static Mundo.MundoVegetal.formacion_pino;
import static Mundo.MundoVegetal.formacion_roble;
import static Mundo.MundoVegetal.formacion_taro;
import static Mundo.MundoVegetal.formacion_tronco;
import Objeto.Objeto;

public class FormoMundo {

    public static char copy(char mundoFinal[][], char matrizAux[][]) {
        for (int i = 0; i < 50; i++) {
            System.arraycopy(mundoFinal[i], 0, matrizAux[i], 0, 50);

        }
        return 0;
    }

    static void creacion_mundo(char mundoFinal[][], char matrizAux[][], String mundoObjetos[][], int tam, Objeto objeto) {

        Mundo.crear_mundo_vacio(mundoFinal);
        Mundo.crear_mundo_vacio(matrizAux);
        juego.crear_mundo_string(mundoObjetos, objeto);

        formacion_tierra(mundoFinal);
        imprimir_oceano(mundoFinal);
        formacion_arena(mundoFinal);
        formacion_caberna(mundoFinal);
        formacion_montaña(mundoFinal);
        formacion_ballas(mundoFinal);
        formacion_mandioca(mundoFinal);
        formacion_ginko(mundoFinal);
        formacion_taro(mundoFinal);
        formacion_piedrita(mundoFinal, mundoObjetos);
        formacion_pino(mundoFinal);
        formacion_azucar(mundoFinal);
        formacion_roble(mundoFinal);
        formacion_palmera(mundoFinal);
        formacion_boniato(mundoFinal);
        formacion_kava(mundoFinal);
        formacion_enebro(mundoFinal);
        formacion_helecho(mundoFinal);
        formacion_maracuya(mundoFinal);
        formacion_tronco(mundoFinal,mundoObjetos);

        Abeja abeja;
        abeja = new Abeja("", "", "", 0, 0, 0, 0);
        MundoAnimales.aparece_abeja(mundoFinal, abeja);

        Ave ave;
        ave = new Ave("", "", "", 0, 0, 0, 0);
        MundoAnimales.aparece_ave(mundoFinal, ave);

        Ballena ballena;
        ballena = new Ballena("", "", "", 0, 0, 0, 0);
        MundoAnimales.aparece_Ballena(mundoFinal, ballena);

        Pes peses;
        peses = new Pes("", "", "", 0, 0, 0, 0);
        MundoAnimales.aparece_pes(mundoFinal, peses);

        Cocodrilo cocodrilo;
        cocodrilo = new Cocodrilo("", "", "", 0, 0, 0, 0);
        MundoAnimales.aparece_coco(mundoFinal, cocodrilo);

        Insecto insecto;
        insecto = new Insecto("", "", "", 0, 0, 0, 0);
        MundoAnimales.aparece_insecto(mundoFinal, insecto);

        Jabalí jabali;
        jabali = new Jabalí("", "", "", 0, 0, 0, 0);
        MundoAnimales.aparece_jabali(mundoFinal, jabali);

        Tigre tigre;
        tigre = new Tigre("", "", "", 0, 0, 0, 0);
        MundoAnimales.aparece_tigre(mundoFinal, tigre);

        Venado venado;
        venado = new Venado("", "", "", 0, 0, 0, 0);
        MundoAnimales.aparece_venado(mundoFinal, venado);

        Simio mono;
        mono = new Simio("", "", "", 0, 0, 0, 0);
        MundoAnimales.aparece_simio(mundoFinal, mono);

        formacion_rio(mundoFinal);

        copy(mundoFinal, matrizAux);


    }

    public static void imprimo_mundo_char(Objeto obje, Billy bil, char mundoFinal[][], String mundoObjetos[][]) {
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 50; j++) {
                System.out.print(mundoFinal[i][j]);
            }
            switch (i) {
                case 3 ->
                    System.out.print("   Mano derecha  : " + obje.objeEnMano[0]);
                case 4 ->
                    System.out.print("   Mano izquierda: " + obje.objeEnMano[1]);
                case 5 ->
                    System.out.print("   En el piso hay: " + mundoObjetos[bil.pos1][bil.pos2]);
            }
            System.out.print("\n");
        }
    }
    
}

