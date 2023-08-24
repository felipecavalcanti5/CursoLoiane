package aula19.parte2;

import java.util.Scanner;

public class exer18 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int pMenor = 0;
        int pMaior = 0;
        int menorIdade = 0;
        int maiorIdade = 0;


        //System.out.println(vetorA.length);

        for (int i=0; i <vetorA.length; i++){

            System.out.println(i+1 + "ª" + " pessoa: Digite a sua idade: ");
            vetorA[i] = scan.nextInt();
            if (i == 0 ){
                menorIdade = vetorA[i];
                maiorIdade = vetorA[i];
            }else{
                if (vetorA[i]< menorIdade){
                    menorIdade = vetorA[i];
                    pMenor = i+1;

                }if (vetorA[i]> maiorIdade){
                    maiorIdade = vetorA[i];
                    pMaior = i+1;
                }
            }

            //vetorB[i] = sqrt(vetorA[i]);
            //vetorB[i] = vetorA[i] % 2;

        }

        System.out.print("vetor A = ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");

        }

        System.out.println(" ");

        System.out.println("A menor idade é " + menorIdade + " (posição " + pMenor + ")" + " e a maior idade é " + maiorIdade + " (posição " + pMaior + ")");


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

