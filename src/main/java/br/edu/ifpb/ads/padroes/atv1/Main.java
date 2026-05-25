package br.edu.ifpb.ads.padroes.atv1;

import br.edu.ifpb.ads.padroes.atv1.observer.InteressadoArtista;
import br.edu.ifpb.ads.padroes.atv1.observer.InteressadoGenero;
import br.edu.ifpb.ads.padroes.atv1.observer.InteressadoTitulo;
import br.edu.ifpb.ads.padroes.atv1.strategy.EmailNotificacao;
import br.edu.ifpb.ads.padroes.atv1.strategy.PushNotificacao;
import br.edu.ifpb.ads.padroes.atv1.strategy.SmsNotificacao;

public class Main {

    public static void main(String[] args) {

        RepositorioDiscos repositorio = new RepositorioDiscos();

        repositorio.adicionarInteressado(
                new InteressadoGenero(
                        "Heavy Metal",
                        new EmailNotificacao()
                )
        );

        repositorio.adicionarInteressado(
                new InteressadoArtista(
                        "Avenged Sevenfold",
                        new SmsNotificacao()
                )
        );

        repositorio.adicionarInteressado(
                new InteressadoTitulo(
                        "Hail To The King",
                        new PushNotificacao()
                )
        );

        Disco disco = new Disco(
                "Avenged Sevenfold",
                "Hail To The King",
                "Heavy Metal",
                2013
        );

        repositorio.addDisco(disco);
    }
}