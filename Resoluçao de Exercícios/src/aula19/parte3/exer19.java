package aula19.parte3;

import java.util.Scanner;

public class exer19 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double[] Nota1 = new double[10];
        double[] Nota2 = new double[10];
        double[] Result = new double[10];




//        int pMenor = 0;
//        int pMaior = 0;
//        int menorIdade = 0;
//        int maiorIdade = 0;


        //System.out.println(vetorA.length);

        for (int i=0; i <Nota1.length; i++){

            System.out.println(i+1 + "º" + " aluno: Digite a primeira nota: ");
            Nota1[i] = scan.nextInt();
            Result[i] = Nota1[i];

            }
        for (int i=0; i <Nota2.length; i++){

            System.out.println(i+1 + "º" + " aluno: Digite a segunda nota: ");
            Nota2[i] = scan.nextInt();
            Result[i] += Nota2[i];

        }


        for(int i=0; i< Nota1.length; i++){
            System.out.print(i+1 + "º aluno - primeira nota = ");
            System.out.println(Nota1[i]);

        }

        System.out.println(" ");

        for(int i=0; i< Nota2.length; i++){
            System.out.print(i+1 + "º aluno - segunda nota = ");
            System.out.println(Nota2[i] + " ");

        }

        System.out.println(" ");

        for(int i=0; i< Result.length; i++){
            double media = Result[i]/2;
            System.out.print(i+1 + "º aluno - média = ");
            System.out.println(media + " ");
            if (media>= 7){
                System.out.println(" (APROVADO)");
            }else{
                System.out.println(" (REPROVADO)");
            }


        }


        }

        /**//*

        System.out.println(" ");

        System.out.println("A menor idade é " + menorIdade + " (posição " + pMenor + ")" + " e a maior idade é " + maiorIdade + " (posição " + pMaior + ")");


        *//*for(int i=0; i < vetorA.length; i++){
            if(vetorA[i] % 2 == 0){
                System.out.print(vetorA[i] + " ");
            }

        }*//*
        //System.out.println(vetorA[i] % 2 == 0);
        //System.out.println(" são números pares.");
        System.out.println();
        //System.out.println("Portanto, este vetor comporta " + p + " números pares." );
*/
    }


