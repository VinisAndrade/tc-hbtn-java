package provedores;
import provedores.*;

public class Pedido {
    private String codigo;
    private double peso; // peso em gramas
    private float total;
    private Frete frete;

    public Pedido(String codigo, double peso, int total) {
        this.codigo = codigo;
        this.peso = peso;
        this.total = total;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPeso() {
        return peso;
    }

    public float getTotal() {
        return total;
    }

    public Frete getFrete() {
        return frete;
    }

    public void setFrete(Frete frete) {
        this.frete = frete;
    }
}
