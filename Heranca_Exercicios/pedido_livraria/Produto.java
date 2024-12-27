package produtos;

public abstract class Produto {
    private String titulo;
    private int ano;
    private String pais;
    private double precoBruto;

    // Construtor
    public Produto(String titulo, int ano, String pais, double precoBruto) {
        this.titulo = titulo;
        this.ano = ano;
        this.pais = pais;
        this.precoBruto = precoBruto;
    }

    // Método abstrato
    public abstract double obterPrecoLiquido();

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public int getAno() {
        return ano;
    }

    public String getPais() {
        return pais;
    }

    public double getPrecoBruto() {
        return precoBruto;
    }
}
