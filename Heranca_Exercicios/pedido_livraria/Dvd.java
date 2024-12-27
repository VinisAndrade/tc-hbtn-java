package produtos;

public class Dvd extends Produto {
    private String diretor;
    private String genero;
    private int duracao;

    // Construtor
    public Dvd(String titulo, int ano, String pais, double precoBruto, String diretor, String genero, int duracao) {
        super(titulo, ano, pais, precoBruto);
        this.diretor = diretor;
        this.genero = genero;
        this.duracao = duracao;
    }

    // Sobrescrita do método abstrato
    @Override
    public double obterPrecoLiquido() {
        return getPrecoBruto() * 1.20;  // Acréscimo de 20%
    }

    // Getters
    public String getDiretor() {
        return diretor;
    }

    public String getGenero() {
        return genero;
    }

    public int getDuracao() {
        return duracao;
    }
}
