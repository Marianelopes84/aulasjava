package netflix;

public class Filme {
    private String nomeFilme;
    private String catFilme;

    public Filme(String nomeFilme, String catFilme) {
        this.nomeFilme = nomeFilme;
        this.catFilme = catFilme;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public String getCatFilme() {
        return catFilme;
    }

    public void setCatFilme(String catFilme) {
        this.catFilme = catFilme;
    }
}