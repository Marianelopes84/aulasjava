import java.util.Scanner;
public class matriz2 {
 public static void main(String[] args) {
    int[][] A = new int[3][5];
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite 15 valores inteiros para a matriz A:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                A[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Digite um valor inteiro para verificar se é par ou ímpar:");
        int x = scanner.nextInt();
        System.out.println("Valores da matriz A semelhantes a " + x + " (" + (x % 2 == 0 ? "par" : "ímpar") + "):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (A[i][j] % 2 == 0 && x % 2 == 0) {
                    System.out.print(A[i][j] + " ");
                } else if (A[i][j] % 2 != 0 && x % 2 != 0) {
                    System.out.print(A[i][j] + " ");
                }
            }
        }
    }
}