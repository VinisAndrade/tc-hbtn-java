import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Classe Aluno
class Aluno {
    private String nome;
    private int idade;

    // Construtor
    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Sobrescrevendo toString para exibir informações do aluno
    @Override
    public String toString() {
        return "Aluno { Nome: " + nome + ", Idade: " + idade + " }";
    }
}

// Classe principal para gerenciar a lista de alunos
public class GestaoAlunos {
    private List<Aluno> alunos;

    // Construtor
    public GestaoAlunos() {
        alunos = new ArrayList<>();
    }

    // Método para adicionar um aluno
    public void adicionarAluno(String nome, int idade) {
        alunos.add(new Aluno(nome, idade));
        System.out.println("Aluno adicionado com sucesso!");
    }

    // Método para excluir um aluno pelo nome
    public void excluirAluno(String nome) {
        boolean encontrado = false;
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equalsIgnoreCase(nome)) {
                alunos.remove(aluno);
                System.out.println("Aluno removido com sucesso!");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Aluno não encontrado.");
        }
    }

    // Método para buscar um aluno pelo nome
    public void buscarAluno(String nome) {
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Aluno encontrado: " + aluno);
                return;
            }
        }
        System.out.println("Aluno não encontrado.");
    }

    // Método para listar todos os alunos
    public void listarAlunos() {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
        } else {
            System.out.println("Lista de alunos:");
            for (Aluno aluno : alunos) {
                System.out.println(aluno);
            }
        }
    }

    // Método principal
    public static void main(String[] args) {
        GestaoAlunos gestaoAlunos = new GestaoAlunos();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu de Operações:");
            System.out.println("1. Adicionar Aluno");
            System.out.println("2. Excluir Aluno");
            System.out.println("3. Buscar Aluno");
            System.out.println("4. Listar Alunos");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do aluno: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite a idade do aluno: ");
                    int idade = scanner.nextInt();
                    gestaoAlunos.adicionarAluno(nome, idade);
                    break;
                case 2:
                    System.out.print("Digite o nome do aluno a ser excluído: ");
                    String nomeExcluir = scanner.nextLine();
                    gestaoAlunos.excluirAluno(nomeExcluir);
                    break;
                case 3:
                    System.out.print("Digite o nome do aluno a ser buscado: ");
                    String nomeBuscar = scanner.nextLine();
                    gestaoAlunos.buscarAluno(nomeBuscar);
                    break;
                case 4:
                    gestaoAlunos.listarAlunos();
                    break;
                case 5:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 5);

        scanner.close();
    }
}
