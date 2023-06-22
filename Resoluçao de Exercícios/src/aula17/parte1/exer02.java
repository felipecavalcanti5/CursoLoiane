package aula16a17;

import java.util.Scanner;

public class exer02 {
    public static void main(String[] args) {
        //Minha tentativa:
/*
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um nome de usuário: ");
        String nomeUsuario = scan.next();

        System.out.println("Digite uma senha: ");
        String Senha = scan.next();

        while (Senha.equals(nomeUsuario)){
            System.out.println("Sua senha é igual ao nome do usuário. Digite novamente.");
            System.out.println("Digite um nome de usuário: ");
            nomeUsuario = scan.next();

            System.out.println("Digite uma senha: ");
            Senha = scan.next();


        }
        System.out.println("usuário e senha cadastrados com sucesso");*/


        //Solução Loiane:


        Scanner scan = new Scanner(System.in);

        boolean infoValidas = false;
        String nomeUser;
        String senha;

        do {

            System.out.println("Entre com o nome do usuário:");
            nomeUser = scan.next();

            System.out.println("Entre com a senha:");
            senha = scan.next();

            if(nomeUser.equalsIgnoreCase(senha)){
               // infoValidas = false;
                System.out.println("Senha igual a usuário. Digite novamente.");

            }else {
                infoValidas = true;
                System.out.println("Senha e usuário válidos.");
                }

            } while (!infoValidas);
    }
}
