package aula17.parte3;

import java.util.Scanner;

public class exer21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int num = scan.nextInt();

        boolean primo = true;

        for (int i = 2; i<num; i++){
            if (num % i == 0){
                System.out.println("Não é primo - Divisível por: " + i);
                primo = false;
                //break;
            }
        }

        if (primo){
            System.out.println("É número primo");
        }
    }
}
