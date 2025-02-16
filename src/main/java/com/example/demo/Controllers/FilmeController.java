package com.example.demo.Controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Models.Filme;
import com.example.demo.Service.FilmeService;

@Controller
public class FilmeController{
    
    private final FilmeService filmeService;

    public FilmeController(FilmeService filmeService) {
        this.filmeService = filmeService;
    }

    @GetMapping("/inicio")
    public String inicio(Model model){
        var filmes = (List<Filme>) filmeService.findAll();
        System.out.println(filmes); 
        System.out.println(filmes.get(0).getNome());

        String texto = "MANOO";

        model.addAttribute("texto", texto);
        model.addAttribute("filmes",filmes);
        return "inicio";
    }

    @GetMapping("/verFilme")
    public String verFilme(@RequestParam int id, Model model) {
        var filmes = (List<Filme>) filmeService.findAll();
        Filme filme = filmes.get(id-1);

        model.addAttribute("filme", filme);

        return "page-filme";
    }
}
