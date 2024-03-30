package com.example.demo.controller.request;

import lombok.*;

@Data
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class InstituicaoRequest {

    private Long idInstituicao;
    private String cnpj;
    private String nomeFantasia;

}
