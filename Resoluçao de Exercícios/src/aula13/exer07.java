package aula13;

import java.util.Scanner;

/*
7. Faça um Programa que calcule a área de um quadrado, em seguida
mostre o dobro desta área para o usuário.
*/
public class exer07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual o lado do quadrado?: ");
        double lado = scan.nextDouble();
        double dobroArea = 2* Math.pow(lado, 2);
        System.out.println("Para um quadrado de lado " + lado + ", o dobro de sua área equivale a " + dobroArea);
    }
}
