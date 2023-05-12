package Aula11_netflix;

import java.util.ArrayList;

public class Netflix {
    ArrayList <Filme> filmes = new ArrayList <Filme> ();
public void AdicionaFilme (int id, String nome, String categoria, String atores, int ano)
{
    filmes.add (new Filme (id, nome, categoria, atores, ano));
}
public void exibeFilme (int id)
{
Filme filmepeloId = buscaPeloId (filmes, id);
if (filmepeloId != null) {
    System.out.println ("Id = " + filmepeloId.getId () +
    "\nNome = " + filmepeloId.getNome() +
    "\nCategoria= " + filmepeloId.getCategoria () + 
    "\nAtores Principais= " + filmepeloId.getAtores() + 
    "\nAno Lançamento= " + filmepeloId.getAno());

}
}
public static Filme buscaPeloId (ArrayList<Filme> filmes, int id){

    for (Filme Filme : filmes){
        if (Filme.getId() == Id){
            return Filme;
        }
    }
    return null;
}
}
