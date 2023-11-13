package aula27.exer01;

public class Lampada {
    String modelo;
    String tensao;
    int potencia;
    String cor;
    String tipoLuz;
    int garantiaMeses;
    String [] tipos;
    boolean tipoAbajour;

    boolean acesa;

    boolean ligarLampada(){
        System.out.println("ligando a lâmpada...");
        return acesa = true;
    }

    boolean desligarLampada(){
        System.out.println("desligando a lâmpada...");
        return acesa = false;
    }



}
