package genericos.definidos;

public class ManipulacaoDeGenericos {
    public static void main(String[] args) {
        Integer numeros[] = {1,3,5,6,9,5};
        GenericosDefinidos<Integer> teste = new GenericosDefinidos<Integer>(numeros);

        System.out.printf("%.2f", teste.calcularMedia());
    }
}
