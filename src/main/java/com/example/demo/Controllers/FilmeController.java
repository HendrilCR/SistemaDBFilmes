package com.example.demo.Controllers;

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
        var filmes = filmeService.findAll();
        model.addAttribute("filmes",filmes);
        return "inicio";
    }

    @GetMapping("/verFilme")
    public String verFilme(@RequestParam int id, Model model) {
        Filme filme = filmeService.getById(id);

        //Puxa apenas as avaliações do id do filme atual
        var avaliacoes = avaliacaoService.findByIdFilme(id);

        model.addAttribute("filme", filme);
        model.addAttribute("avaliacoes", avaliacoes);

        Avaliacao avaliacao = new Avaliacao();
        avaliacao.setIdFilme(filme.getId());

        model.addAttribute("avaliacao", avaliacao);

        return "page-filme";
    }
}
