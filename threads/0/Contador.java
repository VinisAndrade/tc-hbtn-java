public class Contador {
    private int count = 0;

    // Método sincronizado para garantir que o contador seja atualizado de maneira segura
    public synchronized void incrementar() {
        count++;
    }

    public int getContagem() {
        return count;
    }
}

class ThreadContador extends Thread {
    private Contador contador;

    public ThreadContador(Contador contador) {
        this.contador = contador;
    }

    @Override
    public void run() {
        // Cada thread incrementa o contador 1000 vezes
        for (int i = 0; i < 1000; i++) {
            contador.incrementar();
        }
    }
}
