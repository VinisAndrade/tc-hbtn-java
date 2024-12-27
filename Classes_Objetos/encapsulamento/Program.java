public class PersonagemGame {

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

    public static void main(String[] args) {
        // Criando uma instância de PersonagemGame
        PersonagemGame personagem = new PersonagemGame();

        // Configurando os valores
        personagem.setNome("Aragorn");
        personagem.setSaudeAtual(100);

        // Exibindo os valores
        System.out.println("Nome do Personagem: " + personagem.getNome());
        System.out.println("Saúde Atual: " + personagem.getSaudeAtual());
    }
}