public class Principal {
    public static void main(String[] args) throws InterruptedException {
        // Instancia o contador
        Contador contador = new Contador();

        // Cria duas threads que irão incrementar o contador
        ThreadContador thread1 = new ThreadContador(contador);
        ThreadContador thread2 = new ThreadContador(contador);

        // Inicia as threads
        thread1.start();
        thread2.start();

        // Aguarda as threads terminarem
        thread1.join();
        thread2.join();

        // Imprime o valor final do contador
        System.out.println("Valor final do contador: " + contador.getContagem());
    }
}