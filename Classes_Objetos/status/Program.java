public class Program {
    public static void main(String[] args) {
        PersonagemGame personagem1 = new PersonagemGame(0, "Sonic");

        System.out.printf("%s, %d, %s\n", personagem1.getNome(), personagem1.getSaudeAtual()
                , personagem1.getStatus());

        personagem1.receberCura(91);
        personagem1.setNome(null);

        System.out.printf("%s, %d, %s\n", personagem1.getNome(), personagem1.getSaudeAtual()
                , personagem1.getStatus());

        personagem1.tomarDano(25);

        System.out.printf("%s, %d, %s\n", personagem1.getNome(), personagem1.getSaudeAtual()
                , personagem1.getStatus());

        personagem1.tomarDano(80);

        System.out.printf("%s, %d, %s\n", personagem1.getNome(), personagem1.getSaudeAtual()
                , personagem1.getStatus());

    }

}
