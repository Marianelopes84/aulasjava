public class Carro1 {
    
    private String nome;
    private String marca;
    private int ano;
    private int velocidade;

    public Carro1 (String nome, String marca, int ano) {
        this.nome = nome;
        this.marca = marca;
        this.ano = ano;
        this.velocidade = 0;
    }

    public void acelerar(int velocidade) {
        this.velocidade += velocidade;
    }

    public void frear(int velocidade) {
        this.velocidade -= velocidade;
    }

    public void buzinar() {
        System.out.println("Buzinando...");
        System.out.println("Bi bi bi!!");
    }

    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
        System.out.println("Velocidade: " + velocidade);
    }

}