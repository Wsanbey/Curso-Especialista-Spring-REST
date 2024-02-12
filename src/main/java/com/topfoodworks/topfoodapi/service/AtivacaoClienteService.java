package com.topfoodworks.topfoodapi.service;

import com.topfoodworks.topfoodapi.modelo.Cliente;
import com.topfoodworks.topfoodapi.notificacao.NivelUrgencia;
import com.topfoodworks.topfoodapi.notificacao.Notificador;
import com.topfoodworks.topfoodapi.notificacao.TipoDoNotificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@TipoDoNotificador(value = NivelUrgencia.NORMAL)
@Component
public class AtivacaoClienteService {

	@Autowired
	private Notificador notificador;

	public void ativar(Cliente cliente) {
		cliente.ativar();

		this.notificador.notificar(cliente,"Seu cadastro no sistema está ativo! ");
	}

}
