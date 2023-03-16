import java.util.Scanner;
public class exscanner 
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String nome, telefone, rua, numero;

        System.out.print("Digite o seu nome:");
        nome = scan.nextLine();
     
        System.out.print("Digite o seu telefone:");
        telefone = scan.nextLine();

        System.out.print("Digite sua rua:");
        rua = scan.nextLine();

        System.out.print("Digite o numero da sua casa:");
        numero = scan.nextLine();

        System.out.println("Nome:" + nome);
        System.out.println("Tel:" + telefone);
        System.out.println("Rua:"+ rua  + " Numero:" + numero);
    }
}
