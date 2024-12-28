package provedores;
import provedores.*;

public class Pedido {
    private String codigo;
    private int peso; // peso em gramas
    private int total;
    private Frete frete;

    public Pedido(String codigo, int peso, int total) {
        this.codigo = codigo;
        this.peso = peso;
        this.total = total;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getPeso() {
        return peso;
    }

    public int getTotal() {
        return total;
    }

    public Frete getFrete() {
        return frete;
    }

    public void setFrete(Frete frete) {
        this.frete = frete;
    }
}
