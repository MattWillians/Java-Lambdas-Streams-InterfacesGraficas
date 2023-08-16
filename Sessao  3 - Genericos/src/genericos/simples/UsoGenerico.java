package genericos.simples;

public class UsoGenerico {
    public static void main(String[] args) {
        ExemploGenerico<Integer> objGenerico = new ExemploGenerico<Integer>(99);
        objGenerico.showType();

        Integer v = objGenerico.getObj();
        System.out.println("Valor de V: "+ v);

        ExemploGenerico<String> objetoGenerico2 = new ExemploGenerico<String>("Matheus");
        objetoGenerico2.showType();

        String s = objetoGenerico2.getObj();
        System.out.println("Valor de s: "+ s);

    }
}
