package Aula10_ex01;

public class Aula10_ex01 {

    public static void main(String[] args) {
        Carros c1 = new Carros();
        c1.nome = "Toyota";
        c1.marca = "Corolla";
        c1.ano = 2020;
        c1.velocidade = 60;
        System.out.println("Velocidade Atual: "+c1.velocidade+" km/h");
        c1.acelerar(10);
        System.out.println("Velocidade Atual: "+c1.velocidade+" km/h");
        c1.freiar(30);
        System.out.println("Velocidade Atual: "+c1.velocidade+" km/h");
        c1.buzinar();
    }
    
}
