import java.util.Scanner;

public class Aula13_netflix{
    public static void main(String[] args) {
        int id;
        String nome;
        String categoria;
        String atores;
        int ano;
        Netflix n = new Netflix();
        Scanner console = new Scanner(System.in);
        System.out.print("-- Entre com os dados do filme --\n");
        System.out.print("Digite um id para o filme: ");
        id = Integer.parseInt(console.nextLine());
        System.out.print("Digite o nome do filme: ");
        nome = console.nextLine();     
        System.out.print("Digite a categoria do filme: ");
        categoria = console.nextLine();
        System.out.print("Digite os atores: ");
        atores = console.nextLine();
        System.out.print("Digite o ano de lançamento: ");
        ano = Integer.parseInt(console.nextLine());
        n.AdicionaFilme(id, nome, categoria, atores, ano);
        System.out.print("-- Entre com os dados do filme --\n");
        System.out.print("Digite um id para o filme: ");
        id = Integer.parseInt(console.nextLine());
        System.out.print("Digite o nome do filme: ");
        nome = console.nextLine();     
        System.out.print("Digite a categoria do filme: ");
        categoria = console.nextLine();
        System.out.print("Digite os atores: ");
        atores = console.nextLine();
        System.out.print("Digite o ano de lançamento: ");
        ano = Integer.parseInt(console.nextLine());
        n.AdicionaFilme(id, nome, categoria, atores, ano); 
        console.close();           
        n.exibeFilme(1);
    }
}
