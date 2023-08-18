package collections.hashsets;

import java.util.HashSet;

public class HashSetApp {
    public static void main(String[] args) {
        HashSet<String> lista = new HashSet<>();
        lista.add("Vermelho");
        lista.add("Verde");
        lista.add("Vermelho");
        lista.add("Amarelo");
        lista.add("Roxo");
        System.out.println(lista);
    }
}
