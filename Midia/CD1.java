package Midia;

import java.util.Random;
import java.util.Scanner;

public class CD1 extends Midia1 {

    private int nMusicas;
    Random r = new Random();
    Scanner scan = new Scanner(System.in);

    public CD1() {
        this.nMusicas = r.nextInt(100);
    }

    public CD1(int codigo, double preco, String nome, int nMusicas) {
        super(codigo, preco, nome);
        this.nMusicas = nMusicas;
    }

    public String getDetalhes() {
        return "\nNúmero de músicas: " + this.nMusicas;
    }

    public void setMusicas(int nMusicas) {
        this.nMusicas = nMusicas;
    }

    public void inserirDados() {
        super.inserirDados();
        System.out.println("Digite o número de músicas: ");
        this.nMusicas = scan.nextInt();
        scan.close();
    }
}