package provedores;

public interface ProvedorFrete {
    public TipoProvedorFrete obterTipoProvedorFrete();
    public Frete calcularFrete(double peso, double valor);
}
