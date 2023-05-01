package aula27questao2;

public class exer02 {

    public static void main(String[] args) {
        Conta contaCorrente = new Conta(){
        };
        contaCorrente.saldo = 1000;
        contaCorrente.saque = 15;

        contaCorrente.realizarSaques();

        contaCorrente.deposito = 500;
        contaCorrente.realizarDeposito();

        contaCorrente.consultarSaldo();

    }
}
