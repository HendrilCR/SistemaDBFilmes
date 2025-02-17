package com.example.demo.Repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Models.Avaliacao;

@Repository
public interface AvaliacaoRepository extends CrudRepository<Avaliacao,Long>{

}