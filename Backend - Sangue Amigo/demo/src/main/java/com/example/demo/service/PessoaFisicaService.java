package com.example.demo.service;

import com.example.demo.controller.request.PessoaFisicaRequest;
import com.example.demo.model.PessoaFisicaEntity;
import com.example.demo.model.UsuarioEntity;
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
                .dataNascimento(pessoaFisicaRequest.getDataNascimento().toString())
                .fatorSanguineo(pessoaFisicaRequest.getFatorSanguineo())
                .dataUltimaDoacao(pessoaFisicaRequest.getDataUltimaDoacao().toString())
                .doadorMedula(pessoaFisicaRequest.getDoadorMedula())
                .restricao(pessoaFisicaRequest.isRestricao())
                .grauPrioridade(pessoaFisicaRequest.getGrauPrioridade()).build();
        var pessoaFisicaCriada = this.pessoaFisicaRepository.save(dadosPessoaFisica);
        return(PessoaFisicaEntity) pessoaFisicaCriada;
    }

    public PessoaFisicaEntity alterarPessoaFisica(Long id, PessoaFisicaRequest pessoaFisicaRequest) {
        var dadosAlteradosUsuario = pessoaFisicaRepository.save(PessoaFisicaEntity.builder()
                .idPessoaFisica(id)
                .fkPessoaFisica(pessoaFisicaRequest.getFkPessoaFisica())
                .fatorSanguineo(pessoaFisicaRequest.getFatorSanguineo())
                .dataNascimento(pessoaFisicaRequest.getDataNascimento().toString())
                .cpf(pessoaFisicaRequest.getCpf())
                .dataUltimaDoacao(pessoaFisicaRequest.getDataUltimaDoacao().toString())
                .restricao(pessoaFisicaRequest.isRestricao())
                .fatorSanguineo(pessoaFisicaRequest.getFatorSanguineo())
                .doadorMedula(pessoaFisicaRequest.getDoadorMedula()).build());
        return dadosAlteradosUsuario;
    }

    public void deletarPessoaFisica(Long id) {
        pessoaFisicaRepository.deleteById(id);
    }


}
