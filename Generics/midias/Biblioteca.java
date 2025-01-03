import java.util.ArrayList;
import java.util.List;

class Biblioteca<T extends Midia> {
    private List<T> midias = new ArrayList<>();

    public void adicionarMidia(T midia) {
        midias.add(midia);
    }

    public List<T> obterListaMidias() {
        return midias;
    }
}