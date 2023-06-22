package aula16a17;

import java.util.Scanner;

public class exer01 {
    public static void main(String[] args) {


        //Minha Solução:

       /*
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma nota de 0 a 10: ");
        int nota = scan.nextInt();
        while(nota > 10){
            System.out.println("Valor inválido. Digite novamente: ");
            System.out.println("Digite uma nota de 0 a 10: ");
            nota = scan.nextInt();
        }*/

        //Solução Loiane:

        Scanner scan = new Scanner(System.in);
        boolean notaValida = false; // usou flag

        do {
            System.out.println("Entre com uma nota");

            double nota = scan.nextDouble();

            if (nota >=0 && nota <= 10){
                notaValida = true;
                System.out.println("Você digitou: " + nota);
            } else {
                //notaValida = false;
                System.out.println("Nota inválida, digite novamente.");
            }
        } while (!notaValida);//! é marcador de negação




    }
}
