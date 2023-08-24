package aula19.parte2;

import java.util.Scanner;

public class exer16 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int somaMenor15 = 0;
        int nIgual15 = 0;

        double mediaMaior15 = 0;
        int somaMaior15 = 0;
        int nMaior15 = 0;


        //System.out.println(vetorA.length);

        for (int i=0; i <vetorA.length; i++){

            System.out.println("Entre com o valor da posição: " + i);
            vetorA[i] = scan.nextInt();
            if (vetorA[i] < 15){
                somaMenor15 += vetorA[i];
            } else if (vetorA[i] == 15) {
                nIgual15 += 1;

            } else if (vetorA[i] > 15) {
                nMaior15 += 1;
                somaMaior15 += vetorA[i];
                mediaMaior15 = somaMaior15/nMaior15;

            }

            //vetorB[i] = sqrt(vetorA[i]);
            //vetorB[i] = vetorA[i] % 2;

        }

        System.out.print("vetor A = ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");

        }

        System.out.println(" ");

        System.out.println("A soma dos números menores que 15 é igual a " + somaMenor15 + "\n");
        System.out.println("A quantidade dos números iguais a 15 é " + nIgual15 + "\n");
        System.out.println("A média da soma dos números maiores que 15 é igual a " + mediaMaior15 + "\n");


        /*for(int i=0; i < vetorA.length; i++){
            if(vetorA[i] % 2 == 0){
                System.out.print(vetorA[i] + " ");
            }

        }*/
        //System.out.println(vetorA[i] % 2 == 0);
        //System.out.println(" são números pares.");
        System.out.println();
        //System.out.println("Portanto, este vetor comporta " + p + " números pares." );

    }


}

