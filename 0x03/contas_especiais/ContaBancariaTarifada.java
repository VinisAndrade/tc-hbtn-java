public class ContaBancariaTarifada extends ContaBancariaBasica {
    private int quantidadeTransacoes;

    public ContaBancariaTarifada(String numeracao, double taxaJurosAnual) {
        super(numeracao, taxaJurosAnual);
        this.quantidadeTransacoes = 0;
    }

    public int getQuantidadeTransacoes() {
        return quantidadeTransacoes;
    }

    @Override
    public void depositar(double valor) throws OperacaoInvalidaException {
        super.depositar(valor);
        quantidadeTransacoes++;
        sacar(0.10); // Cobrança da tarifa
    }

    @Override
    public void sacar(double valor) throws OperacaoInvalidaException {
        super.sacar(valor + 0.10); // Inclui a tarifa na operação
        quantidadeTransacoes++;
    }
}
