package produtos;

public abstract class Produto {
    protected String titulo;
    protected int ano;
    protected String pais;
    protected double precoBruto;

    public Produto(String titulo, int ano, String pais, double precoBruto) {
        this.titulo = titulo;
        this.ano = ano;
        this.pais = pais;
        this.precoBruto = precoBruto;
    }

    @Override
    public String toString() {
        return String.format("Tipo: %s  Titulo: %s  Preco: %.2f", this.getClass().getSimpleName(), this.titulo,
                this.obterPrecoLiquido());
    }

    public double getPrecoBruto() {
        return precoBruto;
    }

    public abstract double obterPrecoLiquido();
}
