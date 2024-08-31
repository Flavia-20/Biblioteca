import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Scanner input = new Scanner(System.in);

        System.out.println("O que deseja fazer?");
        System.out.println("""
                    1-Adicionar livros na biblioteca;
                    2-Exibir os livros da biblioteca;
                    3-Exibir os autores da biblioteca.""");
        int menu = input.nextInt();
        if (menu == 1){
            System.out.println("Adicionando os livros na biblioteca");
                System.out.println("Digite o titulo do livro: ");
                String titulo = input.next();
                System.out.println("Digite o ano de publicação do livro: ");
                int anoDePublicacao = input.nextInt();
                System.out.println("Digite o nome do autor do autor: ");
                String nomeDoAutor = input.next();

                biblioteca.adicionarLivro(titulo,anoDePublicacao,nomeDoAutor);

                biblioteca.exibirLivros();
        } else if (menu == 2) {
            biblioteca.exibirLivros();
        }else {
            biblioteca.exibirAutores();
        }

    }
}




