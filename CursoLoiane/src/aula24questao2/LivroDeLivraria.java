package aula24questao2;

public class LivroDeLivraria {
    public static void main(String[] args) {
        Livro Neuromancer = new Livro();
        Neuromancer.nPaginas = 300;
        Neuromancer.tamanho = "medio";

        System.out.println(Neuromancer.tamanho);
        System.out.println(Neuromancer.nPaginas);

    }
}
