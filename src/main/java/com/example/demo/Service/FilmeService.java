package com.example.demo.Service;

import java.util.List;
import com.example.demo.Models.Filme;
import com.example.demo.Repository.FilmeRepository;

import org.springframework.stereotype.Service;

@Service
public class FilmeService {
    private final FilmeRepository repository;

    public FilmeService(FilmeRepository repository){
            this.repository = repository;
    }

    public List<Filme> findAll(){
        return (List<Filme>) repository.findAll();
    }
}
