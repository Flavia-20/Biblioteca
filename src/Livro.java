public class Livro {
    private String titulo;
    private int anoPublicacao;
    private Autor autor;

    public Livro(String titulo, int anoPublicacao, Autor autor) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public Autor getAutor() {
        return autor;
    }

    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Ano de Publicação: " + anoPublicacao);
        System.out.println("Autor: " + autor.getNome());
    }
}
