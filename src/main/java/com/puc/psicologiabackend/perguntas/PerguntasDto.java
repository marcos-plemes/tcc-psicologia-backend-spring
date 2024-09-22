package com.puc.psicologiabackend.perguntas;

public class PerguntasDto {
    
    private Integer codigo;
    
    private String descricao;
    
    private byte[] imagem;
    
    public PerguntasDto() {
    }
    
    public PerguntasDto(final Integer codigo, final String descricao, final byte[] imagem) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.imagem = imagem;
    }
    
    public PerguntasDto(final Integer codigo, final String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }
    
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
