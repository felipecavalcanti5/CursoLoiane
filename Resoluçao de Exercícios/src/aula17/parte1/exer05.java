package aula16a17;

import java.util.Scanner;

public class exer05 {
    public static void main(String[] args) {
        boolean ultrapassagem = false;
        int anosParaUltrapassagem = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual a população inicial de A? ");
        double PopA = scan.nextDouble();
        System.out.println("Qual a taxa de crescimento anual de A? ");
        double txCrescA = scan.nextDouble();

        System.out.println("Qual a população inicial de B? ");
        double PopB = scan.nextDouble();
        System.out.println("Qual a taxa de crescimento anual de B? ");
        double txCrescB = scan.nextDouble();


        do{
            if(PopA >= PopB){
                System.out.println("em " + anosParaUltrapassagem + "anos, a população de A irá ultrapassar a população de B.");
                ultrapassagem = true;
            }else {
                PopA += PopA*txCrescA;
                PopB += PopB*txCrescB;
                anosParaUltrapassagem ++;
            };

        }while (!ultrapassagem);
    }
}
