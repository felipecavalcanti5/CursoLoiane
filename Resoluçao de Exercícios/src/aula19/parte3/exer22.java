package aula19.parte3;

import java.util.Scanner;

public class exer22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int [] vetorA = new int[10];
        int zero = 0;
        int um = 0;


        for(int i = 0; i < vetorA.length; i++){
            vetorA[i] = (int) Math.round(Math.random() * 1);
            if(vetorA[i] == 0){
                zero += 1;
            }else{
                um += 1;
            }

        }
        double porc0 = (zero*100)/ vetorA.length;
        double porc1 = (um*100)/ vetorA.length;

        for (int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("Porc 0 = " + porc0);
        System.out.println("Porc 1 = " + porc1);
    }
}
