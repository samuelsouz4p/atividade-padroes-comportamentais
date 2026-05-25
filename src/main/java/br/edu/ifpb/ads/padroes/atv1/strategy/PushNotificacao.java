package br.edu.ifpb.ads.padroes.atv1.strategy;

public class PushNotificacao implements CanalNotificacao {
    @Override
    public void enviar(String mensagem){
        System.out.println("Enviando PUSH: " + mensagem);
    }
}
