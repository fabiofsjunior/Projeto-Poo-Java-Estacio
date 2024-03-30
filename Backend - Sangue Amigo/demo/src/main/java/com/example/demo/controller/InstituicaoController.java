package com.example.demo.controller;

import com.example.demo.model.InstituicaoEntity;
import com.example.demo.model.PessoaFisicaEntity;
import com.example.demo.service.InstituicaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
@CrossOrigin(origins = "*")
public class InstituicaoController {

    @Autowired
    private InstituicaoService instituicaoService;


    @GetMapping("/api/instituicao")
    public List<InstituicaoEntity> buscarInstituicao(){
        return instituicaoService.listarInstituicao();

    }
}
