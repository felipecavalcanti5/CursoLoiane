public class Aluno {
    String nome;
    int matricula;
    String curso;
    String disciplina;
    double nota1;
    double nota2;


    void calcularNota(double nota1, double nota2){
        double media = (nota1 + nota2)/2;
        if (media >= 7){
            System.out.println("O aluno foi aprovado em " + disciplina + " com média " + media);
        }else{
            System.out.println("A media do aluno em " + disciplina + " foi de " + media + ". Ele está reprovado.");
        }
    }
}
