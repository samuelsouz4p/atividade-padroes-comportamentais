package br.edu.ifpb.ads.padroes.atv1.strategy;

public class SmsNotificacao implements CanalNotificacao{
    @Override
    public void enviar(String mensagem){
        System.out.println("Enviando SMS: " + mensagem);
    }
}
