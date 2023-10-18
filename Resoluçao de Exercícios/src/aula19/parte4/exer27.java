package aula19.parte4;

import java.util.Scanner;

public class exer27 {
    public static void main(String[] args) {
        int[] vetorA = new int[10];
        char[] vetorB = new char[vetorA.length];

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor de A na posição " + (i + 1));
            vetorA[i] = scan.nextInt();
            if (vetorA[i] < 7) {
                vetorB[i] = 'a';
            } else if (vetorA[i] == 7) {
                vetorB[i] = 'b';
            } else if (vetorA[i] > 7 && vetorA[i] < 10) {
                vetorB[i] = 'c';
            } else if (vetorA[i] == 10) {
                vetorB[i] = 'd';
            } else if (vetorA[i] > 10) {
                vetorB[i] = 'e';
            }
        }
        System.out.print("VetorB: ");
        for(int i=0; i<vetorB.length; i++){
            System.out.print(vetorB[i] + " ");
        }
    }
}