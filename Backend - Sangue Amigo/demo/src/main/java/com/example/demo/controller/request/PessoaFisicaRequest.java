package com.example.demo.controller.request;

import com.example.demo.model.UsuarioEntity;
import com.example.demo.service.enumeradores.DoadorMedula;
import com.example.demo.service.enumeradores.FatorSanguineo;
import com.example.demo.service.enumeradores.GrauPrioridade;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.util.Date;

@Data
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PessoaFisicaRequest {


    private Long idPessoaFisica;
    private UsuarioEntity fkPessoaFisica;
    private String cpf;

    @JsonFormat(shape = JsonFormat.Shape.ANY, pattern = "yyyy-MM-dd")
    private Date dataNascimento;
    private FatorSanguineo fatorSanguineo;
    @JsonFormat(shape = JsonFormat.Shape.ANY, pattern = "yyyy-MM-dd")
    private Date dataUltimaDoacao;
    private DoadorMedula doadorMedula;
    private boolean restricao;
    private GrauPrioridade grauPrioridade;


}
