package service;

import modelo.Cliente;
import notificacao.Notificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {

	private Notificador notificador;

	@Autowired
	public AtivacaoClienteService(Notificador notificador){

		this.notificador = notificador;
	}

	public void ativar(Cliente cliente) {
		cliente.ativar();

		this.notificador.notificar(cliente, "Seu cadastro no sistema esta ATIVO");
	}
	
}
