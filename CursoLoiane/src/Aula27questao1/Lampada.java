package Aula27questao1;

public class Lampada {
    double voltagem;
    String temperatura;
    String cor;

    boolean estado;

    void ligar(){
        estado = true;
    }

    void desligar(){
    estado = false;
    }

    void mostrarEstado(){
        if(estado){
            System.out.println("Lâmpada está ligada");
        }else{
            System.out.println("Lâmpada está desligada");
        }
    }

    void mudarEstado(){
        if(estado){
            desligar();
        }else{
            ligar();
        }
    }
}

