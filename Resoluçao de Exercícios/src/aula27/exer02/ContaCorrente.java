package aula27.exer02;

public class ContaCorrente {
    int numero;
    double saldo;
    boolean especial;
    double limite;

    void sacar(double saque){
        if(saque > (saldo)){
            System.out.println("Você não tem saldo suficiente para o saque");
        } else{
            saldo -= saque;
            System.out.println("Seu saldo agora é de R$" + saldo);
        }
    }

    void depositar(double deposito){
        saldo += deposito;
        System.out.println("Seu saldo agora é de R$" + saldo);
    }

    void consultarSaldo(){
        System.out.println("Seu saldo é de R$" + saldo);
    }

    void consultarChequeEspecial(){
        if(saldo < 0){
            System.out.println("Você está usando cheque especial");
        }else{
            System.out.println("Você não está usando cheque especial");
        }
    }

}
