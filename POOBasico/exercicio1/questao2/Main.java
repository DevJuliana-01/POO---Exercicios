package POOBasico.exercicio1.questao2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome da disciplina: ");
        String nome = sc.nextLine();

        System.out.println("Digite a nota do 1º Bimestre: ");
        double nota1 = sc.nextDouble();

        System.out.println("Digite a nota do 2º Bimestre: ");
        double nota2 = sc.nextDouble();

        System.out.println("Digite a nota da prova final: ");
        double provaFinal = sc.nextDouble();

        Disciplina minhaDisciplina = new Disciplina(nome, nota1, nota2, provaFinal);
        System.out.println(minhaDisciplina.mediaFinal());

        sc.close();
    }
}
