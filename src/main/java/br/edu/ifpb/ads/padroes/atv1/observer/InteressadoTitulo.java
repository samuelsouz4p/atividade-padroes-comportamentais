package br.edu.ifpb.ads.padroes.atv1.observer;

import br.edu.ifpb.ads.padroes.atv1.Disco;
import br.edu.ifpb.ads.padroes.atv1.strategy.CanalNotificacao;

public class InteressadoTitulo implements Interessado {

    private String titulo;
    private CanalNotificacao canal;

    public InteressadoTitulo(String titulo, CanalNotificacao canal){
        this.titulo = titulo;
        this.canal = canal;
    }

    @Override
    public void atualizar(Disco disco){
        if(disco.getTitulo().equalsIgnoreCase(titulo)){
            canal.enviar("Novo disco adicionado: " + titulo);
        }
    }
}