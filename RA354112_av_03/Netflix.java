package RA354112_av_03;

import java.util.Random;

public class Netflix {
    private int codID;
    private String nomeFilme;
    private String catFilme;
    private String[] atores;
    private String anoLancamento;
    private Random r = new Random();

    public Netflix() {
        this.codID = r.nextInt(9999);
        this.nomeFilme = "";
        this.catFilme = "";
        this.atores = new String[10];
        this.anoLancamento = "";
    }

    public int getCodID() {
        return codID;
    }

    public void setCodID(int codID) {
        this.codID = codID;
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

    public String[] getAtores() {
        return atores;
    }

    public void setAtores(String[] atores) {
        this.atores = atores;
    }

    public String getanoLancamento() {
        return anoLancamento;
    }

    public void setanoLancamento(String anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void exibirFilme() {
        System.out.println("Código do filme: " + getCodID());
        System.out.println("Nome do filme: " + getNomeFilme());
        System.out.println("Categoria do filme: " + getCatFilme());
        System.out.println("Ano de lançamento: " + getanoLancamento());
        System.out.println("Atores principais:");
        for (String ator : getAtores()) {
            System.out.println("- " + ator);
        }
    }
}