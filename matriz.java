import java.util.Scanner;
public class matriz {
public static void main(String[] args) {
    int[][] A = new int[5][5];
    int[][] B = new int[5][5];
    int[][] C = new int[5][5];
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite 25 valores inteiros para matriz A:");
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
            A[i][j] = scanner.nextInt();
        }
    }
    System.out.println("Digite 25 valores inteiros para matriz B:");
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
            B[i][j] = scanner.nextInt();
        }
    }
 // Soma de A e B, armazenando em C
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
            C[i][j] = A[i][j] + B[i][j];
        }
    }
 // Exibindo todas as matrizes
        System.out.println("Matriz A:");
        printMatrix(A);
        System.out.println("Matriz B:");
        printMatrix(B);
        System.out.println("Matriz C (A + B):");
        printMatrix(C);
    }
 // Método auxiliar para imprimir uma matriz
private static void printMatrix(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[0].length; j++) {
            System.out.print(matrix[i][j] + " ");
        
        }
    System.out.println();
    }
    System.out.println();
    }
}