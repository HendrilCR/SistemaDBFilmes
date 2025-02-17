package com.example.demo.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Models.Filme;

@Repository
public interface FilmeRepository extends CrudRepository<Filme,Long>{
    @Query("SELECT f FROM Filme f WHERE f.id = ?1")
    public Filme getById(int id);
}