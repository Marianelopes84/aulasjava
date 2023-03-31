import java.util.Scanner;

public class RA354112_av_01 {
    public static void main(String[] args) {
        int[][] A = new int[5][5];
        int[][] B = new int[5][5];
        int x;
        Scanner scanner = new Scanner(System.in);

        // Recebe os valores da matriz A
        System.out.println("Digite os valores da matriz A:");
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
        // Recebe o valor de x
        System.out.println("Digite o valor de x:");
        x = scanner.nextInt();

        // Multiplica o valor da matriz A por x, caso o valor seja semelhante a x, e copia o valor para B caso contrário
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (A[i][j] % 2 == x % 2) {
                    B[i][j] = A[i][j] * x;
                } else {
                    B[i][j] = A[i][j];
                }
            }
        }

        // Exibe a matriz B
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
