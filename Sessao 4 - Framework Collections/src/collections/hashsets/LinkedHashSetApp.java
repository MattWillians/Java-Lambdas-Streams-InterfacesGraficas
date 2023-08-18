package collections.hashsets;

import java.util.LinkedHashSet;

public class LinkedHashSetApp {
    public static void main(String[] args) {
        LinkedHashSet<String> lista2 = new LinkedHashSet<>();
        lista2.add("Carro");
        lista2.add("Carro");
        lista2.add("Moto");
        lista2.add("Avião");
        lista2.add("Barco");
        System.out.println(lista2);
    }
}
