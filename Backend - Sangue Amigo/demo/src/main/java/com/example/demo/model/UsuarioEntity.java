package com.example.demo.model;

import com.example.demo.service.enumeradores.TipoUsuario;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Data
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(schema = "public", name = "usuarios")
public class UsuarioEntity {
    @Id
    @Column(name = "id_usuario")
    @JsonProperty("_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_usuario;
    @Column(name = "nomeCompleto", length = 255)
    private String nomeCompleto;
    @Column(name = "login", length = 255)
    private String login;
    @Column(name = "senha", length = 255)
    private String senha;
    @Column(name = "endereco", length = 255)
    private String endereco;
    @Column(name = "telefone", length = 255)
    private String telefone;
    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_usuario", length = 255)
    private TipoUsuario tipoUsuario;
}
