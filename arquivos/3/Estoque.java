import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private String filePath;
    private List<Produto> produtos;

    public Estoque(String filePath) {
        this.filePath = filePath;
        this.produtos = new ArrayList<>();
        carregarProdutos();
    }

    // Carrega os produtos do arquivo CSV
    private void carregarProdutos() {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");
                if (fields.length == 4) {
                    int id = Integer.parseInt(fields[0]);
                    String nome = fields[1];
                    int quantidade = Integer.parseInt(fields[2]);
                    double preco = Double.parseDouble(fields[3]);
                    produtos.add(new Produto(id, nome, quantidade, preco));
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao carregar produtos: " + e.getMessage());
        }
    }

    // Salva os produtos no arquivo CSV
    private void salvarProdutos() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            for (Produto produto : produtos) {
                bw.write(produto.toCsv());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar produtos: " + e.getMessage());
        }
    }

    // Adiciona um novo produto
    public void adicionarProduto(String nome, int quantidade, double preco) {
        int novoId = produtos.isEmpty() ? 1 : produtos.get(produtos.size() - 1).getId() + 1;
        Produto novoProduto = new Produto(novoId, nome, quantidade, preco);
        produtos.add(novoProduto);
        salvarProdutos();
        System.out.println("Produto adicionado com sucesso!");
    }

    // Exclui um produto pelo ID
    public void excluirProduto(int id) {
        boolean removido = produtos.removeIf(produto -> produto.getId() == id);
        if (removido) {
            salvarProdutos();
            System.out.println("Produto removido com sucesso!");
        } else {
            System.out.println("Produto com ID " + id + " não encontrado.");
        }
    }

    // Exibe todos os produtos
    public void exibirEstoque() {
        if (produtos.isEmpty()) {
            System.out.println("Estoque vazio.");
        } else {
            for (Produto produto : produtos) {
                System.out.println(produto);
            }
        }
    }

    // Atualiza a quantidade de um produto
    public void atualizarQuantidade(int id, int novaQuantidade) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                produto.setQuantidade(novaQuantidade);
                salvarProdutos();
                System.out.println("Quantidade atualizada com sucesso!");
                return;
            }
        }
        System.out.println("Produto com ID " + id + " não encontrado.");
    }
}
