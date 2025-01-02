
public class GestaoAlunos {
    private List<Aluno> alunos = new ArrayList<>();

    public void adicionarAluno(String nome, int idade) {
        Aluno aluno = new Aluno(nome, idade);
        alunos.add(aluno);
        System.out.println("Aluno adicionado: " + aluno);
    }

    public void excluirAluno(String nome) {
        boolean encontrado = false;
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equalsIgnoreCase(nome)) {
                alunos.remove(aluno);
                System.out.println("Aluno removido: " + aluno);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Aluno com nome '" + nome + "' não encontrado.");
        }
    }

    public void buscarAluno(String nome) {
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Aluno encontrado: " + aluno);
                return;
            }
        }
        System.out.println("Aluno com nome '" + nome + "' não encontrado.");
    }

    public void listarAlunos() {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
        } else {
            System.out.println("Lista de alunos cadastrados:");
            for (Aluno aluno : alunos) {
                System.out.println(aluno);
            }
        }
    }

    public static void main(String[] args) {
        GestaoAlunos gestao = new GestaoAlunos();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar aluno");
            System.out.println("2. Excluir aluno pelo nome");
            System.out.println("3. Buscar aluno pelo nome");
            System.out.println("4. Listar todos os alunos");
            System.out.println("5. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do teclado

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do aluno:");
                    String nome = scanner.nextLine();
                    System.out.println("Digite a idade do aluno:");
                    int idade = scanner.nextInt();
                    gestao.adicionarAluno(nome, idade);
                    break;
                case 2:
                    System.out.println("Digite o nome do aluno a ser excluído:");
                    nome = scanner.nextLine();
                    gestao.excluirAluno(nome);
                    break;
                case 3:
                    System.out.println("Digite o nome do aluno a ser buscado:");
                    nome = scanner.nextLine();
                    gestao.buscarAluno(nome);
                    break;
                case 4:
                    gestao.listarAlunos();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
