package collections.linkedhashmap;
import java.util.LinkedHashMap;

public class LinkedHashMapApp {
    public static void main(String[] args) {
        LinkedHashMap<String, String> dicionarioMapa = new LinkedHashMap<>();

        dicionarioMapa.put("Estilo", "Social");
        dicionarioMapa.put("Tamanho", "GG");
        dicionarioMapa.put("Tecido", "Couro");
        dicionarioMapa.put("Disponivel?", "Sim");
        System.out.println(dicionarioMapa);
    }
}