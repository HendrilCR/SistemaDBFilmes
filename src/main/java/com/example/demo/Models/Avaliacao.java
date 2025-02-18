package com.example.demo.Models;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "avaliacoes")


public class Avaliacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "idusuario")
    private int idUsuario;
    
    @Column(name = "idfilme")
    private int idFilme;
    
    private String comentario;
    private int estrelas;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    public int getIdUsuario() {
        return idUsuario;
    }
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdFilme() {
        return idFilme;
    }
    public void setIdFilme(int idFilme) {
        this.idFilme = idFilme;
    }
    public String getComentario() {
        return comentario;
    }
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    public int getEstrelas() {
        return estrelas;
    }
    public void setEstrelas(int estrelas) {
        this.estrelas = estrelas;
    }

}