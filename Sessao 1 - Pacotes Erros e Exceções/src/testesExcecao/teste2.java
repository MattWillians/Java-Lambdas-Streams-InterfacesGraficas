package testesExcecao;
import java.io.*;

public class teste2 {
    public static void main(String[] args) {
        
        byte[] bytes = new byte[10];
        System.out.println("digite algo: ");

        try {
            System.in.read(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("\nEco: "+ new String(bytes));
    }
}
