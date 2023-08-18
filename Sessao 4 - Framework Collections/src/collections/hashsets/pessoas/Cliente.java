package collections.hashsets.pessoas;

import java.util.HashSet;
import java.util.Set;

public class Cliente {

    public static Set<Curso> listCurso = new HashSet<>();

    public static void main(String[] args) {
        listCurso.add(new Curso("Curso"));
        listCurso.add(new Curso("Matematica"));
        listCurso.add(new Curso("Portugues"));
    }
}
