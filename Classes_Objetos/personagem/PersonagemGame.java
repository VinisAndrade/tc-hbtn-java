public class PersonagemGame {
    // Atributos privados
    private int saudeAtual;
    private String nome;

    // Construtor da classe
    public PersonagemGame(int saudeAtual, String nome) {
        this.saudeAtual = saudeAtual;
        this.nome = nome;
    }

    // Getter para saudeAtual
    public int getSaudeAtual() {
        return saudeAtual;
    }

    // Setter para saudeAtual
    public void setSaudeAtual(int saudeAtual) {
        this.saudeAtual = saudeAtual;
    }

    // Getter para nome
    public String getNome() {
        return nome;
    }

    // Setter para nome
    public void setNome(String nome) {
        this.nome = nome;
    }
}
