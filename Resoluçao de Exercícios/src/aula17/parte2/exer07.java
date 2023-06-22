package aula16a17;

import java.util.Scanner;

public class exer07 {
    public static void main(String[] args) {

        //minha solução:
/*
        int maior = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int n1 = scan.nextInt();
            if(n1 > maior){
                maior = n1;
            }

        System.out.println("Digite o segundo número: ");
        int n2 = scan.nextInt();
            if (n2 > maior){
                maior = n2;
            }

        System.out.println("Digite o terceiro número: ");
        int n3 = scan.nextInt();
            if (n3 > maior){
                maior = n3;
            }

        System.out.println("Digite o quarto número: ");
        int n4 = scan.nextInt();
            if (n4 > maior){
                maior = n4;
            }

        System.out.println("Digite o quinto número: ");
        int n5 = scan.nextInt();
            if (n5 > maior){
                maior = n5;
            }

        System.out.println("O maior número é: " + maior);
*/

        //Solução Loiane:

        Scanner scan = new Scanner(System.in);
        int num;
        int maior = Integer.MIN_VALUE;

        for (int i=0; i<5; i++){

            System.out.println("Entre com um número: ");//Não é necessário guardar as variáveis.
            num = scan.nextInt();

            if (num > maior){
                maior = num;
            }
        }

        System.out.println("O maior número digitado é " + maior);


        }


    }

