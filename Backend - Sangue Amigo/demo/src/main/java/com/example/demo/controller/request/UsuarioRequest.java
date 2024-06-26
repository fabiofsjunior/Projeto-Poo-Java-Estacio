package com.example.demo.controller.request;

import com.example.demo.model.PessoaFisicaEntity;
import lombok.*;

@Data
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioRequest {

    private String nomeCompleto;
    private String login;
    private String senha;
    private String endereco;
    private String telefone;
    private String tipoUsuario;
    private PessoaFisicaEntity pessoaFisicaEntity;


}


/* MODELO DE CLASSE DE DADOS QUE SERÁ RECEBIDO PELO FRONT ATRAVÉS DOS CONTROLLERS
 TRATADO PELO SERVICE QUE PROCESSA E RETORNA PARA O USUÁRIO PELOS CONTROLLERS
 */