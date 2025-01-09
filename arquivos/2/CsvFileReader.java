import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CsvFileReader {
    public static void main(String[] args) {
        String filePath = "funcionarios.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean isFirstLine = true;

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(","); // Divide a linha por vírgulas (separador CSV)

                // Dividir a linha em colunas usando ","
                String[] columns = line.split(",");

                // Imprimir as informações do funcionário
                System.out.println("Funcionário: " + columns[0]);
                System.out.println("Idade: " + columns[1]);
                System.out.println("Departamento: " + columns[2]);
                System.out.println("Salarial: " + columns[3]);
                System.out.println("------------------------");
            }

            System.out.println("Leitura do arquivo concluída.");
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
