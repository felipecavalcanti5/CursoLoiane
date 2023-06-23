package aula17.parte3;

import java.util.Scanner;

public class exer15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quero a sequência de Fibonacci até o termo: ");
        int termo = scan.nextInt();

        //1, 1, 2, 3, 5, 8, 13...
        int a1 = 1;
        int a2 = 1;
        int a3;

        System.out.println(1);
        System.out.println(1);

        for(int i = 3; i<= termo; i++){
            a3 = a1 + a2;
            a1 = a2;
            a2 = a3;
            System.out.println(a3);
        }
    }
}
