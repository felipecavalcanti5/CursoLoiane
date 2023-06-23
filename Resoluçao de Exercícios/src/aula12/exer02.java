package aula12;

import java.util.Scanner;

/*
2. Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].
        */
public class exer02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Por gentileza, escolha um número: ");
        int numero = scan.nextInt();
        System.out.println("O número escolhido foi " + numero);

    }

}
