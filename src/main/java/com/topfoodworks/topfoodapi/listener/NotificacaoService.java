package com.topfoodworks.topfoodapi.listener;

import com.topfoodworks.topfoodapi.notificacao.NivelUrgencia;
import com.topfoodworks.topfoodapi.notificacao.Notificador;
import com.topfoodworks.topfoodapi.notificacao.TipoDoNotificador;
import com.topfoodworks.topfoodapi.service.ClienteAtivadoEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class NotificacaoService {

    @TipoDoNotificador(NivelUrgencia.URGENTE)
    @Autowired
    private Notificador notificador;

    @EventListener
    public void clienteAtivadoListener (ClienteAtivadoEvent event){
       notificador.notificar(event.getCliente(),"Seu cadastro no sistema está ativo!");
    }

}
