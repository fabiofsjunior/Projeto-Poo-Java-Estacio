package com.example.demo.service;

import com.example.demo.model.PessoaFisicaEntity;
import com.example.demo.repository.PessoaFisicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaFisicaService {

    @Autowired
    private PessoaFisicaRepository pessoaFisicaRepository;



    public List<PessoaFisicaEntity> listarDoadoresPf() {
        List<PessoaFisicaEntity> doadoresNoBanco = this.pessoaFisicaRepository.findAll();
        return doadoresNoBanco;
    }

}
