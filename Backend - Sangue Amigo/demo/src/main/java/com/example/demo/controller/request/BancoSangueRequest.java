package com.example.demo.controller.request;

import com.example.demo.model.InstituicaoEntity;
import com.example.demo.service.enumeradores.FatorSanguineo;
import lombok.*;

import java.text.DateFormat;

@Data
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BancoSangueRequest {


    private Long idBancoSangue;
    private FatorSanguineo fatorSanguineo;
    private Integer quantidade;
    private DateFormat validade;
    private InstituicaoEntity fkBancoSangue;

}
