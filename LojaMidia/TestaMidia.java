package LojaMidia;

import java.util.Random;
public class TestaMidia
{
 public static void main(String args[])
 {
 // Cria um vetor de elementos que são objetos da classe Midia.
 Midia[] lista = new Midia[10];

 // Cria um objeto da classe Random que funciona como gerador aleatório.
 Random randomNumbers = new Random();
 int aleat, codigo, nData;
 double preco;
 String nome;

 // Laço para inicializar.
 for (int i=0, contc=0, contd=0; i < 2; i++)
 { // Gera valores aleatorios para o construtor: valores {{0},{1}}.
 aleat = randomNumbers.nextInt(2);

 // Construir diferentes midias dependendo do sorteio.
 if (0 == aleat)
 { System.out.println("Criar um CD !");
 // Valores [15,30].
 preco = 15*randomNumbers.nextDouble() + 15;
 // Nome gerado a partir do contador.
 nome = "CD" + contc;
 // Valores inteiros em [5,20].
 nData = randomNumbers.nextInt(15) + 5;
 // Construcao aleatoria do objeto CD.
 lista[i] = new CD(contc,preco,nome,nData);
 contc++;
 }
 else
 { System.out.println("Criar um DVD !");
 // Valores [20,50]
 preco = 30*randomNumbers.nextDouble() + 20;
 // Nome gerado a partir do contador.
 nome = "DVD" + contd;
 // Valores inteiros em [20,35].
 nData = randomNumbers.nextInt(15) + 20;
 // Construcao aleatoria do objeto DVD.
 lista[i] = new DVD(contd,preco,nome,nData);
 contd++;
 }

 }
 // Imprimindo o conteúdo de cada elemento do vetor de acordo com
 // a classe a que ele pertence (isto e, usando polimorfismo).
 for (int i=0; i < 2; i++)
 lista[i].printDados();
 }

} // Fim Classe TestaMidia.