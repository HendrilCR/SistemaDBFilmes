package com.example.demo.Controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.Models.Filme;
import com.example.demo.Service.FilmeService;

@Controller
public class FilmeController{
    
    private final FilmeService filmeService;

    public FilmeController(FilmeService filmeService) {
        this.filmeService = filmeService;
    }

    @GetMapping("/inicio")
    public String inicio(){
        var filmes = (List<Filme>) filmeService.findAll();
        System.out.println(filmes); 
        System.out.println(filmes.get(0).getNome());
        return "inicio";
    }
}
