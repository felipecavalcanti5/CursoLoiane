package aula19.parte4;

import java.util.Scanner;

public class exer28 {
    public static void main(String[] args) {
        int [] vetorA = new int[10];
        int [] vetorB = new int[vetorA.length];

        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < vetorA.length; i++){
            System.out.println("Digite o " + (i+1) + "º termo de 'A'" );
            vetorA[i] = scan.nextInt();


        }
    }
}
