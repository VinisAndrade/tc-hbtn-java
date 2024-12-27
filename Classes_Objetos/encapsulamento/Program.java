public class Program {
    public static void main(String[] args) {
        // Criação de dois personagens
        PersonagemGame personagem1 = new PersonagemGame();
        PersonagemGame personagem2 = new PersonagemGame();

        // Configuração de atributos para o primeiro personagem
        personagem1.nome = "Sonic";
        personagem1.saudeAtual = 10;

        // Configuração de atributos para o segundo personagem
        personagem2.nome = "Mario";
        personagem2.saudeAtual = 100;

        // Impressão dos atributos dos personagens
        System.out.printf("Nome: %s - Saude: %d\n", personagem1.nome, personagem1.saudeAtual);
        System.out.printf("Nome: %s - Saude: %d\n", personagem2.nome, personagem2.saudeAtual);
    }
}
