public class teste_switch {
    public static void main (String [] args){
        int cmd= 1;
        switch (cmd) {
            case 1:
                System.out.println("Inserir");
                break;
            case 2:
                System.out.println("Consultar");
                break;
            case 3:
                System.out.println("Alterar");
                break;
            case 4:
                System.out.println("Excluir");
                break;
            default:
                System.out.println("Erro!");    
        }
    }
}