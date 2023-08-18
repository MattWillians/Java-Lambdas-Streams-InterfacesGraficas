package collections.arraylist;

import java.util.LinkedList;

public class LinkedList10Kitems {
    public static void main(String[] args) {

        LinkedList<Integer> teste = new LinkedList();

        for (int i = 0; i < 10.000; i++) {
            teste.add(i);
        }
        double tempo = System.currentTimeMillis();
        System.out.printf("%.2f",tempo);
    }

}
