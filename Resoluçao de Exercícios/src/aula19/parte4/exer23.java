package aula19.parte4;

import java.util.Scanner;

public class exer23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] vetorA = new int[10];
        boolean par = false;

            for(int i = 0; i < vetorA.length; i++){

                    System.out.println("Entre com o " + (i+1) + "º valor do vetor");
                    vetorA[i] = scan.nextInt();

                    if(vetorA[i] % 2 != 0){
                        break;
                    }
            }

            System.out.print("vetorA = ");
            for (int i=0; i< vetorA.length; i++){
                if(vetorA[i] != 0){
                    System.out.print(vetorA[i] + " ");
                }
            }
    }
}
