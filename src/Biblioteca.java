import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Autor> autores;
    private List<Livro> livros;

    public Biblioteca() {
        autores = new ArrayList<>();
        livros = new ArrayList<>();
    }

    public Autor adicionarAutor(String nomeAutor) {
        Autor autor = new Autor(nomeAutor);
        autores.add(autor);
        return autor;
    }

    public void adicionarLivro(String titulo, int anoPublicacao, String nomeAutor) {
        Autor autor = encontrarAutor(nomeAutor);
        if (autor == null) {
            autor = adicionarAutor(nomeAutor);
        }
        Livro livro = new Livro(titulo, anoPublicacao, autor);
        autor.adicionarLivro(livro);
        livros.add(livro);
    }

    public Autor encontrarAutor(String nomeAutor) {
        for (Autor autor : autores) {
            if (autor.getNome().equals(nomeAutor)) {
                return autor;
            }
        }
        return null;
    }

    public void exibirLivros() {
        System.out.println("Livros na biblioteca:");
        for (Livro livro : livros) {
            livro.exibirInformacoes();
            System.out.println();
        }
    }

    public void exibirAutores() {
        System.out.println("Autores na biblioteca:");
        for (Autor autor : autores) {
            autor.exibirInformacoes();
            System.out.println();
        }
    }
}



