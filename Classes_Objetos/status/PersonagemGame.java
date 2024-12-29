public class PersonagemGame {
    private int saudeAtual;
    private String nome;
    private String status;

    public int getSaudeAtual() {
        return saudeAtual;
    }

    public void setSaudeAtual(int saudeAtual) {
        this.saudeAtual = saudeAtual;

        if (this.saudeAtual <= 0)
            status = "morto";
        else
            status = "vivo";
    }

    public String getStatus() {
        return status;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void receberCura(int quantidadeDeCura) {
        setSaudeAtual(saudeAtual + quantidadeDeCura);

        if (saudeAtual > 100)
            saudeAtual = 100;
    }

    public void tomarDano(int quantidadeDeDano) {
        setSaudeAtual(saudeAtual - quantidadeDeDano);

        if (saudeAtual < 0)
            saudeAtual = 0;
    }
}