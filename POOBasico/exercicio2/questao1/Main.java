package POOBasico.exercicio2.questao1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Agenda minhaAgenda = new Agenda();

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

        minhaAgenda.listar();

    }
    
}
