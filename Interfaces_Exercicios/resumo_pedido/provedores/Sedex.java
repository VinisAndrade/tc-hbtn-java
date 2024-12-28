package provedores;

public class Sedex implements ProvedorFrete {

    @Override
    public Frete calcularFrete(double peso, double valor) {
        double percentual = peso > 1000 ? 0.10 : 0.05; // peso em gramas
        double valorFrete = valor * percentual;
        return new Frete(valorFrete, TipoProvedorFrete.SEDEX);
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.SEDEX;
    }
}
