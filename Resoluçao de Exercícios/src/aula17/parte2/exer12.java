package aula17.parte2;

import java.util.Scanner;

public class exer12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número inteiro entre 0 e 10 para ver a sua tabuada: ");
        int num = scan.nextInt();

        for(int i = 1; i<=10; i++){
            System.out.println(num + " X " + i + " = " + num * i);
        };
    }

}
