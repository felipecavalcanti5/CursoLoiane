package aula19.parte4;

import java.util.Scanner;

public class exer24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int [] vetorA = new int [10];
        boolean palindromo = false;

        for(int i=0; i< vetorA.length; i++){
            System.out.println("Digite o " + i + " º elemento do vetor:");
            vetorA[i] = scan.nextInt();

            }
        if((vetorA[0] == vetorA[9]) && (vetorA[1] == vetorA[8]) && (vetorA[2] == vetorA[7]) && (vetorA[3] == vetorA[6]) && (vetorA[4] == vetorA[5])){
            palindromo = true;
        }
    }
}
