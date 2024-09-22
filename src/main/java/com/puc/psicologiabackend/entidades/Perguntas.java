package com.puc.psicologiabackend.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "perguntas")
public class Perguntas {
    
    @Id
    @SequenceGenerator(name = "seq_perguntas", sequenceName = "perguntas_pg_codigo_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_perguntas")
    @Column(name = "pg_codigo", nullable = false)
    private Integer codigo;
    
    @Column(name = "pg_descricao", nullable = false)
    private String descricao;
    
    @Column(name = "pg_imagem", nullable = false)
    private byte[] imagem;
    
    public Integer getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(final Integer codigo) {
        this.codigo = codigo;
    }
    
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(final String descricao) {
        this.descricao = descricao;
    }
    
    public byte[] getImagem() {
        return this.imagem;
    }
    
    public void setImagem(final byte[] imagem) {
        this.imagem = imagem;
    }
    
}
