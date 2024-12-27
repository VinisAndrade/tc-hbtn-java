public class PersonagemGame {

    // Atributos privados
    private int saudeAtual;
    private String nome;
    private String status;

    // Construtor
    public PersonagemGame(int saudeInicial, String nomeInicial) {
        setSaudeAtual(saudeInicial);
        setNome(nomeInicial);
    }

    // Getter para saudeAtual
    public int getSaudeAtual() {
        return saudeAtual;
    }

    // Setter para saudeAtual
    public void setSaudeAtual(int saudeAtual) {
        /*if (saudeAtual < 0) {
            this.saudeAtual = 0;
        } else if (saudeAtual > 100) {
            this.saudeAtual = 100;
        } else {
            this.saudeAtual = saudeAtual;
        }*/

        if (this.saudeAtual > 0) {
            this.status = "vivo";
        } else {
            this.status = "morto";
        }
    }

    // Getter para nome
    public String getNome() {
        return nome;
    }

    // Setter para nome
    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        }
    }

    // Getter para status
    public String getStatus() {
        return status;
    }

    // Método tomarDano
    public void tomarDano(int quantidadeDeDano) {
        setSaudeAtual(this.saudeAtual - quantidadeDeDano);
    }

    // Método receberCura
    public void receberCura(int quantidadeDeCura) {
        setSaudeAtual(this.saudeAtual + quantidadeDeCura);
    }
}
