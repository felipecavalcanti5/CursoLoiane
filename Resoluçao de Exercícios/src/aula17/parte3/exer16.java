package aula17.parte3;

import java.util.Scanner;

public class exer16 {
    public static void main(String[] args) {

        //Minha solução:
        /*
        int a1 = 1;
        int a2 = 1;
        int a3 = 0;
        boolean cond = false;

        System.out.println(1);
        System.out.println(1);

        do{
            for(int i = 3; i<= 1000; i++){
                a3 = a1 + a2;
                a1 = a2;
                a2 = a3;
                while (a3 >= 500){
                    cond = false;
                }
                System.out.println(a3);

            }
        }while (!cond);
        */

        //Solução Loiane:
            //1, 1, 2, 3, 5, 8, 13...
            int a1 = 1;
            int a2 = 1;
            int a3 = 0;

            System.out.println(1);
            System.out.println(1);

            while( a3 < 500){
                a3 = a1 + a2;
                a1 = a2;
                a2 = a3;

                System.out.println(a3);
            }
        }

    }
        

