package aula13;

import java.util.Scanner;

/*
        8. Faça um Programa que pergunte quanto você ganha por hora e o
        número de horas trabalhadas no mês. Calcule e mostre o total do seu
        salário no referido mês.

        */
public class exer08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Quanto você ganha por hora? ");
        double hora = scan.nextDouble();
        System.out.println("Quantas horas você trabalha por mês? ");
        double horasMes = scan.nextDouble();
        double totalSal = hora*horasMes;
        System.out.println("Você recebe por mês o equivalente a R$" + totalSal + ".");

    }


}
