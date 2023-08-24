import java.util.ArrayList;
import java.util.Random;

public class RandomUniqueAcronymGenerator {
    public static void main(String[] args) {
        // Letras disponíveis
        char[] letrasDisponiveis = {'B', 'R', 'I', 'C', 'S', 'S', 'A', 'E', 'E', 'E', 'I'};

        // Tamanho da sigla (por exemplo, 3 letras)
        int tamanhoDaSigla = 11;

        for(int i = 11; i > 0; i--){

        }
        // Verificação de letras únicas
        if (tamanhoDaSigla > letrasDisponiveis.length) {
            System.out.println("Tamanho da sigla maior do que o número de letras disponíveis.");
            return;
        }

        // Selecionar letras únicas aleatoriamente
        ArrayList<Character> letrasSelecionadas = new ArrayList<>();
        Random random = new Random();
        while (letrasSelecionadas.size() < tamanhoDaSigla) {
            int indiceAleatorio = random.nextInt(letrasDisponiveis.length);
            char letraAleatoria = letrasDisponiveis[indiceAleatorio];
            if (!letrasSelecionadas.contains(letraAleatoria)) {
                letrasSelecionadas.add(letraAleatoria);
            }
        }

        // Criação da sigla aleatória
        StringBuilder siglaAleatoria = new StringBuilder();
        for (char letra : letrasSelecionadas) {
            siglaAleatoria.append(letra);
        }

        System.out.println("Sigla aleatória sem repetição: " + siglaAleatoria.toString());
    }
}