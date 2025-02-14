package com.example.demo.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "filmes")

public class Filme {
    @Id
    private int id;
    private String nome;
    private String classificacao_indicativa;
    private String genero;
    private int ano_lancamento;
    private double media_estrelas;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getClassificacao_indicativa() {
        return classificacao_indicativa;
    }
    public void setClassificacao_indicativa(String classificacao_indicativa) {
        this.classificacao_indicativa = classificacao_indicativa;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public int getAno_lancamento() {
        return ano_lancamento;
    }
    public void setAno_lancamento(int ano_lancamento) {
        this.ano_lancamento = ano_lancamento;
    }
    public double getMedia_estrelas() {
        return media_estrelas;
    }
    public void setMedia_estrelas(double media_estrelas) {
        this.media_estrelas = media_estrelas;
    }



}
