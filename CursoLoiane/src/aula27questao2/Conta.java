package aula27questao2;

public class Conta {
    int numero;
    double saldo;
    double saque;
    double limite;
    double deposito;
    boolean status;


    void sacar (){

    }

    void consultarSaldo(){

        System.out.println("Seu saldo atual é de R$ " + saldo +".");
    }
    void realizarDeposito(){
        saldo += deposito;
        System.out.println("Você depositou R$" + deposito + "." + "Seu saldo é de R$" + saldo +".");
    }

    void realizarSaques(){
        if(saque < saldo){
            saldo -= saque;
            System.out.println("Você sacou R$" + saque + "." + "Seu saldo é de R$" + saldo +".");
        }else{
            System.out.println("Saldo insuficiente.");
        }


    }

    void mostrarStatus(){
        if(status){
            System.out.println("conta especial");
        }else{
            System.out.println("conta não é especial");
        }
    }
}
