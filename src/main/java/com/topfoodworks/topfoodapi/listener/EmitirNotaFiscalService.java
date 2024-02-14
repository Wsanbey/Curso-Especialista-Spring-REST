package com.topfoodworks.topfoodapi.listener;

import com.topfoodworks.topfoodapi.service.ClienteAtivadoEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EmitirNotaFiscalService {
    @EventListener
    public void emitirNotaFiscalService(ClienteAtivadoEvent event){
        System.out.println("Emitindo nota fiscal para cliente " + event.getCliente().getNome());

    }
}
