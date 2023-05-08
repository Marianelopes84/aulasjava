package netflix;

public class MainN {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Titanic", "Romance/Drama");
        Netflix netflix1 = new Netflix();
        netflix1.setNomeFilme(filme1.getNomeFilme());
        netflix1.setCatFilme(filme1.getCatFilme());
        netflix1.setanoLancamento("1997");
        netflix1.setAtores(new String[]{"Leonardo DiCaprio", "Kate Winslet", "Billy Zane", "Kathy Bates", "Frances Fisher", "Gloria Stuart", "Bill Paxton", "Bernard Hill", "David Warner", "Victor Garber"});
        
        Filme filme2 = new Filme("Esqueceram de Mim", "Comédia");
        Netflix netflix2 = new Netflix();
        netflix2.setNomeFilme(filme2.getNomeFilme());
        netflix2.setCatFilme(filme2.getCatFilme());
        netflix2.setanoLancamento("1990");
        netflix2.setAtores(new String[]{"Macaulay Culkin", "Joe Pesci", "Daniel Stern", "John Heard", "Catherine O'Hara", "Angela Goethals", "Devin Ratray", "Gerry Bamman", "Hillary Wolf", "John Candy"});
        
        System.out.println("Filme 1:");
        System.out.println("Código do filme: " + netflix1.getCodID());
        System.out.println("Nome do filme: " + netflix1.getNomeFilme());
        System.out.println("Categoria do filme: " + netflix1.getCatFilme());
        System.out.println("Ano do filme: " + netflix1.getanoLancamento());
        System.out.println("Atores principais: ");
        for (String ator : netflix1.getAtores()) {
            System.out.println("- " + ator);
        }
        
        System.out.println("\nFilme 2:");
        System.out.println("Código do filme: " + netflix2.getCodID());
        System.out.println("Nome do filme: " + netflix2.getNomeFilme());
        System.out.println("Categoria do filme: " + netflix2.getCatFilme());
        System.out.println("Ano do filme: " + netflix2.getanoLancamento());
        System.out.println("Atores principais: ");
        for (String ator : netflix2.getAtores()) {
            System.out.println("- " + ator);
        }
    }
}
