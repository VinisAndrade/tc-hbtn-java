package provedores;

public class JadLog implements ProvedorFrete {
    private static final TipoProvedorFrete tipoFrete = TipoProvedorFrete.JADLOG;

    public Frete calcularFrete(double peso, double valor) {
        if (peso > 2000) {
            return new Frete(valor * 0.07, tipoFrete);
        } else {
            return new Frete(valor * 0.045, tipoFrete);
        }
    }

    public TipoProvedorFrete obterTipoProvedorFrete()  {
        return TipoProvedorFrete.JADLOG;
    }
}