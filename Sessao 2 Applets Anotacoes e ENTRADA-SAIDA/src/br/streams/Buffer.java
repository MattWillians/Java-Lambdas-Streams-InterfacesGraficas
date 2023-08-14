package br.streams;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Buffer {
    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); //MUITO MAIS FACIL USAR O JAVA SCANNER

        String telaPreta = "";
        System.out.println("Digite Algo: ");

        try {
            telaPreta = in.readLine();
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Digitamos: "+ telaPreta);
    }
}
