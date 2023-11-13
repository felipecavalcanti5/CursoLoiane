package aula27.exer02;

public class Main {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        conta.saldo = 5000;

        conta.sacar(3000);

        System.out.println(conta.saldo);

        conta.sacar(1000);

        System.out.println(conta.saldo);

        conta.depositar(500);
        System.out.println(conta.saldo);

        conta.consultarSaldo();
        conta.sacar(1507);

        conta.consultarChequeEspecial();


    }
}
