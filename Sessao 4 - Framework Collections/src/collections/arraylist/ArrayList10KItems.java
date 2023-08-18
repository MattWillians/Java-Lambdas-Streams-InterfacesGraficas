package collections.arraylist;

import java.util.ArrayList;

public class ArrayList10KItems {
    public static void main(String[] args) {

        ArrayList<Integer> teste = new ArrayList<>();

        for (int i = 0; i < 10.000; i++) {
            teste.add(i);
        }
        System.out.println(System.currentTimeMillis());
    }
}
