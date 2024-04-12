package com.example.demo.controller;

import com.example.demo.service.enumeradores.TipoUsuario;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
}


/* MODELO DE CLASSE DE DADOS QUE SERÁ RECEBIDO PELO FRONT ATRAVÉS DOS CONTROLLERS
 TRATADO PELO SERVICE QUE PROCESSA E RETORNA PARA O USUÁRIO PELOS CONTROLLERS
 */