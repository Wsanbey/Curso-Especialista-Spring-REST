package com.topfoodworks.topfoodapi.jpa;

import com.topfoodworks.topfoodapi.TopfoodApiApplication;
import com.topfoodworks.topfoodapi.domain.model.Cozinha;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

public class ConsultaCozinhaMain {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext =  new SpringApplicationBuilder(TopfoodApiApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        CadastrarCozinha cadastrarCozinha = applicationContext.getBean(CadastrarCozinha.class);

        List<Cozinha> cozinhas = cadastrarCozinha.listar();

        for(Cozinha cozinha: cozinhas){
            System.out.println(cozinha.getNome());
        }
    }
}
