package aula17.parte4;

import java.util.Scanner;

public class exer29 {
    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        double precoUnitario = 1.99;
        System.out.println("Lojas Quase Dois - Tabela de Preços: ");

        for(int i = 1; i <= 50; i++){
            System.out.println(i + " - R$ " + i*precoUnitario);
        }
    }
}
