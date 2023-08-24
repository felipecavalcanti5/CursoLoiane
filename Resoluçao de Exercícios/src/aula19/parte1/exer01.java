package aula19.parte1;

import java.util.Scanner;

public class exer01 {
    public static void main(String[] args) {
        /*

        MINHA SOLUCAO:

        double[] listaA = new double[5];
        listaA[0] = 12;
        listaA[1] = 7.5;
        listaA[2] = 3.75;
        listaA[3] = 9;
        listaA[4] = 17;

        double[] listaB = listaA;

        System.out.println(listaB[4]);*/


        //SOLUCAO LOIANE:


        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];



        for (int i=0; i <vetorA.length; i++){

            System.out.println("Entre com o valor da posição: " + i);
            vetorA[i] = scan.nextInt();

            vetorB[i] = vetorA[i];
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
