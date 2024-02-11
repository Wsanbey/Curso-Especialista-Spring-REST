package com.topfoodworks.topfoodapi.notificacao;


import com.topfoodworks.topfoodapi.modelo.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NotificadorSMS implements Notificador{

    @Override
    public void notificar(Cliente cliente , String mensagem){
        System.out.printf("Notificador %s por SMS através do cliente %s: %s \n",
        cliente.getNome(), cliente.getTelefone(), mensagem);  }
}
