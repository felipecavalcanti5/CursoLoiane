package aula17.parte4;

public class exer30 {
    public static void main(String[] args) {
        System.out.println("Preço do pão: R$ 0.18" );
        System.out.println("Panificadora pão de Ontem - Tabela de Preços");

        for (int i = 1; i <= 50; i++){
            System.out.println(i + " - R$ " + 0.18*i);
        }
    }
}
