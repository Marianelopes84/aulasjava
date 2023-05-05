package Conta;
 /** class Conta { //arquivo Conta.java
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


 public class Conta {
    private String nro;
    double saldo;
    public Conta (String nro, double saldo){
        this.nro = nro;
        this.saldo = saldo;
    }
    public void atualizaSaldo(double novoSaldo){
        this.saldo=novoSaldo;
    }
    public void depositar(double valor){
        this.saldo+=valor;
    }
    public void sacar(double valor){
        this.saldo-=valor;
    }

    public float getSaldo(){
        return this.saldo;
    }
}
**/
public class Conta {
    String numero;
    double saldo;

    public Conta () { /*Construtor sem código */ }     

    public Conta (String nro, double saldoInicial) {
        numero = nro;
        saldo = saldoInicial;
    }
    void credito (double valor) {
        saldo = saldo + valor;
    }
    void debito (double valor) {
        saldo = saldo - valor;
    }
}
