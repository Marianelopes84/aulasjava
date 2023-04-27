package Aula10_ex01;

public class Carros {
    //atributos
    String nome;
    String marca;
    int ano;
    int velocidade;

    //metodos
    void acelerar(int aceleracao){
        velocidade += aceleracao;
    }
    void freiar(int reducao){
        velocidade -= reducao;
    }
    void buzinar(){
        System.out.println("bibi fonfon");
    }
}