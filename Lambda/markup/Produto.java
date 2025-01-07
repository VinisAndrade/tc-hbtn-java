import java.util.function.Consumer;
import java.util.function.Supplier;

public class Produto {
    private String nome;
    private double preco;
    private double percentualMarkup = 10.0; // Valor inicial de 10%

    // Construtor
    public Produto(double preco, String nome) {
        this.preco = preco;
        this.nome = nome;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    // Supplier para calcular o preço com markup
    public Supplier<Double> precoComMarkup = () -> preco + (preco * percentualMarkup / 100);

    // Consumer para atualizar o percentual de markup
    public Consumer<Double> atualizarMarkup = novoMarkup -> percentualMarkup = novoMarkup;
}
