package collection.exercicio;

import java.util.LinkedHashMap;
import java.util.List;

public class LojaVirtual {

    private static LojaVirtual instanciaLoja;

    private LinkedHashMap<Cliente, List<Curso>> relacaoDeCursos;

    public LojaVirtual() {
        this.relacaoDeCursos = new LinkedHashMap<>();
    }

    public LinkedHashMap<Cliente, List<Curso>> getRelacaoDeCursos() {
        return relacaoDeCursos;
    }

    public static LojaVirtual getInstance() {
        if (instanciaLoja == null){
            instanciaLoja = new LojaVirtual();
        }
        return instanciaLoja;
    }
}
