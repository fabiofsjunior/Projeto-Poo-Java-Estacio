package model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import services.enumeradores.TipoUsuario;

@Entity
@Data
@Getter
@Builder
@NoArgsConstructor
@Table(schema = "public", name = "cartao")
public class UsuarioEntity {

    @Id
    @Column(name = "id_usuario")
    @JsonProperty("_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_usuario;
    @Column(name = "nome_completo", length = 255)
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
    private Enum<TipoUsuario> tipo_usuario;


    public UsuarioEntity(Long id_usuario, String nomeCompleto, String login, String senha, String endereco, String telefone, Enum<TipoUsuario> tipo_usuario) {
        this.id_usuario = id_usuario;
        this.nomeCompleto = nomeCompleto;
        this.login = login;
        this.senha = senha;
        this.endereco = endereco;
        this.telefone = telefone;
        this.tipo_usuario = tipo_usuario;
    }
}
