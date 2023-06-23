package aula17.parte3;

import java.util.Scanner;

public class exer24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Quer digitar quantas notas?");
        int num = scan.nextInt();
        double media = 0;

        for (int i = 1; i <= num; i++){
            System.out.println("Digite a nota " + i + " : ");
            double nota = scan.nextDouble();
            media += nota;


        }

        System.out.println("A média das notas inseridas é " + media/num);
    }
}
