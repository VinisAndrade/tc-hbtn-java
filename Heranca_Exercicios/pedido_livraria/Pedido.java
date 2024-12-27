package produtos;

public class Pedido {
    private double percentualDesconto;
    private ItemPedido[] itens;

    // Construtor
    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    // Método para calcular o total
    public double calcularTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            double precoLiquido = item.getProduto().obterPrecoLiquido();
            total += precoLiquido * item.getQuantidade();
        }
        total -= total * (percentualDesconto / 100);  // Aplicando desconto
        return total;
    }

    // Getter
    public double getPercentualDesconto() {
        return percentualDesconto;
    }
}
