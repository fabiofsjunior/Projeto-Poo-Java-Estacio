package com.example.demo.controller;

import com.example.demo.service.enumeradores.DoadorMedula;
import com.example.demo.service.enumeradores.FatorSanguineo;
import com.example.demo.service.enumeradores.GrauPrioridade;
import lombok.*;

import java.text.DateFormat;
@Data
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PessoaFisicaRequest {


    private Long idPessoaFisica;
    private Long fkIdUsuario;
    private String cpf;
    private DateFormat dataNascimento;
    private FatorSanguineo fatorSanguineo;
    private DateFormat dataUltimaDoacao;
    private DoadorMedula doadorMedula;
    private boolean restricao;
    private GrauPrioridade grauPrioridade;
}
