package aula16a17;

import java.util.Scanner;

public class exer14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int par= 0;
        int impar = 0;

        for(int i = 1; i <=10; i++){
            System.out.println("Entre com um número inteiro");
            int num = scan.nextInt();
            if(num % 2 == 0){
                par ++;

            }else{
                impar ++;
            }
        }
        System.out.println("Números pares: " + par);
        System.out.println("Números ímpares: " + impar);


    }
}
