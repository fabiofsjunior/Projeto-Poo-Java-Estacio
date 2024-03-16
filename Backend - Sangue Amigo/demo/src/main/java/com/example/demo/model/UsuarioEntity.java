package com.example.demo.model;

import com.example.demo.service.enumeradores.TipoUsuario;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;



/*
ENTIDADE É A REPRESENTAÇÃO ORIENTADA A OBJETO DAS TABELAS DO BANCO DE DADOS
 */

@Entity
@Data
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(schema = "public", name = "usuarios")
public class UsuarioEntity {
    @Id
    @PrimaryKeyJoinColumn(name = "id_usuario")
    @JsonProperty("_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_usuario;

    @Column(name = "nomeCompleto", length = 255, nullable = false)
    private String nomeCompleto;
    @Column(name = "login", length = 255, nullable = false)
    private String login;
    @Column(name = "senha", length = 255, nullable = false)
    private String senha;
    @Column(name = "endereco", length = 255, nullable = false)
    private String endereco;
    @Column(name = "telefone", length = 255, nullable = false)
    private String telefone;
    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_usuario", length = 255, nullable = false)
    private TipoUsuario tipoUsuario;

    //Chave Estrangeira, ID_PESSOA_FISICA
    /* @OneToOne(
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
    targetEntity = PessoaFisicaEntity.class)*/

   /* @JoinColumn(name = "fkIdPessoaFisica")
    private PessoaFisicaEntity fkIdPessoaFisica; */



}
