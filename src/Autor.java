import java.util.ArrayList;
import java.util.List;

public class Autor {
    private String nome;
    private List<Livro> livros;


    public Autor(String nome){
        this.nome = nome;
        this.livros = new ArrayList<>();
    }

    public String getNome(){
        return nome;
    }

    public void adicionarLivro(Livro livro){
        livros.add(livro);
    }

    public void exibirInformacoes(){
        System.out.println("Autor: " + nome);
        System.out.println("Livros: ");
            for (Livro livro: livros){
                System.out.println(" - "+ livro.getTitulo() + " (" + livro.getAnoPublicacao() + ")");
            }
    }


}
