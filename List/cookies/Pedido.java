import java.util.ArrayList;
import java.util.Iterator;

public class Pedido {
    private ArrayList<PedidoCookie> cookies;

    public Pedido() {
        this.cookies = new ArrayList<PedidoCookie>();
    }

    public void adicionarPedidoCookie(PedidoCookie pedidoCookie) {
        this.cookies.add(pedidoCookie);
    }

    public int obterTotalCaixas() {
        int totalCaixas = 0;

        for (PedidoCookie c : cookies) {
            totalCaixas += c.getQuantidadeCaixas();
        }

        return totalCaixas;
    }

    public int removerSabor(String sabor) {
        int totalCaixasRemovidas = 0;

        Iterator<PedidoCookie> i = this.cookies.iterator();

        while (i.hasNext()) {
            PedidoCookie pedidoCookieAtual = i.next();

            if (pedidoCookieAtual.getSabor() == sabor) {
                totalCaixasRemovidas += pedidoCookieAtual.getQuantidadeCaixas();
                i.remove();
            }
        }

        return totalCaixasRemovidas;
    }
}
