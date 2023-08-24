package aula19.parte2;

import java.util.Scanner;

public class exer13 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int s = 0;


        //System.out.println(vetorA.length);

        for (int i=0; i <vetorA.length; i++){

            System.out.println("Entre com o valor da posição: " + i);
            vetorA[i] = scan.nextInt();
            if (vetorA[i] % 5 == 0){
                s+= vetorA[i];
            }

            //vetorB[i] = sqrt(vetorA[i]);
            //vetorB[i] = vetorA[i] % 2;

        }

        System.out.print("vetor A = ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");

        }

        System.out.println(" ");

        System.out.println("A soma dos números múltiplos de 5 é igual a " + s);


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

