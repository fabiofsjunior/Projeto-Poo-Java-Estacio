package com.example.demo.controller;

import com.example.demo.controller.request.UsuarioRequest;
import com.example.demo.model.UsuarioEntity;
import com.example.demo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/*
CAMADA DE INTERCEPTAÇÃO DE DADOS DO FRONT, ENCAMINHADA PARA O PRÓXIMO NÍVEL DE CAMADA (SERVICE)
 */

@RestController
@RequestMapping
@CrossOrigin(origins = "*")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/api/usuario")
    public List<UsuarioEntity> buscarUsuario() {
        return usuarioService.listarUsuarios();
    }

    @PostMapping("/api/usuario")
    @ResponseStatus(HttpStatus.CREATED)
    public UsuarioEntity cadastrarUsuario(@RequestBody UsuarioRequest usuarioRequest) {
        return usuarioService.addUsuario(usuarioRequest);
    }

    @PutMapping("/api/usuario/{id}")
    @ResponseStatus(HttpStatus.OK)
    public UsuarioEntity alterarUsuario(@PathVariable Long id, @RequestBody UsuarioRequest usuarioRequest){
        return usuarioService.alterarUsuario(id, usuarioRequest);
    }

    @DeleteMapping("/api/usuario/{id}")
    public String deletarUsuario(@PathVariable Long id){
        usuarioService.deletarUsuario(id);
        return "Usuário deletado com sucesso!";
    }

}
