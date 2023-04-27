package Aula10_ex02;

public class Pessoa1 {
    //atributos
    private String nome;
    private String datanascimento;
    private float altura;

    //metodos
    public String getnome() {
        return nome;
    }
    public void setnome(String nome) {
        this.nome = nome;
    }
    public String getdatanascimento() {
	return datanascimento;
    }
    public void setdatanascimento(String datanascimento) {
	this.datanascimento = datanascimento;
    }
    public float getaltura() {
	return altura;
    }
    public void setaltura(float altura) {
        this.altura = altura;
    }
    public void exibedados() {
        System.out.println("Nome: "+ getnome()+" - Aniversário: "+ getdatanascimento()+" - Altura: "+ getaltura());
    }
}
