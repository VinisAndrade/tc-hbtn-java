/*class Midia {
    private String nome;

    public Midia(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return String.format("Tipo: %s - Nome: %s", this.getClass().getSimpleName(), getNome());
    }
}*/

abstract class Midia {
    private String nome;
    private String tipo;

    public Midia(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "[Tipo: " + tipo + " - Nome: " + nome + "]";
    }
}