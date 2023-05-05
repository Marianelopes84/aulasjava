package AulaAgenda;
public class Agenda1 {
    private NovaPessoa[] pessoas;
    private int contador;

    public Agenda1() {
        this.pessoas = new NovaPessoa[10];
        this.contador = 0;
    }

    public void armazenaPessoa(String nome, int idade, float altura) {
        if (contador < 10) {
            NovaPessoa p = new NovaPessoa(nome, idade, altura);
            pessoas[contador] = p;
            contador++;
        } else {
            System.out.println("Agenda cheia. Impossível adicionar mais pessoas.");
        }
    }

    public void removePessoa(String nome) {
        boolean encontrou = false;
        for (int i = 0; i < contador; i++) {
            if (pessoas[i].getNome().equals(nome)) {
                encontrou = true;
                for (int j = i; j < contador-1; j++) {
                    pessoas[j] = pessoas[j+1];
                }
                pessoas[contador-1] = null;
                contador--;
                System.out.println("Pessoa removida da agenda.");
                break;
            }
        }
        if (!encontrou) {
            System.out.println("Pessoa não encontrada na agenda.");
        }
    }

    public int buscaPessoa(String nome) {
        for (int i = 0; i < contador; i++) {
            if (pessoas[i].getNome().equals(nome)) {
                return i;
            }
        }
        return -1;
    }

    public void imprimeAgenda() {
        if (contador == 0) {
            System.out.println("Agenda vazia.");
        } else {
            for (int i = 0; i < contador; i++) {
                System.out.println("Pessoa " + (i+1) + ": " + pessoas[i]);
            }
        }
    }

    public void imprimePessoa(int index) {
        System.out.println("Pessoa " + (index+1) + ": " + pessoas[index]);
    }
}


