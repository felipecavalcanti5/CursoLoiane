package aula19.parte1;

import java.util.Scanner;

public class exer09 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        double[] vetorC = new double[10];

        //System.out.println(vetorA.length);

        for (int i=0; i <vetorA.length; i++){

            System.out.println("Entre com o valor da posição: " + i + " do vetor A");
            vetorA[i] = scan.nextInt();
            //vetorB[i] = sqrt(vetorA[i]);
            //vetorB[i] = vetorA[i];
        }

        for (int i=0; i <vetorB.length; i++){

            System.out.println("Entre com o valor da posição: " + i + " do vetor B");
            vetorB[i] = scan.nextInt();
            //vetorB[i] = sqrt(vetorA[i]);
            //vetorB[i] = vetorA[i];
        }

        for (int i=0; i <vetorC.length; i++){
            vetorC[i] = vetorA[i] / vetorB[i];
            //vetorB[i] = sqrt(vetorA[i]);
            //vetorB[i] = vetorA[i];
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

        System.out.print("vetor C = ");
        for (int i=0; i<vetorC.length; i++){
            System.out.print(vetorC[i] + " ");
        }
        System.out.println();

    }
}
