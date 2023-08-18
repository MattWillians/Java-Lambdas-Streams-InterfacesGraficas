package collection.exercicio;
//Cursos disponiveis no Site
//Cadastrar Cliente
//Criar Lista de cursos do cliente
//fazer checkout dos cursos escolhidos

import java.nio.file.Path;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {

        LojaVirtual lojaCursos = LojaVirtual.getInstance();
        LinkedHashMap<Cliente, List<Curso>> cursosClientes = lojaCursos.getRelacaoDeCursos();

        List<Curso> cursosUser = new LinkedList<>();

        Cliente user = new Cliente("5003234352","Matt","matt@algumacoisa.com");
        cursosUser.add(new Curso(1109, "Curso de Java 8", 1999.0, Path.of("/java8")));

        cursosClientes.put(user , cursosUser);

        System.out.println(cursosClientes.toString());
    }
}
