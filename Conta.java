class Conta { //arquivo Conta.java
    String numero;
    double saldo;
    void credito (double valor){
        saldo = saldo + valor;
    }

void debito(double valor){
    saldo = saldo - valor;
    }
}//fim da classe conta
