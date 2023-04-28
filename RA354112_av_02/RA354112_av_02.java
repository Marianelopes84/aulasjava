package RA354112_av_02;

public class RA354112_av_02 {
    public static void main(String args[]) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Mariane Lopes");
        pessoa1.setDataNascimento("14/04/1984");
        pessoa1.setAltura(1.53);
        pessoa1.imprimeDados();

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Xuxa Meneghel");
        pessoa2.setDataNascimento("18/08/1980");
        pessoa2.setAltura(1.70);
        pessoa2.imprimeDados();

        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNome("Ayrton Senna");
        pessoa3.setDataNascimento("16/03/1972");
        pessoa3.setAltura(1.81);
        pessoa3.imprimeDados();

        Pessoa pessoa4 = new Pessoa();
        pessoa4.setNome("Faustão");
        pessoa4.setDataNascimento("12/08/1950");
        pessoa4.setAltura(1.93);
        pessoa4.imprimeDados();
              
    }
}
