public class ProdutorConsumidor {
    public static void main(String[] args) {
        // Criar o buffer compartilhado
        Buffer buffer = new Buffer();

        // Criar e iniciar a thread do produtor
        Produtor produtor = new Produtor(buffer);
        produtor.start();

        // Criar e iniciar a thread do consumidor
        Consumidor consumidor = new Consumidor(buffer);
        consumidor.start();
    }
}
