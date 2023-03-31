class CriaConta {//arquivo CriarConta.java /** Criandoumobjeto do tipo conta */
  public static void main (String [] args){
    Conta conta1 =new Conta(); //criando um objeto
    conta1.numero="21.342-7"; //referencia a atributos
    conta1.saldo = 0;
    conta1.credito (500.87); //referencia a metodos
    conta1.debito(45.00); 
    System.out.println (conta1.saldo);

  }  
}
