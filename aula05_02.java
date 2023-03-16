import java.util.Scanner;
public class aula05_02 {
    public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Digite o seu nome: ");
		String nome=console.nextLine();
		System.out.print("Digite o seu telefone: ");
		String telefone=console.nextLine();
		System.out.print("Digite o seu endereco: ");
		String endereco=console.nextLine();
		System.out.println();
		System.out.println(nome);
		System.out.println(telefone);
		System.out.println(endereco);
		console.close();
    }
}
