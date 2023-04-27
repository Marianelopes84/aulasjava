package Aula10_ex02;
import java.util.Scanner;

public class Aula10_ex02 {
    public static void main(String[] args) {
        Pessoa1 p = new Pessoa1();// criando um objeto
        try (Scanner console = new Scanner(System.in)) {
			System.out.print("Digite o seu nome: ");
			String nome = console.nextLine();
			p.setnome(nome);
			System.out.print("Digite a sua data de  aniversário: ");
			String datanascimento = console.nextLine();
			p.setdatanascimento(datanascimento);
			System.out.print("Digite a sua altura: ");
			float altura = console.nextFloat();
			p.setaltura(altura);
		}
        p.exibedados();

        
    }
  
}
