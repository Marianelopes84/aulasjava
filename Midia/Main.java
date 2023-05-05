package Midia;


public class Main {
    public static void main(String[] args)  {
        

                Midia m = new Midia();

                DVD dvd = new DVD();

                dvd.inserirDados();
                dvd.getTipo();
                dvd.getDetalhes();
                dvd.printDados();

                CD cd = new CD();

                cd.inserirDados();
                cd.getTipo();
                cd.getDetalhes();
                cd.printDados();

                m.inserirDados();
                m.getTipo();
                m.getDetalhes();
                m.printDados();

                 
    }
}