package aula13;

import java.util.Scanner;

/*      11. Faça um Programa que peça 2 números inteiros e um número real.
        Calcule e mostre:
        a. o produto do dobro do primeiro com metade do segundo .
        b. a soma do triplo do primeiro com o terceiro.
        c. o terceiro elevado ao cubo.*/
public class exer11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int num1 = scan.nextInt();
        System.out.println("Digite outro número inteiro: ");
        int num2 = scan.nextInt();
        System.out.println("Digite um número real: ");
        double numReal = scan.nextDouble();

        int a = (2*num1)*(num2/2);
        double b = (3*num1)+numReal;
        double c = Math.pow(numReal, 3);

        System.out.println("Resultado 1: " + a);
        System.out.println("Resultado 2: " + b);
        System.out.println("Resultado 3: " + c);
    }


}
