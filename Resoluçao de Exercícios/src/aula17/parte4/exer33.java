package aula17.parte4;

import java.util.Scanner;

public class exer33 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double total = 0;
        double maior = 0;
        double menor = 0; // Loiane usa Double.MAX_VALUE
        double media = 0; // Loiane usa Double.MIN_VALUE
        double temperatura;

        System.out.println("Quantas temperaturas você deseja inserir?");
        int num = scan.nextInt();

        for(int i = 1; i <= num; i++){
            System.out.println("Insira a " + i + "ª" + " temperatura : ");
            temperatura = scan.nextDouble();

            if(maior == 0){
                maior = temperatura;
            }else if (temperatura > maior){
                maior = temperatura;
            }

            if(menor == 0){
                menor = temperatura;
            }else if (temperatura < menor) {
                menor = temperatura;
            }

            total += temperatura;
            media = total/ num;
        }
        System.out.println("A maior temperatura inserida foi " + maior + ", a menor foi " + menor + ", e a média das temperaturas foi de " + media);


    }
}
