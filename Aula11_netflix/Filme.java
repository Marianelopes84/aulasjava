package Aula11_netflix;

public class Filme {
    private int id;
    String nome;
    String categoria;
    String atores;
    private int ano;

    public Filme (int id, String nome, String categoria, String atores, int ano)
    {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.atores = atores;
        this.ano = ano;
    }
    
    public void setId (int idFilme)
    {
        this.id = idFilme;
    }
    public int getId()
    {
        return this.id;
    }
    public void SetNome (String nome){
        this.nome = nome;
    }
    public String getNome()
    {
        return this.nome;
    }
    public void SetCategoria (String categoria)
    {
        this.categoria = categoria;
    }
    public String getCategoria ()
    {
        return this.categoria;
    }
    public void setAtores (String atores)
    {
        this.atores = atores;
    }
    public String getAtores()
    {
        return this.atores;
    }
    public void SetAno(int ano)
    {
        this.ano = ano;
    }
    public int getAno ()
    {
        return this.ano;
    }
}

