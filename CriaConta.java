/*** public class Conta { //arquivo Conta.java
  String numero;
  double saldo;
  public Conta (String nro, double saldoInicial){
      numero = nro;
      saldo = saldoInicial;
  }
 
  void credito (double valor){
      saldo = saldo + valor;
  }

  void debito(double valor){
  saldo = saldo - valor;
  }
}//fim da classe conta


public class CriaConta { //arquivo CriarConta.java Criandoumobjeto do tipo conta 
public static void main (String [] args){
    Conta conta1 =new Conta("21.342-7", 0); //criando um objeto atraves do construtor programado
    
    conta1.numero="21.342-7"; //referencia a atributos
    conta1.credito (500.87); //referencia a metodos
    conta1.debito(45.00); 
    System.out.println (conta1.saldo);
    System.out.println(conta2.saldo);

  }  
} 
**/

public class CriaConta {

  public static void main(String[] args) {
      Conta conta1 = new Conta ("21.342-7", 0);// criando um objeto
      Conta conta2 = new Conta ();
      conta2.numero = "21.342-7";  // referencia a atributos
      conta2.saldo = 100;
      System.out.println(conta1.saldo);  
      conta1.credito (500.87);  // referencia a metodos
      conta1.debito (45.00);
      System.out.println(conta1.saldo);
      System.out.println(conta2.saldo);

  }
  
}