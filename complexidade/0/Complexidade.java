class Complexidade {

    public static int encontrarMaior(int[] numeros) {
        int maior = numeros[0];
        for (int num : numeros) {
            if (num > maior) {
                maior = num;
            }
        }
        return maior;
    }

    public static void main(String[] args) {
        int[] numeros = {10, 20, 5, 15, 30};

        int soma = AlgoritmoExemplo.calcularSoma(numeros);
        int maior = encontrarMaior(numeros);

        System.out.println("Soma dos elementos: " + soma);
        System.out.println("Maior elemento: " + maior);
    }
}
