package com.example.demo.service;

import com.example.demo.model.BancoSangueEntity;
import com.example.demo.repository.BancoSangueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BancoSangueService {

    @Autowired
    private BancoSangueRepository bancoSangueRepository;

    public List<BancoSangueEntity> listarBancoSangue(){
        List<BancoSangueEntity> bancoDeSangueNoBanco = this.bancoSangueRepository.findAll();
    return bancoDeSangueNoBanco;
    }
}
