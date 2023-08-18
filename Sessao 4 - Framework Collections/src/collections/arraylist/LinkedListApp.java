package collections.arraylist;


import java.util.LinkedList;

public class LinkedListApp {

    public static void main(String[] args) {

        LinkedList<Notes> myBook = new LinkedList<>();

        myBook.add(new Notes("Buy Bread"));
        myBook.add(new Notes("Sell Car"));
        myBook.add(new Notes("11:30 MTG"));

        for (Notes notes : myBook) {
            System.out.println(notes.note);
        }
    }
}
