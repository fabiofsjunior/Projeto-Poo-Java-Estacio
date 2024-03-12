package com.example.demo.controllers;

import com.example.demo.model.UsuarioEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.repository.UsuarioRepository;

import java.util.List;

@RestController
@RequestMapping
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping("api/usuario")
    public List<UsuarioEntity> buscarUsuario(){ return usuarioRepository.findAll();}
}
