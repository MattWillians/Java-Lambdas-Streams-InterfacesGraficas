package collections.arraylist;

import java.util.ArrayList;

public class ArrayListApp {
    public static void main(String[] args) {

        ArrayList<Notes> myBook = new ArrayList<>();

        myBook.add(new Notes("Buy Bread"));
        myBook.add(new Notes("Sell Car"));
        myBook.add(new Notes("11:30 MTG"));

        for (Notes notes : myBook) {
            System.out.println(notes.note);
        }
    }



}
