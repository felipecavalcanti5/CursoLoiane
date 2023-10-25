package aula20.parte1;

import java.util.Scanner;

public class exer01 {
    public static void main(String[] args) {

        int[][] M = new int[4][4];

        Scanner scan = new Scanner(System.in);

        for(int i=0; i< M.length; i++){
            M[i][i] = scan.nextInt();
        }
        for(int i=0; i< M.length; i++){
            System.out.print(M[i][i] + " ");
        }
    }
}
