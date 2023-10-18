package aula19.parte4;

import java.util.Scanner;

public class exer26 {
    public static void main(String[] args) {
        int [] vetorA = new int[10];
        int [] vetorB = new int[10];
        int [] vetorC = new int[10];

        Scanner scan = new Scanner(System.in);

        for(int i=0; i< vetorA.length; i++){
            System.out.println("Entre o o valor de A na posição " + (i+1));
            vetorA[i] = scan.nextInt();
        }

        for(int i=0; i< vetorB.length; i++){
            System.out.println("Entre o o valor de B na posição " + (i+1));
            vetorB[i] = scan.nextInt();
        }

        for(int i=0; i< vetorC.length; i++){
            if(vetorA[i]> vetorB[i]){
                vetorC[i] = 1;
            } else if (vetorA[i] == vetorB[i]) {
                vetorC[i] = 0;
            } else if (vetorA[i] < vetorB[i]){
                vetorC[i] = -1;
            }
        }

        System.out.print("VetorC: ");
        for(int i=0; i<vetorC.length; i++){
            System.out.print(vetorC[i] + " ");
        }
    }
}
