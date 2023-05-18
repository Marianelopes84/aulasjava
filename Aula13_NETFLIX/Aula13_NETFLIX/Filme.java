public class Filme {
    private int id;
    private String nome;
    private String categoria;
    private String atores;
    private int ano;

    public Filme(int id, String nome, String categoria, String atores, int ano)
    {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.atores = atores;
        this.ano = ano;
    }

    public void setId(int idFilme)
    {
        this.id = idFilme;
    }
    public int getId()
    {
        return this.id;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public String getNome()
    {
        return this.nome;
    }

    public void setCategoria(String categoria)
    {
        this.categoria = categoria;
    }
    public String getCategoria()
    {
        return this.categoria;
    }    

    public void setAtores(String atores)
    {
        this.atores = atores;   
    }
    public String getAtores()
    {
        return this.atores;
    }	

    public void setAno(int ano)
    {
        this.ano = ano;
    }
    public int getAno()
    {
        return this.ano;
    }
  
}
