import java.util.Scanner;

public class TestaDeclaracaoScanner {
  public static void main(String[] args){
    Scanner console = new Scanner(System.in);
    String nome = console.next();
    System.out.println(nome);
    console.close();
  }
}