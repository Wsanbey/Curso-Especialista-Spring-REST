package com.topfoodworks.topfoodapi;

import com.topfoodworks.topfoodapi.modelo.Cliente;
import com.topfoodworks.topfoodapi.service.AtivacaoClienteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MeuPrimeiroController {
    private AtivacaoClienteService ativacaoClienteService;

    public MeuPrimeiroController( AtivacaoClienteService ativacaoClienteService) {
        this.ativacaoClienteService = ativacaoClienteService;
        System.out.println("MEU PRIMEIRO CONTROLLER " + this.ativacaoClienteService);

    }
    @GetMapping("/hello")
    @ResponseBody
    public String hello(){

        Cliente joao =  new Cliente("João", "joao.contato@gmail.com","8155557777");
        Cliente maria = new Cliente("Maria","maria@gmail.com.br", "8744458884");

        ativacaoClienteService.ativar(joao);
        ativacaoClienteService.ativar(maria);

        return  joao.getNome() ;
    }
}
