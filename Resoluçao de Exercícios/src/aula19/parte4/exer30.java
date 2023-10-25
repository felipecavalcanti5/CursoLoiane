package aula19.parte4;

import java.util.Scanner;

public class exer30 {
    public static void main(String[] args) {
        int [] vetorA = new int[20];
        int [] vetorB = new int[20];
        int [] vetorC = new int[20];

        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < vetorA.length; i++){
            System.out.println("Entre com o " + (i+1) + "º elemento do vetorA: ");
            vetorA[i] = scan.nextInt();
            if(vetorA[i] % 2==0){
                vetorB[i] += vetorA[i];
            }else if (vetorA[i] % 2!=0){
                vetorC[i] += vetorA[i];
            }
        }

        System.out.print("vetorB = ");
        for(int i = 0; i < vetorB.length; i++){
            System.out.print(vetorB[i] + " ");
        }
    }
}
