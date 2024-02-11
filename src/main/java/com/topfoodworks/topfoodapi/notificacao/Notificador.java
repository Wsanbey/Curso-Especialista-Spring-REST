package com.topfoodworks.topfoodapi.notificacao;

import com.topfoodworks.topfoodapi.modelo.Cliente;

public interface Notificador {
    void notificar(Cliente cliente, String mensagem);
}
