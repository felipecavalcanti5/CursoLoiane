package aula13;

import java.util.Scanner;

/*
6. Faça um Programa que peça o raio de um círculo, calcule e mostre
   sua área.
*/
public class exer06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira, em centímetros, o raio de uma circunferência:");
        double raio = scan.nextDouble();
        double pi = 3.14;
        double area = pi*raio*raio;
        System.out.println("A área do círculo cujo raio mede " + raio + " equivale a " + area + "centímetros quadrados");
    }

}
