package produtos;

public class Livro extends Produto {
    private int paginas;
    private String autor;
    private int edicao;

    // Construtor
    public Livro(String titulo, int ano, String pais, double precoBruto, int paginas, String autor, int edicao) {
        super(titulo, ano, pais, precoBruto);
        this.paginas = paginas;
        this.autor = autor;
        this.edicao = edicao;
    }

    // Sobrescrita do método abstrato
    @Override
    public double obterPrecoLiquido() {
        return getPrecoBruto() * 1.15;  // Acréscimo de 15%
    }

    // Getters
    public int getPaginas() {
        return paginas;
    }

    public String getAutor() {
        return autor;
    }

    public int getEdicao() {
        return edicao;
    }
}
