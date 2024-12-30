import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWritingExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o nome do arquivo
        System.out.print("Digite o nome do arquivo (com extensão .txt): ");
        String fileName = scanner.nextLine();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            System.out.println("Digite linhas de texto (digite 'sair' para finalizar):");

            while (true) {
                String input = scanner.nextLine();

                // Verifica se o usuário deseja sair
                if (input.equalsIgnoreCase("sair")) {
                    break;
                }

                // Escreve a linha no arquivo
                writer.write(input);
                writer.newLine();
            }

            System.out.println("Arquivo '" + fileName + "' foi criado e salvo com sucesso.");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao criar ou salvar o arquivo: " + e.getMessage());
        }

        scanner.close();
    }
}
