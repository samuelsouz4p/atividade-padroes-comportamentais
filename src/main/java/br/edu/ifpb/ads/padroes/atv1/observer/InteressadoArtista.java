package br.edu.ifpb.ads.padroes.atv1.observer;

import br.edu.ifpb.ads.padroes.atv1.Disco;
import br.edu.ifpb.ads.padroes.atv1.strategy.CanalNotificacao;

public class InteressadoArtista implements Interessado {
    private String artista;
    private CanalNotificacao canal;

    public InteressadoArtista(String artista, CanalNotificacao canal){
        this.artista = artista;
        this.canal = canal;
    }

    @Override
    public void atualizar(Disco disco){
        if(disco.getArtista().equalsIgnoreCase(artista)){
            canal.enviar("Novo disco do artista: " + artista);
        }
    }
}
