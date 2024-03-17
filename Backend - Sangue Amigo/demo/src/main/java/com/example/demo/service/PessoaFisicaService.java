package com.example.demo.service;

import com.example.demo.controller.request.PessoaFisicaRequest;
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

    public PessoaFisicaEntity addPessoaFisica(PessoaFisicaRequest pessoaFisicaRequest) {
        var dadosPessoaFisica = PessoaFisicaEntity.builder()
                .idPessoaFisica(pessoaFisicaRequest.getIdPessoaFisica())
                .fkPessoaFisica(pessoaFisicaRequest.getFkPessoaFisica())
                .cpf(pessoaFisicaRequest.getCpf())
                .dataNascimento(pessoaFisicaRequest.getDataNascimento())
                .dataUltimaDoacao(pessoaFisicaRequest.getDataUltimaDoacao())
                .fatorSanguineo(pessoaFisicaRequest.getFatorSanguineo())
                .grauPrioridade(pessoaFisicaRequest.getGrauPrioridade())
                .restricao(pessoaFisicaRequest.isRestricao()).build();
        var pessoaFisicaCriada = this.pessoaFisicaRepository.save(dadosPessoaFisica);
        return(PessoaFisicaEntity) pessoaFisicaCriada;
    }
}
