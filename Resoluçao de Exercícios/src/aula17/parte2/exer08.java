package aula16a17;

import java.util.Scanner;

public class exer08 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double num;
        double soma = 0;

        for (double i=0; i<5; i++){

            System.out.println("Entre com um número: ");//Não é necessário guardar as variáveis.
            num = scan.nextInt();
            soma += num;

        }

        System.out.println("A média da soma dos números digitados é " + soma/5);


    }


}
