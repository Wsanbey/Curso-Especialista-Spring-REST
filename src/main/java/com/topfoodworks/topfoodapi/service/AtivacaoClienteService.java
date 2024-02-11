package com.topfoodworks.topfoodapi.service;

import com.topfoodworks.topfoodapi.modelo.Cliente;
import com.topfoodworks.topfoodapi.notificacao.Notificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class AtivacaoClienteService {

	@Autowired
	private Notificador notificador;

	public void ativar(Cliente cliente) {
		cliente.ativar();
		this.notificador.notificar(cliente,"Seu cadastro no sistema está ativo! ");


	}

}
