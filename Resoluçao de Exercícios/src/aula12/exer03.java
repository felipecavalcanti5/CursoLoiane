package aula12;

import java.util.Scanner;

/*
        3. Faça um Programa que peça dois números e imprima a soma.
*/
public class exer03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escolha o primeiro número: ");
        int a = scan.nextInt();
        System.out.println("Escolha o segundo número: ");
        int b = scan.nextInt();

        System.out.println("A soma de 'a' e 'b' é de " + (a+b));
    }

}
