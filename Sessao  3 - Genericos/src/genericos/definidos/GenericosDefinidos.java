package genericos.definidos;

public class GenericosDefinidos<T extends Number>{
    T[] number;

    public GenericosDefinidos(T[] number) {
        this.number = number;
    }

    public Double calcularMedia(){
        Double soma = 0.0;
        Integer i;

        for (i = 0; i < number.length; i++) {
            soma = soma += number[i].doubleValue();
        }
        return soma/i;

    }
}
