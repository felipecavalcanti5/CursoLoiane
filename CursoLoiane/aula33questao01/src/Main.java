public class Main {
    public static void main(String[] args) {

        Lampada abajour = new Lampada();
        abajour.lampada(220, "30", "amarelo", true);
        System.out.println("A voltagem do abajour é " + abajour.getVoltagem());
    }
}