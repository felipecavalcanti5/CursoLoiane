package aula17.parte4;

import java.util.Scanner;

public class exer28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual o total de CDs?");
        int CDs = scan.nextInt();
        double valorTotal = 0;
        //double media = 0;

        for(int i = 1; i <= CDs; i++){
            System.out.println(" Qual o valor do " + i + "º"+ " CD " + "?");
            double valor = scan.nextDouble();
            valorTotal += valor;
            //double media = valorTotal/CDs;
        }

        double media = valorTotal/CDs;
        System.out.println("O valor total investido nos CDs foi de " + valorTotal + " e o valor médio de cada CD foi " + media);
    }
}
