package com.senai.ads.aula01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class alunoController {
    @GetMapping("/aluno/cadastro")
    public String cadastro() {
        return "cadastro";
    }
}
