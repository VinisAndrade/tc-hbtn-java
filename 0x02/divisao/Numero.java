public class Numero {
    public static void dividir(int a, int b) {
        try {
            // Tentativa de realizar a divisão
            double resultado = (double) a / b; // Cast para double para permitir divisões exatas
        } catch (ArithmeticException e) {
            // Captura de erro no caso de divisão por zero
            System.out.println("Erro: Divisão por zero.");
        } finally {
            // O bloco finally sempre será executado, independente de erro
            System.out.printf("Resultado da divisão: %.2f\n", (double) a / b);
        }
    }
}