package provedores;

public class Loggi implements ProvedorFrete {
    private static final TipoProvedorFrete tipoFrete = TipoProvedorFrete.LOGGI;

    public Frete calcularFrete(double peso, double valor) {
        if (peso > 5000) {
            return new Frete(valor * 0.12, tipoFrete);
        } else {
            return new Frete(valor * 0.04, tipoFrete);
        }
    }

    public TipoProvedorFrete obterTipoProvedorFrete()  {
        return TipoProvedorFrete.LOGGI;
    }
}