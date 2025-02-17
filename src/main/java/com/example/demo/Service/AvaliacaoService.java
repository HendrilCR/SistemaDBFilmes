package com.example.demo.Service;

import java.util.List;
import com.example.demo.Models.Avaliacao;
import com.example.demo.Repository.AvaliacaoRepository;

import org.springframework.stereotype.Service;

@Service
public class AvaliacaoService {
    private final AvaliacaoRepository repository;

    public AvaliacaoService(AvaliacaoRepository repository){
            this.repository = repository;
    }

    public List<Avaliacao> findAll(){
        return (List<Avaliacao>) repository.findAll();
    }

    public List<Avaliacao> findByIdFilme(int idFilme){
        return (List<Avaliacao>) repository.findByIdFilme(idFilme);
    }
    
}
