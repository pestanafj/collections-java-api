package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livrosList;

    public CatalogoLivros() {
        this.livrosList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livrosList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List <Livro> livrosPorAutor = new ArrayList<>();
        if(!livrosList.isEmpty()){
            for (Livro l:livrosList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPeriodo(int anoInicial, int anoFinal){
        List <Livro> livrosPorAutor = new ArrayList<>();
        if(!livrosList.isEmpty()){
            for (Livro l:livrosList){
                if(l.getAnoDeFabricacao()>=anoInicial&&l.getAnoDeFabricacao()<=anoFinal){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public Livro pesquisarTitulo(String titulo){
        Livro livroEncontrado = null;
        if(!livrosList.isEmpty()){
            for (Livro l:livrosList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroEncontrado = l;
                    break;
                }
            }
        }
        return livroEncontrado;

    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Livro1", "Autor 1", 2020);
        catalogoLivros.adicionarLivro("Livro1", "Autor 1", 2021);
        catalogoLivros.adicionarLivro("Livro2", "Autor 2", 2021);
        catalogoLivros.adicionarLivro("Livro3", "Autor 3", 2022);
        catalogoLivros.adicionarLivro("Livro2", "Autor 4", 1994);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 1"));
        System.out.println(catalogoLivros.pesquisarTitulo("Livro2"));
        System.out.println(catalogoLivros.pesquisarPeriodo(2020, 2021));

    }

}
