package com.puc.psicologiabackend.perguntas;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/perguntas")
public class PerguntasApi {
    
    private final PerguntasService perguntasService;
    
    public PerguntasApi(final PerguntasService perguntasService) {
        this.perguntasService = perguntasService;
    }
    
    @GetMapping
    public List<PerguntasDto> buscarPerguntas() {
        return this.perguntasService.buscarPerguntas();
    }
    
}
