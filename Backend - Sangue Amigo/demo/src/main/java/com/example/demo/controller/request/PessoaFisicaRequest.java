package com.example.demo.controller.request;

import com.example.demo.model.UsuarioEntity;
import com.example.demo.service.enumeradores.DoadorMedula;
import com.example.demo.service.enumeradores.FatorSanguineo;
import com.example.demo.service.enumeradores.GrauPrioridade;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
    private String cpf;
    @JsonFormat(shape = JsonFormat.Shape.ANY, pattern = "dd-MM-yyyy")
    private Date dataNascimento;
    @Enumerated(value = EnumType.STRING)
    private FatorSanguineo fatorSanguineo;
    @JsonFormat(shape = JsonFormat.Shape.ANY, pattern = "dd-MM-yyyy")
    private Date dataUltimaDoacao;
    @Enumerated(value = EnumType.STRING)
    private DoadorMedula doadorMedula;
    private boolean restricao;
    @Enumerated(value = EnumType.STRING)
    private GrauPrioridade grauPrioridade;


}
