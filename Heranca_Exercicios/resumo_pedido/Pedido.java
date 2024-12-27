import java.util.Locale;

public class Pedido {
    private double percentualDesconto;
    private ItemPedido[] itens;

    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public double calcularTotal() {
        double total = 0.0;
        for (ItemPedido item : itens) {
            total += item.getQuantidade() * item.getProduto().obterPrecoLiquido();
        }
        double desconto = total * (percentualDesconto / 100);
        return total - desconto;
    }

    public void apresentarResumoPedido() {
        Locale.setDefault(Locale.US); // Formatar valores numéricos com ponto decimal
        System.out.println("------- RESUMO PEDIDO -------");

        double totalProdutos = 0.0;

        for (ItemPedido item : itens) {
            Produto produto = item.getProduto();
            double precoLiquido = produto.obterPrecoLiquido();
            double totalItem = precoLiquido * item.getQuantidade();
            totalProdutos += totalItem;

            String tipo = produto instanceof Livro ? "Livro" : "Dvd";
            System.out.printf("Tipo: %s  Titulo: %s  Preco: %.2f  Quant: %d  Total: %.2f%n",
                    tipo, produto.getTitulo(), precoLiquido, item.getQuantidade(), totalItem);
        }

        System.out.println("----------------------------");
        double desconto = totalProdutos * (percentualDesconto / 100);
        System.out.printf("DESCONTO: %.2f%n", desconto);
        System.out.printf("TOTAL PRODUTOS: %.2f%n", totalProdutos);
        System.out.println("----------------------------");
        System.out.printf("TOTAL PEDIDO: %.2f%n", totalProdutos - desconto);
        System.out.println("----------------------------");
    }
}
