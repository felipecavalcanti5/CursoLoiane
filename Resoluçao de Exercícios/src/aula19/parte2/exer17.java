package aula19.parte2;

import java.util.Scanner;

public class exer17 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int n = 0;


        //System.out.println(vetorA.length);

        for (int i=0; i <vetorA.length; i++){

            System.out.println(i+1 + "ª" + " pessoa: Digite a sua idade: ");
            vetorA[i] = scan.nextInt();
            if (vetorA[i] > 35){
                n += 1;
            }

            //vetorB[i] = sqrt(vetorA[i]);
            //vetorB[i] = vetorA[i] % 2;

        }

        System.out.print("vetor A = ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");

        }

        System.out.println(" ");

        System.out.println(n + " pessoas têm mais do que 35 anos.");


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

