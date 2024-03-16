package com.example.demo.service;

import com.example.demo.model.InstituicaoEntity;
import com.example.demo.repository.InstituicaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstituicaoService {

    @Autowired
    private InstituicaoRepository instituicaoRepository;


    public List<InstituicaoEntity> listarInstituicao(){
        List<InstituicaoEntity> instituicaoNoBanco = this.instituicaoRepository.findAll();
        return instituicaoNoBanco;
    }
}
