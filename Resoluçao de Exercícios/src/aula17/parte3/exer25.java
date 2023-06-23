package aula17.parte3;

import java.util.Scanner;

public class exer25 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Quantas pessoas irão compor a amostragem?");
        int amostragem = scan.nextInt();
        int total = 0;
        int media = 0;

        for(int i = 1; i <= amostragem; i++){
            System.out.println("Idade da pessoa " + i);
            int idade = scan.nextInt();
            total += idade;
            media = total/amostragem;

        }
        if(media <= 25){
            System.out.println("A média da população é jovem.");
        } else if (media >= 26 & media <=60) {
            System.out.println("A média da população é adulta.");
        } else{
            System.out.println("A média da população é idosa");
        }



    }
}


