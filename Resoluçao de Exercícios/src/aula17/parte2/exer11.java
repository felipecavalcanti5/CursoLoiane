package aula17.parte2;

import java.util.Scanner;

public class exer11 {
    public static void main(String[] args) {

        int soma = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int num1 = scan.nextInt();
        System.out.println("Digite outro número inteiro: ");
        int num2 = scan.nextInt();

        for(int i = num1+1; i < num2; i++){
            soma += i;
        }
        System.out.print(soma);
    }
}
