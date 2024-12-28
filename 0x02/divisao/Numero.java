public class Numero {
    public static void dividir(int a, int b) {
        try {
            // Realiza a divisão
            int resultado = a / b;
            System.out.printf("%d / %d = %d\n", a, b, resultado);
        } catch (ArithmeticException e) {
            // Captura a exceção de divisão por zero
            System.out.println("Nao eh possivel dividir por zero");
        } finally {
            // Sempre será executado, imprime a linha de resultado ou erro
            if (b != 0) {
                // Caso não tenha erro de divisão por zero, imprime o resultado
                int resultado = a / b;
                System.out.printf("%d / %d = %d\n", a, b, resultado);
            } else {
                // Caso b seja zero, imprima a mensagem de erro
                System.out.println("Nao eh possivel dividir por zero");
            }
        }
    }
}
