package aula19.parte4;

import java.util.Scanner;

public class exer25 {
    public static void main(String[] args) {
        int [] vetorA = new int[10];
        int [] vetorB = new int[vetorA.length];


        Scanner scan = new Scanner(System.in);

        for(int i=0; i<vetorA.length; i++){
            System.out.println("Entre o o valor de " + (i+1));
            vetorA[i] = scan.nextInt();

            if(vetorA[i]%2==0){
                vetorB[i]=1;
            } else if (vetorA[i]%2!=0){
                vetorB[i]=0;
            }
            //OPERADOR TERNÁRIO: vetorB[i] = (vetorA[i]%2==0)? 1 : 0;
        }
        for(int i=0; i<vetorA.length; i++){
            System.out.print(vetorB[i] +" ");
        }
    }
}
