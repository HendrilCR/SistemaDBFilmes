package com.example.demo.Controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Models.Avaliacao;
import com.example.demo.Models.Filme;
import com.example.demo.Service.AvaliacaoService;
import com.example.demo.Service.FilmeService;

@Controller
public class FilmeController{
    
    private final FilmeService filmeService;
    private final AvaliacaoService avaliacaoService;

    public FilmeController(FilmeService filmeService, AvaliacaoService avaliacaoService) {
        this.filmeService = filmeService;
        this.avaliacaoService = avaliacaoService;
    }


    @GetMapping("/inicio")
    public String inicio(Model model){
        var filmes = (List<Filme>) filmeService.findAll();
        System.out.println(filmes); 
        System.out.println(filmes.get(0).getNome());

        model.addAttribute("filmes",filmes);
        return "inicio";
    }

    @GetMapping("/verFilme")
    public String verFilme(@RequestParam int id, Model model) {
        var filmes = (List<Filme>) filmeService.findAll();
        var avaliacoes = (List<Avaliacao>) avaliacaoService.findAll();
        Filme filme = filmes.get(id-1);

        model.addAttribute("filme", filme);
        model.addAttribute("avaliacoes", avaliacoes);

        return "page-filme";
    }
}
