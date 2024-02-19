package com.topfoodworks.topfoodapi.jpa;

import com.topfoodworks.topfoodapi.domain.model.Cozinha;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CadastrarCozinha {

    @PersistenceContext
    private EntityManager manager;

    public List<Cozinha> listar(){

       return manager.createQuery("from Cozinha",Cozinha.class).getResultList();
    }
}