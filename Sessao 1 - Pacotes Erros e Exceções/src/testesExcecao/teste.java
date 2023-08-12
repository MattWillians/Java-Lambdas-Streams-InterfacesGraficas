package testesExcecao;

public class teste {
    public static void main(String[] args) {
        Integer[] numeros = {1,2,43,5,65,3,4,56,7};
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(numeros[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array fora do tamanho comum");
        }
    }
}
