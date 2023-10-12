package aula19.parte4;

import java.util.Scanner;

public class exer24 {

    //Minha Solução:
/*    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int [] vetorA = new int [10];
        boolean palindromo = false;


        for(int i=0; i< vetorA.length; i++){
            System.out.println("Digite o " + (i+1) + " º elemento do vetor:");
            vetorA[i] = scan.nextInt();

            }
        if((vetorA[0] == vetorA[9]) && (vetorA[1] == vetorA[8]) && (vetorA[2] == vetorA[7]) && (vetorA[3] == vetorA[6]) && (vetorA[4] == vetorA[5])){
            palindromo = true;
            System.out.print("o número ");
            for (int i=0; i< vetorA.length; i++){
                System.out.print(vetorA[i]);
            }
            System.out.println(" é um palindromo");
        }else{
            for (int i=0; i< vetorA.length; i++){
                System.out.print(vetorA[i]);
            }
            System.out.println(" não é um palindromo");
        }
    }*/

    //Solução Loiane:

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] vetorA = new int[10];

        for(int i = 0; i < vetorA.length; i++){
            System.out.println("Entre com um número na posição " + i);
            vetorA[i] = scan.nextInt();
        }
        boolean palindromo = false;
        for(int i=0; i<vetorA.length/2; i++){
            if(vetorA[0] == vetorA[vetorA.length - 1 - i]){
                palindromo = true;
                break;
            }
        }
        System.out.println("vetorA = ");
        for (int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        if(palindromo){
            System.out.println("Palindromo");
        }
        else{
            System.out.println("Não é Palindromo");
        }

    }


}
