package aula12;

import java.util.Scanner;

/*      5. Faça um Programa que converta metros para centímetros.
        */
public class exer05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número em metros:");
        double metros = scan.nextDouble();
        double centimetros = (metros*100);
        System.out.println(metros + " metros equivale a " + centimetros + " centímetros");
    }
}
