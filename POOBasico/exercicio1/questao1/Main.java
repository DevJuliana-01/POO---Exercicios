package POOBasico.exercicio1.questao1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double raio = sc.nextDouble();
        Circulo meCirculo = new Circulo(raio); //Objeto : meCirculo | parametros : raio
        
        System.out.println(meCirculo.calculaArea());
        System.out.println(meCirculo.calculaCircunferencia());
        System.out.println(meCirculo.getRaio());

        sc.close();
    }  
}
