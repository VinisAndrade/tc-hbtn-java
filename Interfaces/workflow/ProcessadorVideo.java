import java.util.ArrayList;
import java.util.List;

public class ProcessadorVideo {
    private List<CanalNotificacao> canais;

    public ProcessadorVideo() {
        this.canais = new ArrayList<>();
    }

    public void registrarCanal(CanalNotificacao canal) {
        canais.add(canal);
    }

    public void processar(Video video) {
        String mensagemTexto = String.format("%s - %s", video.getArquivo(), video.getFormato());
        Mensagem mensagem = new Mensagem(mensagemTexto, TipoMensagem.LOG);

        for (CanalNotificacao canal : canais) {
            canal.notificar(mensagem);
        }
    }
}