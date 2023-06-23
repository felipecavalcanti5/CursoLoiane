package aula17.parte3;

import java.util.Scanner;

public class exer17 {
    public static void main(String[] args) {

        //Minha solução:

        //5! = 5 * 4 * 3 * 2 * 1 = 120

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o número que deseja fatorar: ");

        int fatorial = scan.nextInt();
        int resultado = 1;

        System.out.println("O fatorial de " + fatorial + "! é: ");

        for (int i = fatorial; i >= 1; i--){
            resultado *= i;
            if(i == 1){
                System.out.println(i + " = " + resultado);
            }else{
                System.out.print(i + " * ");
            }
        }

        //Solução Loiane:
/*
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número:");
        int num = scan.nextInt();

        System.out.println(num + "! = ");

        int fatorial = 1;
        for(int i=num; i>0; i--){
            fatorial *= i;
            System.out.println(i);
        }

        System.out.println("Resultado: " + fatorial);
*/

    }
}
