import java.util.*;

public abstract class Armazem<T> implements Armazenavel<T> {
    private Map<String, T> itens;

    public Armazem() {
        itens = new HashMap<>();
    }

    public void adicionarAoInventario(String nome, T item) {
        itens.put(nome, item);
    }

    public T obterDoInventario(String nome) {
        return itens.get(nome);
    }
}
