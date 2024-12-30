package provedores;

public class Sedex implements ProvedorFrete {
    private static final TipoProvedorFrete tipoFrete = TipoProvedorFrete.SEDEX;

    public Frete calcularFrete(double peso, double valor) {
        if (peso > 1000) {
            return new Frete(valor * 0.10, tipoFrete);
        } else {
            return new Frete(valor * 0.05, tipoFrete);
        }
    }

    public TipoProvedorFrete obterTipoProvedorFrete()  {
        return TipoProvedorFrete.SEDEX;
    }    
}