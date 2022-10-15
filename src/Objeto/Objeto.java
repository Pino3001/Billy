package Objeto;

import EntesConMovimiento.Billy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Objeto {

    public HashMap<String, ArrayList<String>> ObjetoMap;
    public List<String> TipoMadera = new ArrayList<>();
    public List<String> TipoMineral = new ArrayList<>();
    public List<String> TipoAlimento = new ArrayList<>();
    public List<String> ObjetosVarios = new ArrayList<>();
    public String[] objeEnMano = new String[2];

    public String[] getObjeEnMano() {
        return objeEnMano;
    }

    public void creo_mapa_objetos() {

        ObjetoMap = new HashMap<>();
        ObjetoMap.put("madera", (ArrayList) TipoMadera);
        ObjetoMap.put("mineral", (ArrayList) TipoMineral);
        ObjetoMap.put("alimento", (ArrayList) TipoAlimento);
        ObjetoMap.put("varios", (ArrayList) ObjetosVarios);

    }

    public void Listar_tipo_madera(Objeto obje) {

        obje.TipoMadera.add("tronco");
        obje.TipoMadera.add("ramas");
        obje.TipoMadera.add("ramasHelecho");
        obje.TipoMadera.add("maderaGinko");
        obje.TipoMadera.add("maderaEnebro");
        obje.TipoMadera.add("maderaPalmera");
        obje.TipoMadera.add("maderaPino");
        obje.TipoMadera.add("maderaRoble");

    }

    public void Listar_tipo_mineral(Objeto obje) {
        obje.TipoMineral.add("piedritas");
        obje.TipoMineral.add("arcilla");
        obje.TipoMineral.add("tierra");
        obje.TipoMineral.add("mineralDEhierro");
        obje.TipoMineral.add("roca");
        obje.TipoMineral.add("Arena");
    }

    public void Listar_tipo_alimento(Objeto obje) {

        obje.TipoAlimento.add("Coco");
        obje.TipoAlimento.add("huevos");
        obje.TipoAlimento.add("bellota");
        obje.TipoAlimento.add("ballaEnebro");
        obje.TipoAlimento.add("frutoTaro");
        obje.TipoAlimento.add("carnePescado");
        obje.TipoAlimento.add("carneAve");
        obje.TipoAlimento.add("carneVenado");
        obje.TipoAlimento.add("carneJabali");
        obje.TipoAlimento.add("Ballas");
        obje.TipoAlimento.add("caniAzucar");
        obje.TipoAlimento.add("Maracuya");
        obje.TipoAlimento.add("insectoComesti");
        obje.TipoAlimento.add("miel");
        obje.TipoAlimento.add("Boniato");
        obje.TipoAlimento.add("Mandioca");
        obje.TipoAlimento.add("raizKava");
        obje.TipoAlimento.add("hojasGinko");
        obje.TipoAlimento.add("aguaRio");

    }

    public void Listar_tipo_varios(Objeto obje) {

        obje.ObjetosVarios.add("liana");
        obje.ObjetosVarios.add("aguaSalada");
        obje.ObjetosVarios.add("semillaPino");
        obje.ObjetosVarios.add("cuerpoTigre");
        obje.ObjetosVarios.add("cuernoVenado");
        obje.ObjetosVarios.add("plumasAve");
        obje.ObjetosVarios.add("aceiteBallena");
        obje.ObjetosVarios.add("dienteCocodri");
        obje.ObjetosVarios.add("pielCocodri");
        obje.ObjetosVarios.add("tabla");
        obje.ObjetosVarios.add("hacha");

    }

    public void me_fijo_igual(Objeto objeto) {
        objeto.creo_mapa_objetos();

    }

    public String objeto_mano_derecha(String mundoObjetos[][], Billy bil) {

        for (int i = 0; i < TipoMadera.size(); i++) {
            if (mundoObjetos[bil.pos1][bil.pos2].equals(TipoMadera.get(i))) {
                objeEnMano[0] = mundoObjetos[bil.pos1][bil.pos2];
                return objeEnMano[0];
            }
        }
        for (int i = 0; i < TipoMineral.size(); i++) {
            if (mundoObjetos[bil.pos1][bil.pos2].equals(TipoMineral.get(i))) {
                objeEnMano[0] = mundoObjetos[bil.pos1][bil.pos2];
                return objeEnMano[0];
            }
        }
        for (int i = 0; i < TipoAlimento.size(); i++) {
            if (mundoObjetos[bil.pos1][bil.pos2].equals(TipoAlimento.get(i))) {
                objeEnMano[0] = mundoObjetos[bil.pos1][bil.pos2];
                return objeEnMano[0];
            }
        }
        for (int i = 0; i < ObjetosVarios.size(); i++) {
            if (mundoObjetos[bil.pos1][bil.pos2].equals(ObjetosVarios.get(i))) {
                objeEnMano[0] = mundoObjetos[bil.pos1][bil.pos2];
                return objeEnMano[0];
            }
        }
        return null;
    }

    public String objeto_mano_izquierda(String mundoObjetos[][], Billy bil) {

        for (int i = 0; i < TipoMadera.size(); i++) {
            if (mundoObjetos[bil.pos1][bil.pos2].equals(TipoMadera.get(i))) {
                objeEnMano[1] = mundoObjetos[bil.pos1][bil.pos2];
                return objeEnMano[1];
            }
        }
        for (int i = 0; i < TipoMineral.size(); i++) {
            if (mundoObjetos[bil.pos1][bil.pos2].equals(TipoMineral.get(i))) {
                objeEnMano[1] = mundoObjetos[bil.pos1][bil.pos2];
                return objeEnMano[1];
            }
        }
        for (int i = 0; i < TipoAlimento.size(); i++) {
            if (mundoObjetos[bil.pos1][bil.pos2].equals(TipoAlimento.get(i))) {
                objeEnMano[1] = mundoObjetos[bil.pos1][bil.pos2];
                return objeEnMano[1];
            }
        }
        for (int i = 0; i < ObjetosVarios.size(); i++) {
            if (mundoObjetos[bil.pos1][bil.pos2].equals(ObjetosVarios.get(i))) {
                objeEnMano[1] = mundoObjetos[bil.pos1][bil.pos2];
                return objeEnMano[1];
            }
        }
        return null;
    }

    public boolean hay_objeto(String mundoObjetos[][], Billy bil, Objeto objeto) {

        Listar_tipo_varios(objeto);
        Listar_tipo_alimento(objeto);
        Listar_tipo_alimento(objeto);
        Listar_tipo_madera(objeto);

        for (int i = 0; i < TipoMadera.size(); i++) {
            if (mundoObjetos[bil.pos1][bil.pos2].equals(TipoMadera.get(i))) {
                return true;
            }
        }
        for (int i = 0; i < TipoMineral.size(); i++) {
            if (mundoObjetos[bil.pos1][bil.pos2].equals(TipoMineral.get(i))) {
                return true;
            }
        }
        for (int i = 0; i < TipoAlimento.size(); i++) {
            if (mundoObjetos[bil.pos1][bil.pos2].equals(TipoAlimento.get(i))) {
                return true;
            }
        }
        for (int i = 0; i < ObjetosVarios.size(); i++) {
            if (mundoObjetos[bil.pos1][bil.pos2].equalsIgnoreCase(ObjetosVarios.get(i))) {
                return true;
            }
        }
        return false;
    }

}
