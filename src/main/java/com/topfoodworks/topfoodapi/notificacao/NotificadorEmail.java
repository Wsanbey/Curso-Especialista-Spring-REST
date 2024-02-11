package com.topfoodworks.topfoodapi.notificacao;

import com.topfoodworks.topfoodapi.modelo.Cliente;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class NotificadorEmail implements Notificador {

	@Override
	public void notificar(Cliente cliente , String mensagem) {
		System.out.printf("Notificador %s por Email através do cliente %s: %s \n",
				cliente.getNome(), cliente.getTelefone(), mensagem);
	}

}
