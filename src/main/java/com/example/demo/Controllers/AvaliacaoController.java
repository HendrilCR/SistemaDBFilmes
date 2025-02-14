package com.example.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/avaliacoes")
public class AvaliacaoController {
    
    @GetMapping("/escolher-filmes")
    public String mostrarAvaliacoes(){
        return "mostrar-avaliacoes";
    }
}
