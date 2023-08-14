package br.streams;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStream {

    public static void main(String[] args) {

        final double[] precos = {10,10,32};
        final int[] unidades = {2,5,7};
        final String[] desc = {"chapeu", "bone", "sapato"};

        try {
            DataOutputStream gravarTxt = new DataOutputStream(new FileOutputStream("C:/Users/Pichau/Desktop/AmbienteDev/Programação/UDEMY/Java-Lambdas-Streams-InterfacesGraficas/Sessao 2 Applets Anotacoes e ENTRADA-SAIDA/src/br/streams/TextoBaseadoEmVariaveis.txt"));
            for (int i = 0; i < precos.length; i++) {
                gravarTxt.writeDouble(precos[i]);
                gravarTxt.writeInt(unidades[i]);
                gravarTxt.writeUTF(desc[i]);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
