package POOBasico.exercicio2.questao1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Agenda minhaAgenda = new Agenda();

        //Compromisso 1
        System.out.println("Digite o assunto do compromisso: ");
        String assunto = sc.nextLine();

        System.out.println("Digite o local do compromisso: ");
        String local = sc.nextLine();

        System.out.println("Digite a data e hora do compromisso no formato (dd/MM/yyyy HH:mm): ");
        String entrada = sc.nextLine();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime data = LocalDateTime.parse(entrada, formato);

        Compromisso meuCompromisso1 = new Compromisso(assunto, local, data);
        minhaAgenda.inserir(meuCompromisso1);

        Compromisso[] v = minhaAgenda.listar();  // v[] --> copia de comps
        System.out.println("Compromissos cadastrados: ");
        for (int i = 0; i < minhaAgenda.getQtd(); i++) {
            System.out.println(v[i]);
        }

        //Compromisso 2
        System.out.println("Digite o assunto do compromisso: ");
        String assunto2 = sc.nextLine();

        System.out.println("Digite o local do compromisso: ");
        String local2 = sc.nextLine();

        System.out.println("Digite a data e hora do compromisso no formato (dd/MM/yyyy HH:mm): ");
        String entrada2 = sc.nextLine();
        DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime data2 = LocalDateTime.parse(entrada2, formato2);

        Compromisso meuCompromisso2 = new Compromisso(assunto2, local2, data2);
        minhaAgenda.inserir(meuCompromisso2);

        Compromisso[] v2 = minhaAgenda.listar();  // v2[] --> copia de comps
        System.out.println("Compromissos cadastrados: ");
        for (int i = 0; i < minhaAgenda.getQtd(); i++) {
            System.out.println(v2[i]);
        }
    }
}
