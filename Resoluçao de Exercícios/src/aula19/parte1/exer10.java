package aula19.parte1;

import java.util.Scanner;

public class exer10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        double[] vetorB = new double[vetorA.length];

        //System.out.println(vetorA.length);

        for (int i=0; i <vetorA.length; i++){

            System.out.println("Entre com o valor da posição: " + i);
            vetorA[i] = scan.nextInt();
            //vetorB[i] = sqrt(vetorA[i]);
            vetorB[i] = vetorA[i] % 2;
        }

        System.out.print("vetor A = ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.print("vetor B = ");
        for (int i=0; i<vetorB.length; i++){
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();

    }
}
