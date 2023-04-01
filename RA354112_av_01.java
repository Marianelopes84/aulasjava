import java.util.Scanner;

public class RA354112_av_01 {
    public static void main(String[] args) {
        int[][] A = new int[5][5];
        int[][] B = new int[5][5];
        int x;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os valores da matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                A[i][j] = scanner.nextInt();
            }
        }
    // Exibe a matriz A
        System.out.println("Matriz A:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
        System.out.print(A[i][j] + " ");
    }
    System.out.println();
}
    
    System.out.println("Digite o valor de x:");
    x = scanner.nextInt();

            for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (A[i][j] % 2 == x % 2) {
                    B[i][j] = A[i][j] * x;
                } else {
                    B[i][j] = A[i][j];
                }
            }
        }

        System.out.println("Matriz B:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
