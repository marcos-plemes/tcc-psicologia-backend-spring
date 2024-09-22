package com.puc.psicologiabackend.perguntas;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class PerguntasService {
    
    private final PerguntasRepository perguntasRepository;
    
    public PerguntasService(final PerguntasRepository perguntasRepository) {
        this.perguntasRepository = perguntasRepository;
    }
    
    public List<PerguntasDto> buscarPerguntas() {
        return this.perguntasRepository.buscarPerguntas();
    }
    
}
