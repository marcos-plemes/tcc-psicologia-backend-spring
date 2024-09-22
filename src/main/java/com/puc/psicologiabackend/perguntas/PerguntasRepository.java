package com.puc.psicologiabackend.perguntas;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.puc.psicologiabackend.entidades.Perguntas;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

@Repository
public class PerguntasRepository {
    
    @PersistenceContext
    private EntityManager entityManager;
    
    private CriteriaBuilder cb() {
        return this.entityManager.getCriteriaBuilder();
    }
    
    
    public List<PerguntasDto> buscarPerguntas() {
        CriteriaQuery<PerguntasDto> criteria = this.cb().createQuery(PerguntasDto.class);
        Root<Perguntas> from = criteria.from(Perguntas.class);
        
        criteria.multiselect(
            from.get("codigo"),
            from.get("descricao"));
        
        return this.entityManager.createQuery(criteria).getResultList();
    }
    
}
