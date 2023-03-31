public class TestaConta{
    public static void main (String[] args){
        Conta Conta= new Conta("1234", 100);
        Conta.saldo=200;
        Conta.depositar(100);
        Conta.sacar(50);
        System.out.println("SAldo atual R$" + Conta.saldo);
        
    }
}