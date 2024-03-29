package AulaAgenda;

import java.util.Scanner;

public class Aula12_ex011 {
    public static void main(String[] args) {

        Agenda11 agenda = new Agenda11();
        Scanner console1 = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o nome da pessoa: ");
            String nome = console1.nextLine();
            System.out.print("Digite a idade da pessoa: ");
            int idade = console1.nextInt();
            System.out.print("Digite a altura da pessoa: ");
            float altura = console1.nextFloat();
            agenda.armazenaPessoa(nome, idade, altura);

            // Consume the leftover newline character
            console1.nextLine();
        }

        agenda.imprimeAgenda(); // Imprime os dados de todas as pessoas da agenda

        int posicao = agenda.buscaPessoa("maria");
        if (posicao == 0) {
            System.out.println("Pessoa não encontrada");
        } else {
            agenda.imprimePessoa(posicao);
        }

        console1.close();
    }
}
