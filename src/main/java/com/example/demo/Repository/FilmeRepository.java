package com.example.demo.Repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Models.Filme;

@Repository
public interface FilmeRepository extends CrudRepository<Filme,Long>{

}