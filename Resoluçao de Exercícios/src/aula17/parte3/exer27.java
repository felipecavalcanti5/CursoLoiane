package aula17.parte3;

import java.util.Scanner;

public class exer27 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Insira quantidade de turmas: ");
        int turmas = scan.nextInt();
        int totalAlunos = 0;

        for(int i = 1; i <= turmas; i++){
            System.out.println("Quantos alunos há na turma " + i + "?");
            int alunos = scan.nextInt();
            totalAlunos += alunos;
        }
        System.out.println(" A média total de alunos é " + totalAlunos/turmas);
    }
}
