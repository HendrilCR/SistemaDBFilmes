package com.example.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.Models.Avaliacao;
import com.example.demo.Models.Filme;
import com.example.demo.Service.AvaliacaoService;

@Controller
public class AvaliacaoController{
    
    private final AvaliacaoService avaliacaoService;

    public AvaliacaoController(AvaliacaoService avaliacaoService) {
        this.avaliacaoService = avaliacaoService;
    }


    @PostMapping("/avaliacaoSave")
    public String avaliacaoSave(@ModelAttribute Avaliacao avaliacao) {
        avaliacaoService.avaliacaoSave(avaliacao);
        System.out.println(avaliacao);
        return "redirect:/verFilme?id=" + avaliacao.getIdFilme();
    }
}
