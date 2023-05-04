package Aula10_ex03;

    import java.util.Scanner;

    public class Aula10_ex03 {
        public static void main(String[] args) {
            Scanner console1 = new Scanner(System.in);
            System.out.print("Digite o número da conta: ");
            String numero = console1.nextLine();
            System.out.print("Digite o saldo inicial: ");
            double saldo = console1.nextFloat();
            Conta c1 = new Conta();
            c1.setnumero(numero);
            c1.setsaldo(saldo);
            c1.exibedados();
            Scanner console2 = new Scanner(System.in);
            System.out.print("Digite o número da conta: ");
            numero = console2.nextLine();
            System.out.print("Digite o saldo inicial: ");
            saldo = console2.nextFloat();        
            Conta c2 = new Conta(numero, saldo);
            c2.exibedados();
            c1.credito(500);
            c1.exibedados(); 
            c1.debito(200);
            c1.exibedados();  
            c2.credito(1000);
            c2.exibedados(); 
            c2.debito(500);
            c2.exibedados();
            
            console1.close();
            console2.close();
        }    
    }
    