package com.example.demo.Repository;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Models.Avaliacao;

@Repository
public interface AvaliacaoRepository extends CrudRepository<Avaliacao,Long>{
    List<Avaliacao> findByIdFilme(int idFilme); 
}