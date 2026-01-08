package POOBasico.exercicio1.questao3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a altura do retângulo: ");
        double altura = sc.nextDouble();

        System.out.println("Digite a base do retângulo: ");
        double base = sc.nextDouble();

        Retangulo caixa = new Retangulo(base, altura);
        System.out.println("Área do retângulo: ");
        System.out.println(caixa.calcArea());

        System.out.println("Diagonal do retângulo: ");
        System.out.println(caixa.calcDiagonal());

        sc.close();
    }
}
