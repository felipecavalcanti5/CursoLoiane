package aula27questao2Loiane;

public class ContaCorrente {

    String numero;
    String agencia;
    boolean especial;
    double limiteEspecial;
    double valorEspacialUsado;
    double saldo;

    boolean realizarSaque(double quantiaASacar){
        //tem saldo na conta
        if (saldo >= quantiaASacar){
            saldo -= quantiaASacar;
            return true;

        }else{//não tem saldo na conta
            if (especial) {
                //verificar se o limite especial tem saldo



            }else {
                return false;//não é especial e não tem saldo suficiente
            }

        }
    }
}
