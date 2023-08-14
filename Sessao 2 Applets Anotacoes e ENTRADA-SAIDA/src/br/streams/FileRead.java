package br.streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileRead {
    public static void main(String[] args) {

        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("C:/Users/Pichau/Desktop/AmbienteDev/Programação/UDEMY/Java-Lambdas-Streams-InterfacesGraficas/Sessao 2 Applets Anotacoes e ENTRADA-SAIDA/src/br/streams/TextoLegal.txt");
            out = new FileOutputStream("C:/Users/Pichau/Desktop/AmbienteDev/Programação/UDEMY/Java-Lambdas-Streams-InterfacesGraficas/Sessao 2 Applets Anotacoes e ENTRADA-SAIDA/src/br/streams/TextoLegal (copy).txt");
            int c;
            while ((c = in.read()) != -1){
                out.write(c);
            }
        } catch (Exception e){
            System.out.println("Messagem"+ e.getMessage());
        }
    }
}
