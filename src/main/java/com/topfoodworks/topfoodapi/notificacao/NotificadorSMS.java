package com.topfoodworks.topfoodapi.notificacao;


import com.topfoodworks.topfoodapi.modelo.Cliente;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
@Profile("Dev")
@TipoDoNotificador(NivelUrgencia.URGENTE)
@Component
public class NotificadorSMS implements Notificador{
    public NotificadorSMS(){
        System.out.println("DESENVOLVIMENTO CHAMADA");
    }
    @Override
    public void notificar(Cliente cliente , String mensagem){
        System.out.printf("MOCK: Notificador seria enviado por SMS para %s  através do cliente %s: %s \n",
        cliente.getNome(), cliente.getTelefone(), mensagem);  }
}
