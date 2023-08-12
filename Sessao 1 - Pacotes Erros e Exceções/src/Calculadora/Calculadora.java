package Calculadora;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {

    public static void dividirNumeros() throws ArithmeticException, InputMismatchException {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        Integer numero1 = input.nextInt();
        System.out.print("Digite um numero: ");
        Integer numero2 = input.nextInt();

       System.out.println("O resultado da divisão é: "+(numero1 / numero2));
    }

    public static void main(String[] args) {

        try {
            dividirNumeros();
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Erro de divisão por zero");
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Foi digitado um caractere em um numero Inteiro");
        }
    }
}
