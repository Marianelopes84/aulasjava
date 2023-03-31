public class TestaConta{
    public static void main (String[] args){
        Conta conta= new Conta("1234", 100);
        conta.saldo=200;
        conta.depositar(100);
        conta.sacar(50);
        System.out.println("SAldo atual R$" + conta.saldo);
        
    }
}