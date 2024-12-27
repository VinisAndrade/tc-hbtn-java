public class PersonagemGame {
    //public int saudeAtual; // Atributo público de saúde
    //public String nome;    // Atributo público de nome
    // Atributos privados
    private int saudeAtual;
    private String nome;

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

    // Método tomarDano
    public void tomarDano(int quantidadeDeDano) {
        this.saudeAtual -= quantidadeDeDano;
        if (this.saudeAtual < 0) {
            this.saudeAtual = 0;
        }
    }

    // Método receberCura
    public void receberCura(int quantidadeDeCura) {
        this.saudeAtual += quantidadeDeCura;
        if (this.saudeAtual > 100) {
            this.saudeAtual = 100;
        }
    }
}
