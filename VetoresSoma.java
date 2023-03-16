import java.util.Scanner;
public class VetoresSoma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[10];
        int[] B = new int[10];
        int x;
        
        // adiciona 10 valores em A
        
        A[0] = 0;
        A[1] = 10;
        A[2] = 20;
        A[3] = 30;
        A[4] = 40;
        A[5] = 50;
        A[6] = 60;
        A[7] = 70;
        A[8] = 80;
        A[9] = 90;
        
        // solicita valor x
        System.out.print("Digite um valor inteiro para ser somado com os elementos de A: ");
        x = scanner.nextInt();
        // cria vetor B com elementos de A somados com x
        for (int i = 0; i < 10; i++) {
        B[i] = A[i] + x;
        }
        // exibe os dois vetores
        System.out.print("Vetor A: ");
        for (int i = 0; i < 10; i++) {
        System.out.print(A[i] + " ");
        }
        System.out.println();
        System.out.print("Vetor B: ");
        for (int i = 0; i < 10; i++) {
        System.out.print(B[i] + " ");
        }
        System.out.println();
        scanner.close();
     }
 }

