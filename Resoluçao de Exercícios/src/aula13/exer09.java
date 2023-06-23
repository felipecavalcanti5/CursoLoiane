package aula13;

import java.util.Scanner;

/*
        9. Faça um Programa que peça a temperatura em graus Farenheit,
        transforme e mostre a temperatura em graus Celsius.
        o C = (5 * (F-32) / 9).

*/
public class exer09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Diga um temperatura em graus Farenheit: ");
        double F = scan.nextDouble();
        double C = (5 * (F-32) / 9);
        System.out.println(F + "Farenheit equivale a " + C + "graus Celcius.");
    }
}
