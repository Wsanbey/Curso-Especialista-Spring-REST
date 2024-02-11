package com.topfoodworks.topfoodapi.service;

import com.topfoodworks.topfoodapi.modelo.Cliente;
import com.topfoodworks.topfoodapi.notificacao.Notificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {

	@Autowired (required = false)
	private Notificador notificador;

	public void ativar(Cliente cliente) {
		cliente.ativar();

		if(notificador !=null){
			this.notificador.notificar(cliente, "Seu cadastro no sistema esta ATIVO ");
		}else {
			System.out.printf("Não existe notificador, mas cliente esta ATIVADO");
		}

	}

}
