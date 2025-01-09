import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CsvFileReader {
    public static void main(String[] args) {
        String fileName = "funcionarios.csv"; // Nome do arquivo CSV

        // Inicializa o BufferedReader
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;

            // Lê cada linha do arquivo
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(","); // Divide a linha por vírgulas (separador CSV)

                // Exibe os dados do funcionário
                System.out.println("Funcionário: " + data[0]);
                System.out.println("Idade: " + data[1]);
                System.out.println("Departamento: " + data[2]);
                System.out.println("Salarial: " + data[3]);
                System.out.println("------------------------");
            }

            System.out.println("Leitura do arquivo concluída.");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
