package com.topfoodworks.topfoodapi.notificacao;

import com.topfoodworks.topfoodapi.modelo.Cliente;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("Prod")
@TipoDoNotificador(NivelUrgencia.NORMAL)
@Component
public class NotificadorEmail implements Notificador {

	@Value("${notificador.email.host-servidor}")
	private String host;
	@Value("${notificador.email.porta-servidor}")
	private Integer porta;

	public NotificadorEmail(){
		System.out.println("PRODUÇÃO CHAMADA");
	}

	@Override
	public void notificar(Cliente cliente , String mensagem) {

		System.out.println("Host: " + host);
		System.out.println("Porta: " + porta);

		System.out.printf("Notificador %s por Email através do cliente %s: %s \n",
				cliente.getNome(), cliente.getTelefone(), mensagem);
	}

}
