public class ContarMaiores {


    public static int contarMaioresQue(int[] numeros, int valor) {
        int contador = 0;
        for (int numero : numeros) {
            if (numero > valor) {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        int[] numeros = {3, 10, 7, 25, 15, 2};
        int valor = 10;

        System.out.println("Array: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        System.out.println("\nNúmero de elementos maiores que " + valor + ": " + contarMaioresQue(numeros, valor));
    }
}
