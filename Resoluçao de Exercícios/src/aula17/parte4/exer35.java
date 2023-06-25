package aula17.parte4;

import java.util.Scanner;

public class exer35 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = 0;

        System.out.println("Quantos números inteiros você quer inserir? ");
        int qtdNum = scan.nextInt();
        boolean primo = true;

        for (int i= 1; i <=qtdNum; i++){


            for (int j=2; j < i; j++){
                if(i % j == 0){
                    primo = false;
                }
            }
            if (primo){
                System.out.println(i);
            }

        }


    }
}
