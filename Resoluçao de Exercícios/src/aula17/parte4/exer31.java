package aula17.parte4;

import java.util.Scanner;

public class exer31 {

    public static void main(String[] args) {



        boolean fimOperacao = true;

        Scanner scan = new Scanner(System.in);
        //System.out.println("Você quer comprar quantos produtos?");
        //int numProdutos = scan.nextInt();

        do{

            System.out.println("Lojas Tabajaras\n");
            int numPedido = 1;
            double valorTotal = 0;
            double valorProduto = 0;
            double dinheiro = 0;

            do{
                System.out.println("Informe o valor do produto " + numPedido + ": ");
                valorProduto = scan.nextDouble();
                valorTotal += valorProduto;
                numPedido ++;

            }while(valorProduto != 0);

            System.out.println("Total: R$ " + valorTotal);

            System.out.println("Com quanto deseja pagar? ");
            dinheiro = scan.nextDouble();
            double troco = dinheiro - valorTotal;

            System.out.println("Troco: R$ " + troco + "\n");

            //numPedido = 1;
            //valorTotal = 0;
            //valorProduto = 0;
            //dinheiro = 0;

        }while (fimOperacao);





/*
        for(int i = 1; i<= numProdutos; i++){
            if(valorProduto != 0){

                System.out.println("Produto " + i + ": R$ " + valorProduto);
            }else{
                System.out.println("Produto " + i + ": R$ 0");
                System.out.println("Total: R$ " + valorTotal);

            }
        }*/
    }
}
