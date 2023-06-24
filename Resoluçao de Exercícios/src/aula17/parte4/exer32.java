package aula17.parte4;


import java.util.Scanner;

public class exer32 {

    public static void main(String[] args) {

        //Minha solução:

        //Fatorial de: 5
        //5! = 5 . 4 . 3 . 2 . 1 = 120

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o número que deseja fatorar: ");

        int fatorial = scan.nextInt();
        int resultado = 1;

        System.out.print("Fatorial de: " + fatorial + "\n " + fatorial + "! = ");

        for (int i = fatorial; i >= 1; i--){
            resultado *= i;
            if(i == 1){
                System.out.println(i + " = " + resultado);
            }else{
                //System.out.println(i + "! = " );
                System.out.print(i + " . ");
            }
        }
    }
}
