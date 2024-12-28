import exceptions.AutorInvalidoException;
import exceptions.LivroInvalidoException;

public class Livro {
    private String titulo;
    private String autor;
    private float preco;

    public Livro(String titulo, String autor, float preco) throws AutorInvalidoException, LivroInvalidoException {
        setTitulo(titulo);
        setAutor(autor);
        setPreco(preco);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public float getPreco() {
        return preco;
    }

    public void setTitulo(String titulo) throws LivroInvalidoException {
        if (titulo.length() < 3) {
            throw new LivroInvalidoException("Titulo de livro invalido");
        }
        this.titulo = titulo;
    }

    public void setAutor(String autor) throws AutorInvalidoException {
        if (autor.split(" ").length < 2) {
            throw new AutorInvalidoException("Nome de autor invalido");
        }
        this.autor = autor;
    }

    public void setPreco(double preco) throws LivroInvalidoException {
        if (preco <= 0) {
            throw new LivroInvalidoException("Preco de livro invalido");
        }
        this.preco = preco;
    }
}
