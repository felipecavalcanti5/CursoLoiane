package aula17.parte5;

import java.util.Scanner;
public class exer36 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Montar a tabuada de: ");
        int numTabuada = scan.nextInt();
        System.out.println("Começar por: ");
        int numInicio = scan.nextInt();
        System.out.println("Terminar em: ");
        int numFinal = scan.nextInt();

        if(numInicio < numFinal){
            for(int i = numInicio; i <= numFinal; i++){
                System.out.println(numTabuada + " X " + i + " = " + numTabuada*i);
            }
        }else System.out.println("Você digitou um número final menor que o número inicial.");


    }
}
