import java.util.Scanner;
// Solução do Exercicio 03 da aula 04
public class aula05_03 {
    public static void main(String[] args) {
		int num1 = 1;
        Scanner console = new Scanner(System.in);
        System.out.print("Digite a última posição da série de Fibonacci: ");
        int qtde = console.nextInt();
        System.out.println("Exibindo a sequencia de Fibonacci ate a "+qtde+"ª posicao");
		System.out.println("Posição 1: "+num1);
		int num2 = 1;
		System.out.println("Posição 2: "+num2);
		int total;
		for(int cont = 3; cont <= qtde; cont++){
			total = num1+num2;
			System.out.println("Posição "+cont+": "+total);
			num1 = num2;
			num2 = total;
		}
        console.close();
    }
}
