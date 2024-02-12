package com.topfoodworks.topfoodapi.notificacao;

import com.topfoodworks.topfoodapi.modelo.Cliente;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("Prod")
@TipoDoNotificador(NivelUrgencia.NORMAL)
@Component
public class NotificadorEmail implements Notificador {

	public NotificadorEmail(){
		System.out.println("PRODUÇÃO CHAMADA");
	}

	@Override
	public void notificar(Cliente cliente , String mensagem) {
		System.out.printf("Notificador %s por Email através do cliente %s: %s \n",
				cliente.getNome(), cliente.getTelefone(), mensagem);
	}

}
