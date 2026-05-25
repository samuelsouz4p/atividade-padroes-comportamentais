package br.edu.ifpb.ads.padroes.atv1.observer;

import br.edu.ifpb.ads.padroes.atv1.Disco;
import br.edu.ifpb.ads.padroes.atv1.strategy.CanalNotificacao;

public class InteressadoGenero implements Interessado {
    private String genero;
    private CanalNotificacao canal;

    public InteressadoGenero(String genero, CanalNotificacao canal){
        this.genero = genero;
        this.canal = canal;
    }

    @Override
    public void atualizar(Disco disco){
        if(disco.getGenero().equalsIgnoreCase(genero)){
            canal.enviar("Novo disco do gênero: " + genero);
        }
    }
}
