package aula27.exer01;

public class Main {
    public static void main(String[] args) {
        Lampada abajour = new Lampada();

        System.out.println("o abajour está ligado? " + abajour.acesa);
        abajour.ligarLampada();
        System.out.println("o abajour está ligado? " + abajour.acesa);
        abajour.desligarLampada();
        System.out.println("o abajour está ligado? " + abajour.acesa);
    }
}
