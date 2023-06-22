package aula16a17;

import java.util.Scanner;

public class exer03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean infoValida = false;
        String nome;
        do{

            System.out.println("Digite um nome maior que três caracteres: ");

            nome = scan.next();

            if(nome.length() > 3){
                infoValida = true;
                System.out.println("o nome " + nome + " é válido.");
            }else {
                System.out.println("o nome " + nome + " é menor que 4 caracteres.");
            }

        }while(!infoValida);

        boolean idadeValida = false;
        int idade;
        do{

            System.out.println("Digite um número entre 0 e 150: ");

            idade = scan.nextInt();

            if(idade > 0 && idade < 150){
                System.out.println("Idade válida");
                idadeValida = true;
            }else{
                System.out.println("O número " + idade + " está fora do escopo desejado.");
            }
        }while (!idadeValida);

        boolean salarioValido = false;
        double salario;

        do{
            System.out.println("Qual o seu salário? ");
            salario = scan.nextDouble();

            if(salario > 0){
                System.out.println("Salário válido.");
                salarioValido = true;
            }else{
                System.out.println("O salário de " + salario + " é inválido.");
            }
        }while(!salarioValido);

        String sexo;
        boolean sexoValido = false;

        do{
            System.out.println("Qual o seu sexo? ");
            sexo = scan.next();

            if (sexo.equalsIgnoreCase("f") ||
                    sexo.equalsIgnoreCase("m")){
                sexoValido = true;
            } else {
                System.out.println("Sexo precisa ser 'f' ou 'm'");
            }
        }while(!sexoValido);

        String estadoCivil;
        boolean estadoCivilValido = false;

        do{
            System.out.println("Qual o seu estado civil?? ");
            estadoCivil = scan.next();

            if (estadoCivil.equalsIgnoreCase("s") ||
                    estadoCivil.equalsIgnoreCase("c") ||
                    estadoCivil.equalsIgnoreCase("v") ||
                    estadoCivil.equalsIgnoreCase("d")){
                estadoCivilValido = true;
            } else {
                System.out.println("Estado civil precisa ser 's', 'c', 'v' ou 'd'");
            }
        }while(!estadoCivilValido);

        System.out.println("As seguintes informações foram coletadas: ");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + estadoCivil);



    }

}
