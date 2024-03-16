package com.example.demo.controller;

import com.example.demo.model.PessoaFisicaEntity;
import com.example.demo.service.PessoaFisicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
@CrossOrigin(origins = "*")
public class PessoaFisicaController {

    @Autowired
    private PessoaFisicaService pessoaFisicaService;

    @GetMapping("/api/pessoafisica")
    public List<PessoaFisicaEntity> buscarUsuario() {
        return pessoaFisicaService.listarDoadoresPf();
    }

}
