package com.topfoodworks.topfoodapi.notificacao;

import com.topfoodworks.topfoodapi.modelo.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("Prod")
@TipoDoNotificador(NivelUrgencia.NORMAL)
@Component
public class NotificadorEmail implements Notificador {

	@Autowired
	private NotificacaoProperties notificacaoProperties;
	public NotificadorEmail(){
		System.out.println("PRODUÇÃO CHAMADA");
	}

	@Override
	public void notificar(Cliente cliente , String mensagem) {
		System.out.println("Host: " + this.notificacaoProperties.getHostServidor());
		System.out.println("Porta: " + this.notificacaoProperties.getPortaServidor());
		System.out.printf("Notificador %s por Email através do cliente %s: %s \n",
				cliente.getNome(), cliente.getTelefone(), mensagem);
	}

}
