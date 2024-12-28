package provedores;

public class ProcessadorPedido {
    private ProvedorFrete provedorFrete;

    public ProcessadorPedido(ProvedorFrete provedorFrete) {
        this.provedorFrete = provedorFrete;
    }

    public void processar(Pedido pedido) {
        // Calcula o frete baseado no provedor de frete
        Frete frete = provedorFrete.calcularFrete(pedido.getPeso(), pedido.getTotal());
        pedido.setFrete(frete);
    }
}
