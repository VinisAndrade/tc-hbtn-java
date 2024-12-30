public class Pedido {
    private double percentualDesconto;
    private ItemPedido[] itens;

    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public double getPercentualDesconto() {
        return this.percentualDesconto;
    }

    public ItemPedido[] getItens() {
        return this.itens;
    }

    private double totalProdutos() {
        double totalProdutos = 0;

        for (ItemPedido i : this.itens) {
            totalProdutos += i.getQuantidade() * i.getProduto().obterPrecoLiquido();
        }

        return totalProdutos;
    }

    public double calcularTotal() {
        double total = totalProdutos();

        if (this.percentualDesconto != 0) {
            total -= (total * percentualDesconto / 100);
        }

        return total;
    }

    public void apresentarResumoPedido() {
        System.out.println("------- RESUMO PEDIDO -------");
        for (ItemPedido i : this.itens) {
            System.out.printf(i + "\n");
        }
        System.out.println("----------------------------");
        System.out.printf("DESCONTO: %.2f\n",
                percentualDesconto == 0 ? 0 : totalProdutos() * (percentualDesconto / 100));
        System.out.printf("TOTAL PRODUTOS: %.2f\n", totalProdutos());
        System.out.println("----------------------------");
        System.out.printf("TOTAL PEDIDO: %.2f\n", calcularTotal());
        System.out.println("----------------------------");
    }
}
