public class pessoa {
    
    private String nome;
    private int nascimento;
    private double altura;

    public pessoa(String n, int dn, double a){
        this.nome = n;
        this.nascimento = dn;
        this.altura = a;
    }

    public void nascimento(String dn){
        this.nascimento = dn;
    }

      public String numberPhone() {
        return this.phone;
    }

    public String getNome() {
        return this.nome;
    }

    public int getAge() {
        return this.age;
    }

}
