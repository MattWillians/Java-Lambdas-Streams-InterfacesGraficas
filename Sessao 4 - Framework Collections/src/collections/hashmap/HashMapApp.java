package collections.hashmap;

import java.util.HashMap;

public class HashMapApp {
    public static void main(String[] args) {
        HashMap<String, String> dicionarioMapa = new HashMap<>();

        dicionarioMapa.put("Estilo", "Social");
        dicionarioMapa.put("Tamanho", "GG");
        dicionarioMapa.put("Tecido", "Couro");
        dicionarioMapa.put("Disponivel?", "Sim");
        System.out.println(dicionarioMapa);
    }
}
