package collections.hashsets;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetApp {
    public static void main(String[] args) {
        Set<String> lista3 = new TreeSet<>();
        lista3.add("Teclado");
        lista3.add("Mouse");
        lista3.add("Computador");
        lista3.add("Headset");
        lista3.add("Mouse");
        System.out.println(lista3);
    }
}
