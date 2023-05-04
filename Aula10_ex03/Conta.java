package Aula10_ex03;

public class Conta {
    String numero;
    double saldo;
    public Conta (String numero, double saldo) {
        setnumero(numero);
        setsaldo(saldo);
    }
    public Conta(){
    }
    public String getnumero() {
        return numero;
    }
    public void setnumero(String numero) {
        this.numero = numero;
    }
    public Double getsaldo() {
	    return saldo;
    }
    public void setsaldo(double saldo) {
	    this.saldo = saldo;
    }
    void credito(double valor) {
        this.saldo = this.saldo + valor;
    }
    void debito(double valor) {
        this.saldo = this.saldo - valor;
    }       
    public void exibedados() {
        System.out.println("Conta: " + getnumero());
        System.out.printf("Saldo: R$ %.2f\n", getsaldo());
    }     
}
