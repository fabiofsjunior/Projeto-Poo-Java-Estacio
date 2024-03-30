package com.example.demo.controller;

import com.example.demo.controller.request.PessoaFisicaRequest;
import com.example.demo.controller.request.UsuarioRequest;
import com.example.demo.model.PessoaFisicaEntity;
import com.example.demo.model.UsuarioEntity;
import com.example.demo.service.PessoaFisicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/pessoafisica")
@CrossOrigin(origins = "*")
public class PessoaFisicaController {

    @Autowired
    private PessoaFisicaService pessoaFisicaService;

    @GetMapping
    public List<PessoaFisicaEntity> buscarUsuario() {
        return pessoaFisicaService.listarDoadoresPf();
    }

    @PostMapping
    public PessoaFisicaEntity cadastrarPessoaFisica(@RequestBody PessoaFisicaRequest pessoaFisicaRequest){
        return pessoaFisicaService.addPessoaFisica(pessoaFisicaRequest);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public PessoaFisicaEntity alterarUsuario(@PathVariable Long id, @RequestBody PessoaFisicaRequest pessoaFisicaRequest) {
        return pessoaFisicaService.alterarPessoaFisica(id, pessoaFisicaRequest);

    }

    @DeleteMapping("/{id}")
    public String deletarPessoaFisica(@PathVariable Long id) {
        pessoaFisicaService.deletarPessoaFisica(id);
        return "Usuário deletado com sucesso!";
    }
}
